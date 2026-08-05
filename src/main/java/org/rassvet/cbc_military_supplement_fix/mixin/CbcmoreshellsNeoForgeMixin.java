package org.rassvet.cbc_military_supplement_fix.mixin;

import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.RegisterEvent;
import org.rassvet.cbc_military_supplement_fix.CbcMilitarySupplementFix;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * CBC Military Supplement 2.1.0 adds its sound entries to both its own map and
 * Create's {@code AllSoundEvents.ALL}. Create registers that shared map first,
 * so CBC's second registration crashes newer NeoForge versions.
 */
@Mixin(targets = "com.cainiao1053.cbcmoreshells.CbcmoreshellsNeoForge", remap = false)
abstract class CbcmoreshellsNeoForgeMixin {
    @Inject(method = "onRegisterSounds", at = @At("HEAD"), cancellable = true, remap = false)
    private void cbcMilitarySupplementFix$skipDuplicateSoundRegistration(
            RegisterEvent event,
            CallbackInfo callback
    ) {
        if (event.getRegistryKey() == Registries.SOUND_EVENT) {
            CbcMilitarySupplementFix.logSuppressedRegistration();
        }

        callback.cancel();
    }
}
