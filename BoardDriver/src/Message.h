#ifndef MESSAGE_H
#define MESSAGE_H

#include <ostream>
#include <iostream>
#include <vector>
#include <cstdint>
#include <memory>

#include "MessageType.h"

class Message {
public:

	virtual ~Message() {};

	virtual MessageType getType() = 0;

	virtual void parse(std::vector<uint8_t> wireData) = 0;

	virtual void wireData(std::vector<uint8_t> wireData) = 0;

};

#endif
