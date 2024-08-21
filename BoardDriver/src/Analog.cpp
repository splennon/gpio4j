#include "Analog.h"

void Analog::parse(std::vector<uint8_t> wireData) {
	//TODO
}

void Analog::wireData(std::vector<uint8_t> wireData) {
	throw std::runtime_error("Write not implemented");
}

MessageType Analog::getType() {
	return MessageType::ANALOG;
}

