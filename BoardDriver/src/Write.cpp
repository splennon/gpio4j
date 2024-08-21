#include "Write.h"

void Write::parse(std::istream &wireData) {
//TODO
}

void Write::wireData(std::vector<uint8_t> wireData) {
	throw std::runtime_error("Write not implemented");
}

MessageType Write::getType() {
	return MessageType::WRITE;
}

// Getters and setters
int Write::getPin() {
	return pin;
}
void Write::setPin(int p) {
	pin = p;
}

const Message* Write::getData() {
	return data.get();
}
void Write::setData(Message d) {
	data = std::move(d);
}

int64_t Write::getTimestamp() {
	return timestamp;
}
void Write::setTimestamp(int64_t t) {
	timestamp = t;
}

