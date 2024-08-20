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

    Message parse(const std::vector<uint8_t>& wireData);

    void parse(std::istream& wireData);

    void wireData(std::ostream& wireData);

    MessageType getType();
};

#endif
