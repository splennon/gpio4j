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

	virtual MessageType getType() = 0;

	virtual void parse(std::istream &wireData) = 0;

	virtual void wireData(std::ostream &wireData) = 0;

};

#endif
