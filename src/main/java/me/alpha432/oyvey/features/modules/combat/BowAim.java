package me.alpha432.oyvey.features.modules.combat;

import com.google.common.eventbus.Subscribe;
import me.alpha432.oyvey.event.impl.UpdateEvent;
import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BowItem;

public class BowAim extends Module {
    public BowAim() {
        super("BowAim", "Automatically aims bow at entities", Category.COMBAT, true, false, false);
    }

    @Subscribe
    public void onUpdate(UpdateEvent event) {
        if (mc.player == null || mc.world == null) return;
        if (mc.player.isUsingItem() && mc.player.getActiveItem().getItem() instanceof BowItem) {
            for (Entity entity : mc.world.getEntities()) {
                if (entity instanceof LivingEntity living && living != mc.player) {
                    mc.player.lookAt(net.minecraft.command.argument.EntityAnchorArgumentType.EntityAnchor.EYES, living.getPos());
                    break;
                }
            }
        }
    }
}
