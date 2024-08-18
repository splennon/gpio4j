#ifndef CONFIG_H
#define CONFIG_H

#include <iostream>
#include <vector>
#include <stdexcept>
#include <cstdint>
#include <cstring>

#include "LineByte.h"
#include "MessageType.h"
#include "Message.h"

class Config : public Message {
public:
    Config() : pin(0), pinType(PinType::CONFIG), interrupt(false) {}
    Config(int pin, PinType pinType, bool interrupt) : pin(pin), pinType(pinType), interrupt(interrupt) {}

    Config* parse(std::istream& wireData) override {
        if (wireData.rdbuf()->in_avail() < 4) throw std::runtime_error("Incorrect number of bytes");

        uint8_t pinBytes[2];
        wireData.read(reinterpret_cast<char*>(pinBytes), 2);
        pin = LineByte((pinBytes[0] << 8) | pinBytes[1]).asInt();

        uint8_t pinTypeByte;
        wireData.read(reinterpret_cast<char*>(&pinTypeByte), 1);
        pinType = static_cast<PinType>(pinTypeByte); // Adjust according to your PinType implementation

        uint8_t interruptByte;
        wireData.read(reinterpret_cast<char*>(&interruptByte), 1);
        interrupt = interruptByte != 0;

        return this;
    }

    std::vector<uint8_t> wireData() override {
        if (pin == 0) throw std::runtime_error("Pin is not set when generating wire data");
        if (pinType == PinType::CONFIG) throw std::runtime_error("Pin Type is not set when generating wire data");

        std::vector<uint8_t> result;
        auto hiLo = LineByte(pin).getHiLo();
        result.insert(result.end(), hiLo.begin(), hiLo.end());
        result.push_back(static_cast<uint8_t>(static_cast<int>(pinType))); // Adjust according to your PinType implementation
        result.push_back(interrupt ? static_cast<uint8_t>(1) : static_cast<uint8_t>(0));
        return result;
    }

    PinType getType() override {
        return PinType::CONFIG;
    }

private:
    int pin;
    PinType pinType;
    bool interrupt;
};

#endif