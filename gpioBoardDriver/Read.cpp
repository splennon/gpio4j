#include "Read.h"

class Read {
public:
    Read() : pin_(0) {}
    Read(int pin) : pin_(pin) {}

    Read& parse(const std::vector<uint8_t>& wireData) {
        if (wireData.size() < 2) {
            throw std::runtime_error("Incorrect number of bytes");
        }

        pin_ = LineByte((wireData[0] << 8) | wireData[1]).asInt();
        return *this;
    }

    std::vector<uint8_t> wireData() const {
        if (pin_ == 0) {
            throw std::runtime_error("Pin is not set when generating wire data");
        }

        return LineByte(pin_).getHiLo();
    }

    MessageType getType() const {
        return MessageType::READ;
    }

    int getPin() const {
        return pin_;
    }

    void setPin(int pin) {
        pin_ = pin;
    }

    Read withPin(int pin) const {
        return Read(pin);
    }

private:
    int pin_;
};
