#include "Config.h"

void Config::parse(std::vector<uint8_t> wireData) {
	//TODO
}

void Config::wireData(std::vector<uint8_t> wireData) {
	throw std::runtime_error("Write not implemented");
}

MessageType Config::getType() {
	return MessageType::CONFIG;
}
