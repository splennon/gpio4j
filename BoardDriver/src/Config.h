#ifndef CONFIG_H
#define CONFIG_H

#include <iostream>
#include <vector>
#include <stdexcept>
#include <cstdint>
#include <cstring>

#include "LineByte.h"
#include "MessageType.h"
#include "PinType.h"
#include "Message.h"

class Config : public Message {
private:

  int pin;
  PinType pinType;
  bool interrupt;

public:

  Config(int pin, PinType pinType, bool interrupt)
    : pin(pin), pinType(pinType), interrupt(interrupt) {};

  void parse(std::istream& wireData);

  void wireData(std::ostream& wireData);

  PinType getType();
};

#endif
