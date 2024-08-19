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
    Config() : pin(0), pinType(PinType::CONFIG), interrupt(false);
    Config(int pin, PinType pinType, bool interrupt) : pin(pin), pinType(pinType), interrupt(interrupt);

    Config* parse(std::istream& wireData);

    std::vector<uint8_t> wireData();

    PinType getType();

private:
    int pin;
    PinType pinType;
    bool interrupt;
};

#endif