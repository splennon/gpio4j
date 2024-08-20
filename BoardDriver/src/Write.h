#ifndef WRITE_H
#define WRITE_H

#include <iostream>
#include <vector>
#include <memory>
#include <stdexcept>
#include <cstdint>
#include <algorithm>

#include "LineByte.h"
#include "MessageType.h"
#include "Message.h"

class Write : public Message {

private:
  int pin;
  std::unique_ptr<Message> data;
  int64_t timestamp;

public:

  Write(int pin, std::unique_ptr<Message> data, int64_t timestamp)
    : pin(pin), data(std::move(data)), timestamp(timestamp) {};

  void parse(std::istream& wireData);

  void wireData(std::ostream& wireData);

  MessageType getType();

  int getPin();
  void setPin(int p);

  const Message* getData();
  void setData(std::unique_ptr<Message> d);

  int64_t getTimestamp();
  void setTimestamp(int64_t t);
};

#endif
