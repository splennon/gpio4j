#ifndef ANALOG_H
#define ANALOG_H

#include <iostream>
#include <vector>
#include <stdexcept>
#include <cstdint>
#include <cstring>

#include "LineByte.h"
#include "MessageType.h"
#include "Message.h"

class Analog : public Message {
public:
    Analog() : value(0);
    Analog(int value) : value(value);

    Analog* parse(std::istream& wireData);

    std::vector<uint8_t> wireData();

    MessageType getType();

private:
    int value;
};

#endif