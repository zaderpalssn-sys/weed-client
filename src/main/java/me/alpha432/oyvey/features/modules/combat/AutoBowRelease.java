package me.alpha432.oyvey.features.modules.combat;

import com.google.common.eventbus.Subscribe;
import me.alpha432.oyvey.event.impl.UpdateEvent;
import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.item.BowItem;

public class AutoBowRelease extends Module {
    public AutoBowRelease() {
        super("AutoBowRelease", "Releases bow automatically at max charge", Category.COMBAT, true, false, false);
    }

    @Subscribe
    public void onUpdate(UpdateEvent event) {
        if (mc.player == null) return;
        if (mc.player.isUsingItem() && mc.player.getActiveItem().getItem() instanceof BowItem) {
            if (mc.player.getItemUseTime() >= 20) {
                mc.interactionManager.stopUsingItem(mc.player);
            }
        }
    }
}
