package me.alpha432.oyvey.features.modules.render;

import me.alpha432.oyvey.features.modules.Module;

public class NoWeather extends Module {
    public NoWeather() {
        super("NoWeather", "Removes rain and snow", Category.RENDER, true, false, false);
    }

    @Override
    public void onUpdate() {
        if (nullCheck()) return;
        if (mc.world.isRaining()) {
            mc.world.setRainGradient(0.0f);
        }
    }
}