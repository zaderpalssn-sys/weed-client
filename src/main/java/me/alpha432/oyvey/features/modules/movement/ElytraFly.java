package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;

public class ElytraFly extends Module {
    public ElytraFly() {
        super("ElytraFly", "Better elytra flight", Category.MOVEMENT, true, false, false);
    }

    @Override
    public void onUpdate() {
        if (nullCheck()) return;
        if (mc.player.isFallFlying()) {
            mc.player.setVelocity(mc.player.getVelocity().x, mc.options.jumpKey.isPressed() ? 0.2 : (mc.options.sneakKey.isPressed() ? -0.2 : 0), mc.player.getVelocity().z);
        }
    }
}