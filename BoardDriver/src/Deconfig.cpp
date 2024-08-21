#include "Deconfig.h"

void Deconfig::parse(std::vector<uint8_t> wireData) {
	//TODO
}

void Deconfig::wireData(std::vector<uint8_t> wireData) {
	throw std::runtime_error("Write not implemented");
}

MessageType Deconfig::getType() {
	return MessageType::DECONFIG;
}

