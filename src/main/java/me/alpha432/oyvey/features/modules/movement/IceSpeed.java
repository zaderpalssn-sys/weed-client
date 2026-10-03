package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.block.Blocks;

public class IceSpeed extends Module {
    public IceSpeed() {
        super("IceSpeed", "Move faster on ice", Category.MOVEMENT, true, false, false);
    }
    // Handled via attribute scaling or block friction mixins
}