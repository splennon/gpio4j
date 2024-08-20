#include "Write.h"

Write::Write(int pin, std::unique_ptr<Message> data, int64_t timestamp) :
		pin(pin), data(std::move(data)), timestamp(timestamp) {
}

void Write::parse(std::istream &wireData) {
//TODO
}

void Write::wireData(std::ostream &wireData) {
	throw std::runtime_error("Write not implemented");
}

MessageType getType() {
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
void Write::setData(std::unique_ptr<Message> d) {
	data = std::move(d);
}

int64_t Write::getTimestamp() {
	return timestamp;
}
void Write::setTimestamp(int64_t t) {
	timestamp = t;
}

