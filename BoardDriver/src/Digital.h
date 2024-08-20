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

  void parse(std::istream& wireData);

  void wireData(std::ostream& wireData);

  MessageType getType();
};

#endif
