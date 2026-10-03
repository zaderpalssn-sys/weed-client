package me.alpha432.oyvey.features.modules.combat;

import com.google.common.eventbus.Subscribe;
import me.alpha432.oyvey.event.impl.UpdateEvent;
import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Hand;

public class Aura extends Module {
    public Aura() {
        super("Aura", "Automatically attacks targets around you", Category.COMBAT, true, false, false);
    }

    @Subscribe
    public void onUpdate(UpdateEvent event) {
        if (mc.player == null || mc.world == null || mc.player.isDead()) return;

        for (Entity entity : mc.world.getEntities()) {
            if (entity instanceof LivingEntity living && living != mc.player && !living.isDead()) {
                if (mc.player.distanceTo(living) <= 4.2f) {
                    if (AntiBots.isBot(living)) continue;
                    mc.interactionManager.attackEntity(mc.player, living);
                    mc.player.swingHand(Hand.MAIN_HAND);
                    break;
                }
            }
        }
    }
}
