package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.entity.Entity;

public class EntitySpeed extends Module {
    public EntitySpeed() {
        super("EntitySpeed", "Boosts ridden entity speed", Category.MOVEMENT, true, false, false);
    }

    @Override
    public void onUpdate() {
        if (nullCheck()) return;
        Entity riding = mc.player.getVehicle();
        if (riding != null) {
            riding.setVelocity(riding.getVelocity().multiply(1.2, 1.0, 1.2));
        }
    }
}