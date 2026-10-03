package me.alpha432.oyvey.features.modules.render;

import me.alpha432.oyvey.features.modules.Module;

public class Fullbright extends Module {
    public Fullbright() {
        super("Fullbright", "Makes the world fully bright", Category.RENDER, true, false, false);
    }

    private double prevGamma;

    @Override
    public void onEnable() {
        if (nullCheck()) return;
        prevGamma = mc.options.getGamma().getValue();
        mc.options.getGamma().setValue(10.0);
    }

    @Override
    public void onDisable() {
        if (nullCheck()) return;
        mc.options.getGamma().setValue(prevGamma);
    }
}