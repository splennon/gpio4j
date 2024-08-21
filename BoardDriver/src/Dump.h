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

    void parse(std::vector<uint8_t> wireData);

    void wireData(std::vector<uint8_t> wireData);

    MessageType getType();
};

#endif
