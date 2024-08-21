#include "Notify.h"

void Notify::parse(std::vector<uint8_t> wireData) {
	throw std::runtime_error("Read not implemented");
}

void Notify::wireData(std::vector<uint8_t> wireData) {

	//TODO
}

MessageType Notify::getType() {
	return MessageType::NOTIFY;
}

// Getters and setters
int Notify::getPin() {
	return pin;
}
void Notify::setPin(uint8_t p) {
	pin = p;
}

Message Notify::getData() {
	return data.get();
}

void Notify::setData(Message d) {
	data = d;
}

int64_t Notify::getTimestamp() {
	return timestamp;
}

void Notify::setTimestamp(int64_t t) {
	timestamp = t;
}
