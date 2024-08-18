#ifndef DIGITAL_H
#define DIGITAL_H

#include <iostream>
#include <stdexcept>
#include <vector>

#include "MessageType.h"
#include "Message.h"

class Digital : public Message {
private:
    bool value;

public:
    Digital() : value(false) {}
    Digital(bool val) : value(val) {}

    Digital* parse(std::istream& wireData) override {
        if (wireData.peek() == std::istream::traits_type::eof()) {
            throw std::invalid_argument("Incorrect number of bytes");
        }

        uint8_t byte;
        wireData.read(reinterpret_cast<char*>(&byte), 1);
        value = byte != 0;
        return this;
    }

    std::vector<uint8_t> wireData() override {
        if (value == false && value != true) {
            throw std::invalid_argument("Value is not set when generating wire data");
        }

        return { static_cast<uint8_t>(value ? 0b00000001 : 0b00000000) };
    }

    MessageType getType() override {
        return MessageType::DIGITAL;
    }
};

#endif