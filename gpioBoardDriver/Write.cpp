#include "Write.h"

class Write : public Message {
private:
    int pin;
    std::unique_ptr<Message> data;
    int64_t timestamp;

public:
    Write() = default;
    Write(int pin, std::unique_ptr<Message> data, int64_t timestamp)
        : pin(pin), data(std::move(data)), timestamp(timestamp) {}

    Write(const Write& other)
        : pin(other.pin), data(other.data ? other.data->clone() : nullptr), timestamp(other.timestamp) {}

    Write& operator=(const Write& other) {
        if (this != &other) {
            pin = other.pin;
            data = other.data ? other.data->clone() : nullptr;
            timestamp = other.timestamp;
        }
        return *this;
    }

    Write(Write&&) = default;
    Write& operator=(Write&&) = default;

    ~Write() override = default;

    Write parse(std::vector<uint8_t>& wireData) override {
        if (wireData.size() < 2) {
            throw std::runtime_error("Insufficient data");
        }

        pin = LineByte(std::vector<uint8_t>(wireData.begin(), wireData.begin() + 2)).asInt();
        wireData.erase(wireData.begin(), wireData.begin() + 2);

        if (wireData.empty()) {
            throw std::runtime_error("Insufficient data for message type");
        }

        uint8_t messageTypeId = wireData[0];
        wireData.erase(wireData.begin());

        auto messageType = MessageType::forId(messageTypeId);
        if (!messageType) {
            throw std::runtime_error("Invalid message type");
        }

        data = messageType->newInstance();
        data = data->parse(wireData);

        if (wireData.size() < 16) {
            throw std::runtime_error("Insufficient data for timestamp");
        }

        timestamp = 0;
        for (int i = 0; i < 8; ++i) {
            LineByte lb(std::vector<uint8_t>(wireData.begin(), wireData.begin() + 2));
            timestamp = (timestamp << 8) | lb.asInt();
            wireData.erase(wireData.begin(), wireData.begin() + 2);
        }

        return *this;
    }

    std::vector<uint8_t> wireData() const override {
        if (pin == 0 || !data || timestamp == 0) {
            throw std::runtime_error("Incomplete data when generating wire data");
        }

        std::vector<uint8_t> result;
        auto pinBytes = LineByte(pin).getHiLo();
        result.insert(result.end(), pinBytes.begin(), pinBytes.end());

        result.push_back(data->getType().getId());

        auto dataBytes = data->wireData();
        result.insert(result.end(), dataBytes.begin(), dataBytes.end());

        for (int i = 7; i >= 0; --i) {
            auto timestampByte = LineByte((timestamp >> (i * 8)) & 0xFF).getHiLo();
            result.insert(result.end(), timestampByte.begin(), timestampByte.end());
        }

        return result;
    }

    MessageType getType() const override {
        return MessageType::WRITE;
    }

    // Getters and setters
    int getPin() const { return pin; }
    void setPin(int p) { pin = p; }

    const Message* getData() const { return data.get(); }
    void setData(std::unique_ptr<Message> d) { data = std::move(d); }

    int64_t getTimestamp() const { return timestamp; }
    void setTimestamp(int64_t t) { timestamp = t; }

    // Clone method for polymorphic copy
    std::unique_ptr<Message> clone() const override {
        return std::make_unique<Write>(*this);
    }
};
