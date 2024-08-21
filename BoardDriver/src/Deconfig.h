#ifndef DECONFIG_H
#define DECONFIG_H

#include <iostream>
#include <vector>
#include <stdexcept>
#include <cstdint>

#include "LineByte.h"
#include "MessageType.h"
#include "Message.h"

class Deconfig : public Message {

private:
  int pin;

public:

  Deconfig(int pin) : pin(pin) {};

  void parse(std::vector<uint8_t> wireData);

  void wireData(std::vector<uint8_t> wireData);

  MessageType getType();
};

#endif
