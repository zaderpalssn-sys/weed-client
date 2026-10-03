package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;

public class FakeLag extends Module {
    public FakeLag() {
        super("FakeLag", "Pulses movement packets", Category.MOVEMENT, true, false, false);
    }
    // Packet interception handled via event bus
}