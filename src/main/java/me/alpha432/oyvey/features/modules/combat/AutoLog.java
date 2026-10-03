package me.alpha432.oyvey.features.modules.combat;

import com.google.common.eventbus.Subscribe;
import me.alpha432.oyvey.event.impl.UpdateEvent;
import me.alpha432.oyvey.features.modules.Module;
import net.minecraft.text.Text;

public class AutoLog extends Module {
    public AutoLog() {
        super("AutoLog", "Logs out when health is low", Category.COMBAT, true, false, false);
    }

    @Subscribe
    public void onUpdate(UpdateEvent event) {
        if (mc.player == null || mc.getNetworkHandler() == null) return;

        if (mc.player.getHealth() + mc.player.getAbsorptionAmount() <= 8.0f) {
            mc.getNetworkHandler().getConnection().disconnect(Text.of("[AutoLog] Health dropped below threshold!"));
            this.toggle();
        }
    }
}
