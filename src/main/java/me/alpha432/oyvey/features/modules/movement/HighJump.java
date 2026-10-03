package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;

public class HighJump extends Module {
    public HighJump() {
        super("HighJump", "Jump higher", Category.MOVEMENT, true, false, false);
    }

    @Override
    public void onUpdate() {
        if (nullCheck()) return;
        if (mc.player.horizontalCollision && mc.options.jumpKey.isPressed()) {
            mc.player.setVelocity(mc.player.getVelocity().x, 0.5, mc.player.getVelocity().z);
        }
    }
}