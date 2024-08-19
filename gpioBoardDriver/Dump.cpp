#include "Dump.h"

class Dump : public Message {
public:
    Dump() = default;

    std::unique_ptr<Message> parse(const std::vector<uint8_t>& wireData) override {
        return std::make_unique<Dump>(*this);
    }

    std::vector<uint8_t> wireData() const override {
        return std::vector<uint8_t>();
    }

    MessageType getType() const override {
        return MessageType::DUMP;
    }

    // Implement comparison operators for equality
    bool operator==(const Dump& other) const {
        return true; // Since Dump has no data members, all instances are equal
    }

    bool operator!=(const Dump& other) const {
        return !(*this == other);
    }
};
