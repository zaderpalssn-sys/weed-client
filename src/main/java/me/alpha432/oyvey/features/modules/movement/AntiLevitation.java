package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.entity.effect.StatusEffects;

public class AntiLevitation extends Module {
    public AntiLevitation() {
        super("AntiLevitation", "Cancels levitation effect", Category.MOVEMENT, true, false, false);
    }

    @Override
    public void onUpdate() {
        if (nullCheck()) return;
        if (mc.player.hasStatusEffect(StatusEffects.LEVITATION)) {
            mc.player.removeStatusEffect(StatusEffects.LEVITATION);
        }
    }
}