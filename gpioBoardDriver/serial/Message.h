#ifndef MESSAGE_H
#define MESSAGE_H

#include <iostream>
#include <vector>
#include <cstdint>
#include <memory>

#include "MessageType.h"

class Message {
public:
    virtual ~Message() = default;

    virtual std::unique_ptr<Message> parse(std::istream& wireData) = 0;
    
    virtual std::vector<uint8_t> wireData() const = 0;
    
    virtual MessageType getType() const = 0;
};

#endif