#include "Read.h"

void Read::parse(std::istream& wireData) {
	//TODO
}

void Read::wireData(std::ostream& wireData) {
  throw std::runtime_error("Write not implemented");
}

MessageType Read::getType() {
  return MessageType::READ;
}

uint8_t Read::getPin() {
  return pin_;
}

void Read::setPin(uint8_t pin) {
  pin_ = pin;
}
