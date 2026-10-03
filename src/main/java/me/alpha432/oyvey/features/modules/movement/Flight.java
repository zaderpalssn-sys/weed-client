package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;

public class Flight extends Module {
    public Flight() {
        super("Flight", "Free flight", Category.MOVEMENT, true, false, false);
    }

    @Override
    public void onUpdate() {
        if (nullCheck()) return;
        mc.player.getAbilities().flying = true;
    }

    @Override
    public void onDisable() {
        if (nullCheck()) return;
        mc.player.getAbilities().flying = false;
    }
}