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

  void parse(std::istream& wireData);

  void wireData(std::ostream& wireData);

  MessageType getType();
};

#endif
