#ifndef DIGITAL_H
#define DIGITAL_H

#include <iostream>
#include <stdexcept>
#include <vector>

#include "MessageType.h"
#include "Message.h"

class Digital : public Message {
private:

  bool value;

public:

  Digital(bool val) : value(val) {};

  void parse(std::vector<uint8_t> wireData);

  void wireData(std::vector<uint8_t> wireData);

  MessageType getType();
};

#endif
