#include "Dump.h"

  void Dump::parse(std::vector<uint8_t> wireData) {}

  void Dump::wireData(std::vector<uint8_t> wireData) {
  	throw std::runtime_error("Write not implemented");
  }

  MessageType Dump::getType() {
    return MessageType::DUMP;
  }
