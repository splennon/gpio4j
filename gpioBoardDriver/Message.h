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

    virtual std::unique_ptr<Message> parse(std::istream& wireData);
    
    virtual std::vector<uint8_t> wireData();
    
    virtual MessageType getType();
};

#endif