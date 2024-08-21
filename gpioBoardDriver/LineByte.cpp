#include "LineByte.h"

LineByte::LineByte(uint8_t b) {
	data = b;
}

LineByte::LineByte(uint8_t hi, uint8_t lo) {
	if ((hi & 0b11110000) != 0) {
		throw std::invalid_argument(
				"Hi byte contains more than four bits: "
						+ std::bitset<8>(hi).to_string());
	}

	if ((lo & 0b11110000) != 0) {
		throw std::invalid_argument(
				"Lo byte contains more than four bits: "
						+ std::bitset<8>(lo).to_string());
	}

	data = hi & 0b00001111;
	data = (data << 4) | (lo & 0b00001111);
}

uint8_t LineByte::asByte() {
	return data;
}

uint8_t LineByte::getHi() {
	return static_cast<uint8_t>((data & 0b11110000) >> 4);
}

uint8_t LineByte::getLo() {
	return static_cast<uint8_t>(data & 0b00001111);
}

std::vector<uint8_t> LineByte::getHiLo() {
	return {getHi(), getLo()};
}

std::string LineByte::toString() {
	return std::bitset<8>(data).to_string();
}
