#ifndef PINTYPE_H
#define PINTYPE_H

#include <iostream>
#include <vector>
#include <optional>
#include <algorithm>

enum class PinType {
    DIGITAL_IN = 1,
    DIGITAL_IN_PULLUP = 2,
    DIGITAL_OUT = 3,
    ANALOG_IN = 4,
    ANALOG_OUT = 5,
    COSINE = 6,
    BUFFER = 7,
    PWM = 8
};

class PinTypeHelper {
public:
    static int getId(PinType type) {
        return static_cast<int>(type);
    }

    static std::optional<PinType> forId(int id) {
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
        return std::nullopt;
    }
};

#endif