package me.alpha432.oyvey.features.modules.combat;

import com.google.common.eventbus.Subscribe;
import me.alpha432.oyvey.event.impl.UpdateEvent;
import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.SlotActionType;

public class AutoArmor extends Module {
    public AutoArmor() {
        super("AutoArmor", "Automatically equips best armor", Category.COMBAT, true, false, false);
    }

    @Subscribe
    public void onUpdate(UpdateEvent event) {
        if (mc.player == null || mc.currentScreenHandler != mc.player.playerScreenHandler) return;

        // Basic inventory armor check logic loop can be integrated here
        for (int i = 9; i < 45; i++) {
            ItemStack stack = mc.player.getInventory().getStack(i);
            if (stack.getItem() instanceof ArmorItem armorItem) {
                // Logic to swap armor into appropriate slot based on armorItem.getSlotType()
            }
        }
    }
}
