package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.Zombie;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.woolmc.wool.entity.BukkitEntityAccess;
import io.github.woolmc.wool.entity.hostile.zombie.WoolZombie;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.ZombieEntity;

@Mixin(ZombieEntity.class)
public class MixinZombieEntity implements BukkitEntityAccess<Zombie> {
	
	private Zombie bukkitEntity;

	@Override
	public Zombie getBukkitEntity() {
		return bukkitEntity;
	}
	
	@Inject(at = @At("RETURN"), method = "<init>*")
	public void onConstructor(CallbackInfo ci) {
		bukkitEntity = new WoolZombie(MixinHacks.cast(ZombieEntity.class, this));
	}
	
}
