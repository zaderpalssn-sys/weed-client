package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.entity.vehicle.BoatEntity;

public class BoatFly extends Module {
    public BoatFly() {
        super("BoatFly", "Fly with a boat", Category.MOVEMENT, true, false, false);
    }

    @Override
    public void onUpdate() {
        if (nullCheck()) return;
        if (mc.player.getVehicle() instanceof BoatEntity boat) {
            boat.setNoGravity(true);
            boat.setVelocity(boat.getVelocity().x, mc.options.jumpKey.isPressed() ? 0.5 : (mc.options.sneakKey.isPressed() ? -0.5 : 0), boat.getVelocity().z);
        }
    }
}