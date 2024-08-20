#include "Digital.h"

void Digital::parse(std::istream &wireData) {
	//TODO
}

void Digital::wireData(std::ostream &wireData) {
	throw std::runtime_error("Write not implemented");
}

MessageType Digital::getType() {
	return MessageType::DIGITAL;
}

