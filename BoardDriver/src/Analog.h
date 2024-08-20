#ifndef ANALOG_H
#define ANALOG_H

#include <iostream>
#include <vector>
#include <stdexcept>
#include <cstdint>
#include <cstring>

#include "LineByte.h"
#include "MessageType.h"
#include "Message.h"

class Analog : public Message {

private:
  uint8_t value;

public:

  Analog(uint8_t value)
     : value(value) {};

  void parse(std::istream& wireData);

  void wireData(std::ostream& wireData);

  MessageType getType();
};

#endif
