#include "Notify.h"

class Notify : public Message {
private:
    int pin;
    std::unique_ptr<Message> data;
    int64_t timestamp;

public:
    Notify() = default;
    Notify(int pin, std::unique_ptr<Message> data, int64_t timestamp)
        : pin(pin), data(std::move(data)), timestamp(timestamp) {}

    Notify& parse(std::istream& wireData) override {
        std::vector<uint8_t> buffer(2);
        wireData.read(reinterpret_cast<char*>(buffer.data()), 2);
        pin = LineByte(buffer).asInt();

        int messageTypeId = wireData.get();
        auto messageType = MessageType::forId(messageTypeId);
        if (!messageType) {
            throw std::runtime_error("Invalid message type");
        }
        data = messageType->newInstance();
        data->parse(wireData);

        int64_t l = 0;
        for (int i = 0; i < 8; ++i) {
            wireData.read(reinterpret_cast<char*>(buffer.data()), 2);
            l = (l << 8) | LineByte(buffer).asInt();
        }
        timestamp = l;

        return *this;
    }

    std::vector<uint8_t> wireData() const override {
        if (pin == 0) throw std::runtime_error("Pin is not set when generating wire data");
        if (!data) throw std::runtime_error("Data is not set when generating wire data");
        if (timestamp == 0) throw std::runtime_error("Timestamp is not set when generating wire data");

        std::vector<uint8_t> result;
        auto pinBytes = LineByte(pin).getHiLo();
        result.insert(result.end(), pinBytes.begin(), pinBytes.end());

        result.push_back(static_cast<uint8_t>(data->getType().getId()));

        auto dataBytes = data->wireData();
        result.insert(result.end(), dataBytes.begin(), dataBytes.end());

        for (int i = 7; i >= 0; --i) {
            auto byteValue = static_cast<uint8_t>((timestamp >> (i * 8)) & 0xFF);
            auto timestampBytes = LineByte(byteValue).getHiLo();
            result.insert(result.end(), timestampBytes.begin(), timestampBytes.end());
        }

        return result;
    }

    MessageType getType() const override {
        return MessageType::NOTIFY;
    }

    // Getters and setters
    int getPin() const { return pin; }
    void setPin(int p) { pin = p; }

    const Message* getData() const { return data.get(); }
    void setData(std::unique_ptr<Message> d) { data = std::move(d); }

    int64_t getTimestamp() const { return timestamp; }
    void setTimestamp(int64_t t) { timestamp = t; }
};
