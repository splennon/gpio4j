#ifndef DECONFIG_H
#define DECONFIG_H

#include <iostream>
#include <vector>
#include <stdexcept>
#include <cstdint>

#include "LineByte.h"
#include "MessageType.h"
#include "Message.h"

class Deconfig : public Message {
public:
    Deconfig() : pin(0);
    Deconfig(int pin) : pin(pin);

    Deconfig* parse(std::istream& wireData);

    std::vector<uint8_t> wireData();

    MessageType getType();

private:
    int pin;
};

#endif