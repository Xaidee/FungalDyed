package quartz.xaidee.fungaldyed.mixin;

import quartz.xaidee.fungaldyed.Constants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class FungalDyedMixin {
    
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        
        Constants.LOG.info("This line is printed by an example mod mixin from Fabric!");
        Constants.LOG.info("MC Version: {}", Minecraft.getInstance().getVersionType());
        Constants.LOG.info("Classloader: {}", this.getClass().getClassLoader());
    }
}