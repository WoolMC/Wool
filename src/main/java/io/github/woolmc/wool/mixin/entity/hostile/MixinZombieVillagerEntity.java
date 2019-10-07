package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.ZombieVillager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.entity.BukkitEntityAccess;
import io.github.woolmc.wool.entity.hostile.zombie.WoolZombieVillager;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.ZombieVillagerEntity;

@Mixin(ZombieVillagerEntity.class)
public class MixinZombieVillagerEntity implements BukkitEntityAccess<ZombieVillager> {
	
	private ZombieVillager bukkitEntity;

	@Override
	public ZombieVillager getBukkitEntity() {
		return bukkitEntity;
	}
	
	@Inject(at = @At("RETURN"), method = "<init>*")
	public void onConstructor(CallbackInfo ci) {
		bukkitEntity = new WoolZombieVillager(MixinHacks.cast(ZombieVillagerEntity.class, this));
	}
}
