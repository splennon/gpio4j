#ifndef DIGITAL_H
#define DIGITAL_H

#include <iostream>
#include <stdexcept>
#include <vector>

#include "MessageType.h"
#include "Message.h"

class Digital : public Message {
private:
    bool value;

public:
    Digital() : value(false);
    Digital(bool val) : value(val);

    Digital* parse(std::istream& wireData);

    std::vector<uint8_t> wireData();

    MessageType getType();
};

#endif