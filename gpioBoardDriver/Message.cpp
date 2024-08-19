#include "Message.h"

class Message {
public:
    virtual ~Message() = default;

    virtual std::unique_ptr<Message> parse(std::istream& wireData) = 0;
    
    virtual std::vector<uint8_t> wireData() const = 0;
    
    virtual MessageType getType() const = 0;
};
