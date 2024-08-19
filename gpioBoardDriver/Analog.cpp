#include "Analog.h"

class Analog : public Message {
public:
    Analog() : value(0) {}
    Analog(int value) : value(value) {}

    Analog* parse(std::istream& wireData) override {
        if (wireData.rdbuf()->in_avail() < 2) throw std::runtime_error("Incorrect number of bytes");

        uint8_t bytes[2];
        wireData.read(reinterpret_cast<char*>(bytes), 2);
        value = LineByte((bytes[0] << 8) | bytes[1]).asInt();

        return this;
    }

    std::vector<uint8_t> wireData() override {
        if (!value) throw std::runtime_error("Value is not set when generating wire data");

        LineByte lineByte(value);
        return lineByte.getHiLo();
    }

    MessageType getType() override {
        return MessageType::ANALOG;
    }

private:
    int value;
};
