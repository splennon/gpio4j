#include "MessageType.h"

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
    static int getId(MessageType type) {
        return static_cast<int>(type);
    }

    static std::optional<MessageType> forId(int id) {
        for (int i = static_cast<int>(MessageType::READ); i <= static_cast<int>(MessageType::NOTIFY); ++i) {
            if (id == i) {
                return static_cast<MessageType>(i);
            }
        }
        return std::nullopt;
    }

    static std::unique_ptr<Message> newInstance(MessageType type) {
        switch (type) {
            case MessageType::CONFIG:
                return std::make_unique<Config>();
            case MessageType::DIGITAL:
                return std::make_unique<Digital>();
            case MessageType::DECONFIG:
                return std::make_unique<Deconfig>();
            case MessageType::DUMP:
                return std::make_unique<Dump>();
            case MessageType::INTERRUPT:
                return std::make_unique<Interrupt>();
            case MessageType::READ:
                return std::make_unique<Read>();
            case MessageType::WRITE:
                return std::make_unique<Write>();
            case MessageType::ANALOG:
                return std::make_unique<Analog>();
            case MessageType::NOTIFY:
                return std::make_unique<Notify>();
            default:
                return nullptr;
        }
    }
};
