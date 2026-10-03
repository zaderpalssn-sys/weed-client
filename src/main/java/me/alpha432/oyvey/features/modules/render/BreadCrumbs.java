package me.alpha432.oyvey.features.modules.render;

import me.alpha432.oyvey.features.modules.Module;

public class BreadCrumbs extends Module {
    public BreadCrumbs() {
        super("BreadCrumbs", "Leaves a visual trail behind you", Category.RENDER, true, false, false);
    }

    @Override
    public void onUpdate() {
        if (nullCheck()) return;
        // Collect and store player position vectors for line rendering
    }
}