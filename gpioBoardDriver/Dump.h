#ifndef DUMP_H
#define DUMP_H

#include <iostream>
#include <vector>
#include <cstdint>
#include <memory>

#include "MessageType.h"
#include "Message.h"

class Dump : public Message {
public:
    Dump() = default;

    std::unique_ptr<Message> parse(const std::vector<uint8_t>& wireData);

    std::vector<uint8_t> wireData();

    MessageType getType();

    bool operator==(const Dump& other);

    bool operator!=(const Dump& other);
};

#endif