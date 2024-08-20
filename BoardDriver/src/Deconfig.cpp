ƒ
#include "Deconfig.h"

void Deconfig::parse(std::istream& wireData) {
	//TODO
}

void Deconfig::wireData(std::ostream &wireData) {
	throw std::runtime_error("Write not implemented");
}

MessageType Deconfig::getType() {
	return MessageType::DECONFIG;
}

