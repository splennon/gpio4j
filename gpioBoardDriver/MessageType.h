#ifndef MESSAGETYPE_H
#define MESSAGETYPE_H

#include <iostream>
#include <vector>
#include <optional>
#include <algorithm>
#include <memory>

#include "Analog.h"
#include "Config.h"
#include "Deconfig.h"
#include "Digital.h"
#include "Dump.h"
#include "Interrupt.h"
#include "Message.h"
#include "Notify.h"
#include "Read.h"
#include "Write.h"

enum class MessageType {
    READ = 1,
    WRITE = 2,
    CONFIG = 3,
    DECONFIG = 4,
    DUMP = 5,
    DIGITAL = 6,
    ANALOG = 7,
    INTERRUPT = 8,
    NOTIFY = 9
};

class MessageTypeHelper {
public:
    static int getId(MessageType type);

    static std::optional<MessageType> forId(int id);

    static std::unique_ptr<Message> newInstance(MessageType type);
};

#endif