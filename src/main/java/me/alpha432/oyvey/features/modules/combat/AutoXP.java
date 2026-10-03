package me.alpha432.oyvey.features.modules.combat;

import com.google.common.eventbus.Subscribe;
import me.alpha432.oyvey.event.impl.UpdateEvent;
import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;

public class AutoXP extends Module {
    public AutoXP() {
        super("AutoXP", "Automatically mends gear with XP bottles", Category.COMBAT, true, false, false);
    }

    @Subscribe
    public void onUpdate(UpdateEvent event) {
        if (mc.player == null) return;
        // Pitch check pointing straight down and using item logic
    }
}
