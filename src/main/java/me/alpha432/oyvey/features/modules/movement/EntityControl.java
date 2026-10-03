package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;

public class EntityControl extends Module {
    public EntityControl() {
        super("EntityControl", "Control entities easily", Category.MOVEMENT, true, false, false);
    }
    // Handled via mixins for riding state checks
}