#include "Notify.h"

void Notify::parse(std::istream &wireData) {
	throw std::runtime_error("Read not implemented");
}

void Notify::wireData(std::ostream &wireData) {

	//TODO
}

MessageType Notify::getType() {
	return MessageType::NOTIFY;
}

// Getters and setters
int Notify::getPin() {
	return pin;
}
void setPin(uint8_t p) {
	pin = p;
}

Message* Notify::getData() {
	return data.get();
}

void Notify::setData(std::unique_ptr<Message> d) {
	data = std::move(d);
}

int64_t Notify::getTimestamp() {
	return timestamp;
}

void Notify::setTimestamp(int64_t t) {
	timestamp = t;
}
