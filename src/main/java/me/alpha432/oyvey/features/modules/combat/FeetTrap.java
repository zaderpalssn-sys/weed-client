package me.alpha432.oyvey.features.modules.combat;

import com.google.common.eventbus.Subscribe;
import me.alpha432.oyvey.event.impl.UpdateEvent;
import me.alpha432.oyvey.features.modules.Module;

public class FeetTrap extends Module {
    public FeetTrap() {
        super("FeetTrap", "Traps target feet in blocks", Category.COMBAT, true, false, false);
    }

    @Subscribe
    public void onUpdate(UpdateEvent event) {
        if (mc.player == null || mc.world == null) return;
        // Feet trap positioning layout logic
    }
}
