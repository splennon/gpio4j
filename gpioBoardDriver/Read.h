#ifndef READ_H
#define READ_H

#include <iostream>
#include <vector>
#include <stdexcept>
#include <cstdint>
#include <algorithm>

#include "LineByte.h"
#include "MessageType.h"

class Read {
public:
    Read() : pin_(0) {}
    Read(int pin) : pin_(pin) {}

    Read& parse(const std::vector<uint8_t>& wireData);

    std::vector<uint8_t> wireData();

    MessageType getType();

    int getPin();

    void setPin(int pin);

    Read withPin(int pin);

private:
    int pin_;
};

#endif