package me.alpha432.oyvey.features.modules.render;

import me.alpha432.oyvey.features.modules.Module;

public class NoBob extends Module {
    public NoBob() {
        super("NoBob", "Disables view bobbing", Category.RENDER, true, false, false);
    }

    @Override
    public void onUpdate() {
        if (nullCheck()) return;
        mc.options.getBobView().setValue(false);
    }
}