#include "Dump.h"

  void Dump::parse(std::istream& wireData) {}

  void Dump::wireData(std::ostream &wireData) {
  	throw std::runtime_error("Write not implemented");
  }

  MessageType Dump::getType() {
    return MessageType::DUMP;
  }
