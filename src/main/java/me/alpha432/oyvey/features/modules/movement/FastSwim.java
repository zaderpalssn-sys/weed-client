package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;

public class FastSwim extends Module {
    public FastSwim() {
        super("FastSwim", "Swim faster", Category.MOVEMENT, true, false, false);
    }

    @Override
    public void onUpdate() {
        if (nullCheck()) return;
        if (mc.player.isTouchingWater()) {
            mc.player.setVelocity(mc.player.getVelocity().x * 1.15, mc.player.getVelocity().y, mc.player.getVelocity().z * 1.15);
        }
    }
}