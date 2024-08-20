#ifndef MESSAGETYPE_H
#define MESSAGETYPE_H

#include <iostream>
#include <vector>
#include <optional>
#include <algorithm>
#include <memory>

#include "Message.h"

#include "Config.h"

enum MessageType {
  READ = 1,
  WRITE = 2,
  CONFIG = 3,
  DECONFIG = 4,
  DUMP = 5,
  DIGITAL = 6,
  ANALOG = 7,
  INTERRUPT = 8,
  NOTIFY = 9
};

class MessageTypeHelper {
public:

  static uint8_t getId(MessageType type);

  static MessageType forId(uint8_t id);

  static std::unique_ptr<Message> newInstance(MessageType type);
};

#endif
