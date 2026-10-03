package me.alpha432.oyvey.features.modules.render;

import me.alpha432.oyvey.features.modules.Module;

public class NoRotate extends Module {
    public NoRotate() {
        super("NoRotate", "Cancels server-forced rotations", Category.RENDER, true, false, false);
    }
}