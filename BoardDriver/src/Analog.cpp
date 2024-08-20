#include "Analog.h"

void Analog::parse(std::istream &wireData) {
	//TODO
}

void Analog::wireData(std::ostream &wireData) {
	throw std::runtime_error("Write not implemented");
}

MessageType getType() {
	return MessageType::ANALOG;
}

