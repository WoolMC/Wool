package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.Husk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.entity.BukkitEntityAccess;
import io.github.woolmc.wool.entity.hostile.zombie.WoolHusk;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.HuskEntity;

@Mixin(HuskEntity.class)
public class MixinHuskEntity implements BukkitEntityAccess<Husk> {
	private Husk bukkitEntity;

	@Override
	public Husk getBukkitEntity() {
		return bukkitEntity;
	}
	
	@Inject(at = @At("RETURN"), method = "<init>*")
	public void onConstructor(CallbackInfo ci) {
		bukkitEntity = new WoolHusk(MixinHacks.cast(HuskEntity.class, this));
	}
}
