#include "Deconfig.h"

class Deconfig : public Message {
public:
    Deconfig() : pin(0) {}
    Deconfig(int pin) : pin(pin) {}

    Deconfig* parse(std::istream& wireData) override {
        if (wireData.rdbuf()->in_avail() < 2) throw std::runtime_error("Incorrect number of bytes");

        std::vector<uint8_t> bytes(2);
        wireData.read(reinterpret_cast<char*>(bytes.data()), 2);
        pin = LineByte(bytes).asInt();
        return this;
    }

    std::vector<uint8_t> wireData() override {
        if (!pin) throw std::runtime_error("Pin is not set when generating wire data");

        LineByte lineByte(pin);
        return lineByte.getHiLo();
    }

    MessageType getType() override {
        return MessageType::DECONFIG;
    }

private:
    int pin;
};
