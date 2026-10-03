package me.alpha432.oyvey.features.modules.combat;

import com.google.common.eventbus.Subscribe;
import me.alpha432.oyvey.event.impl.UpdateEvent;
import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AntiBots extends Module {
    public static List<PlayerEntity> bots = new ArrayList<>();

    public AntiBots() {
        super("AntiBots", "Prevents targeting fake server bots", Category.COMBAT, true, false, false);
    }

    @Subscribe
    public void onUpdate(UpdateEvent event) {
        if (mc.world == null) return;
        bots.clear();
        for (Entity entity : mc.world.getEntities()) {
            if (entity instanceof PlayerEntity player && player != mc.player) {
                // Example check: Tab list validation or suspicious ping/ID
                if (mc.getNetworkHandler().getPlayerListEntry(player.getUuid()) == null) {
                    bots.add(player);
                }
            }
        }
    }

    public static boolean isBot(Entity entity) {
        return bots.contains(entity);
    }
}
