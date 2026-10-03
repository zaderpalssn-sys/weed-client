package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;

public class AutoWalk extends Module {
    public AutoWalk() {
        super("AutoWalk", "Automatically walks forward", Category.MOVEMENT, true, false, false);
    }

    @Override
    public void onUpdate() {
        if (nullCheck()) return;
        mc.options.forwardKey.setPressed(true);
    }

    @Override
    public void onDisable() {
        if (nullCheck()) return;
        mc.options.forwardKey.setPressed(false);
    }
}