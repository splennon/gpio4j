#include "Digital.h"

void Digital::parse(std::vector<uint8_t> wireData) {
	//TODO
}

void Digital::wireData(std::vector<uint8_t> wireData) {
	throw std::runtime_error("Write not implemented");
}

MessageType Digital::getType() {
	return MessageType::DIGITAL;
}

