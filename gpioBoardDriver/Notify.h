#ifndef NOTIFY_H
#define NOTIFY_H

#include <iostream>
#include <vector>
#include <memory>
#include <stdexcept>
#include <cstdint>
#include <algorithm>

#include "Message.h"
#include "LineByte.h"
#include "MessageType.h"

class Notify : public Message {
private:
    int pin;
    std::unique_ptr<Message> data;
    int64_t timestamp;

public:
    Notify() = default;
    Notify(int pin, std::unique_ptr<Message> data, int64_t timestamp)
        : pin(pin), data(std::move(data)), timestamp(timestamp);

    Notify& parse(std::istream& wireData);

    std::vector<uint8_t> wireData();

    MessageType getType();

    // Getters and setters
    int getPin();
    void setPin(int p);

    const Message* getData();
    void setData(std::unique_ptr<Message> d);

    int64_t getTimestamp();
    void setTimestamp(int64_t t);
};

#endif