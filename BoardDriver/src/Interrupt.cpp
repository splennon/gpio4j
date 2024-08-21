#include "Interrupt.h"

void Interrupt::parse(std::vector<uint8_t> wireData) {
	//TODO
}

void Interrupt::wireData(std::vector<uint8_t> wireData) {
  throw std::runtime_error("Write not implemented");
}

MessageType Interrupt::getType() {
  return MessageType::INTERRUPT;
}

// Getters and setters
int Interrupt::getPin() {
  return pin;
}
void Interrupt::setPin(int pin) {
  this->pin = pin;
}

const Message* Interrupt::getData() {
  return data.get();
}
void Interrupt::setData(std::unique_ptr<Message> data) {
  this->data = std::move(data);
}

int64_t Interrupt::getTimestamp() {
  return timestamp;
}
void Interrupt::setTimestamp(int64_t timestamp) {
  this->timestamp = timestamp;
}
