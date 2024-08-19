#ifndef WRITE_H
#define WRITE_H

#include <iostream>
#include <vector>
#include <memory>
#include <stdexcept>
#include <cstdint>
#include <algorithm>

#include "LineByte.h"
#include "MessageType.h"
#include "Message.h"

class Write : public Message {
private:
    int pin;
    std::unique_ptr<Message> data;
    int64_t timestamp;

public:
    Write() = default;
    Write(int pin, std::unique_ptr<Message> data, int64_t timestamp)
        : pin(pin), data(std::move(data)), timestamp(timestamp);

    Write(const Write& other)
        : pin(other.pin), data(other.data ? other.data->clone() : nullptr), timestamp(other.timestamp);

    Write& operator=(const Write& other);

    Write(Write&&) = default;
    Write& operator=(Write&&) = default;

    ~Write() override = default;

    Write parse(std::vector<uint8_t>& wireData);

    std::vector<uint8_t> wireData();

    MessageType getType();

    // Getters and setters
    int getPin();
    void setPin(int p);

    const Message* getData();
    void setData(std::unique_ptr<Message> d);

    int64_t getTimestamp();
    void setTimestamp(int64_t t);

    // Clone method for polymorphic copy
    std::unique_ptr<Message> clone()
};

#endif