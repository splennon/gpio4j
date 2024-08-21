#ifndef READ_H
#define READ_H

#include <iostream>
#include <vector>
#include <stdexcept>
#include <cstdint>
#include <algorithm>

#include "LineByte.h"
#include "MessageType.h"

class Read {
public:

  Read(uint8_t pin) : pin_(pin) {}

  void parse(std::vector<uint8_t> wireData);

  void wireData(std::vector<uint8_t> wireData);

  uint8_t getPin();

  void setPin(uint8_t pin);

  MessageType getType();

private:
  int pin_;
};

#endif
