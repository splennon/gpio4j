#include "PinType.h"

class PinTypeHelper {
public:
    static uint8_t getId(PinType type) {
        return static_cast<uint8_t>(type);
    }

    static PinType forId(uint8_t id) { // @suppress("No return")
        static const std::vector<PinType> allTypes = {
            PinType::DIGITAL_IN,
            PinType::DIGITAL_IN_PULLUP,
            PinType::DIGITAL_OUT,
            PinType::ANALOG_IN,
            PinType::ANALOG_OUT,
            PinType::COSINE,
            PinType::BUFFER,
            PinType::PWM
        };

        auto it = std::find_if(allTypes.begin(), allTypes.end(),
                               [id](PinType pt) { return getId(pt) == id; });

        if (it != allTypes.end()) {
            return *it;
        }
    }
};
