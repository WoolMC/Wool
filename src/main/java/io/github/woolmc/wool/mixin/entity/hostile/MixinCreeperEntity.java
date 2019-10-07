package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.Creeper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.entity.BukkitEntityAccess;
import io.github.woolmc.wool.entity.hostile.WoolCreeper;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.CreeperEntity;

@Mixin(CreeperEntity.class)
public class MixinCreeperEntity implements BukkitEntityAccess<Creeper> {
	private Creeper bukkitEntity;

	@Override
	public Creeper getBukkitEntity() {
		return bukkitEntity;
	}
	
	@Inject(at = @At("RETURN"), method = "<init>*")
	public void onConstructor(CallbackInfo ci) {
		bukkitEntity = new WoolCreeper(MixinHacks.cast(CreeperEntity.class, this));
	}
}
