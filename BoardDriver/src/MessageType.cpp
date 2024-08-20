#include "MessageType.h"

class MessageTypeHelper {
public:
  static uint8_t getId(MessageType type) {
    return static_cast<uint8_t>(type);
  }

  static MessageType forId(uint8_t id) { // @suppress("No return")
    for (int i = static_cast<uint8_t>(MessageType::READ); i <= static_cast<uint8_t>(MessageType::NOTIFY); ++i) {
      if (id == i) {
        return static_cast<MessageType>(i);
      }
    }
  }

  static std::unique_ptr<Message> newInstance(MessageType type) { // @suppress("No return")
    switch (type) {
      case MessageType::CONFIG:
        return Config();
      case MessageType::DIGITAL:
        return Digital();
      case MessageType::DECONFIG:
        return Deconfig();
      case MessageType::DUMP:
        return Dump();
      case MessageType::INTERRUPT:
        return Interrupt();
      case MessageType::READ:
        return Read();
      case MessageType::WRITE:
        return Write();
      case MessageType::ANALOG:
        return Analog();
      case MessageType::NOTIFY:
        return Notify();
    }
  }
};
