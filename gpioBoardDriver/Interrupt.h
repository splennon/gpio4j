#ifndef INTERRUPT_H
#define INTERRUPT_H

#include <iostream>
#include <vector>
#include <memory>
#include <stdexcept>
#include <cstdint>
#include <algorithm>

#include "LineByte.h"
#include "MessageType.h"
#include "Message.h"

class Interrupt : public Message {
private:
    int pin;
    std::unique_ptr<Message> data;
    int64_t timestamp;

public:
    Interrupt() = default;
    Interrupt(int pin, std::unique_ptr<Message> data, int64_t timestamp)
        : pin(pin), data(std::move(data)), timestamp(timestamp);

    Interrupt& parse(std::istream& wireData);

    std::vector<uint8_t> wireData();

    MessageType getType();

    // Getters and setters
    int getPin();
    void setPin(int pin);

    const Message* getData();
    void setData(std::unique_ptr<Message> data);

    int64_t getTimestamp();
    void setTimestamp(int64_t timestamp);
};

#endif