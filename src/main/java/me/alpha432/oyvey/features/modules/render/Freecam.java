package me.alpha432.oyvey.features.modules.render;

import me.alpha432.oyvey.features.modules.Module;

public class Freecam extends Module {
    public Freecam() {
        super("Freecam", "Leaves your body to fly around", Category.RENDER, true, false, false);
    }

    @Override
    public void onEnable() {
        if (nullCheck()) return;
        mc.player.noClip = true;
    }

    @Override
    public void onDisable() {
        if (nullCheck()) return;
        mc.player.noClip = false;
        mc.player.setVelocity(0, 0, 0);
    }
}