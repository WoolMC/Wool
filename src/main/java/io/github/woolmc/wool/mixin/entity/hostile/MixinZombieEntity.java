package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.Zombie;
import org.spongepowered.asm.mixin.Mixin;

import io.github.woolmc.wool.mixin.entity.BukkitEntityAccess;
import io.github.woolmc.wool.server.entity.hostile.zombie.WoolZombie;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.ZombieEntity;

@Mixin(ZombieEntity.class)
public class MixinZombieEntity implements BukkitEntityAccess<Zombie> {
	
	private Zombie bukkitEntity;

	@Override
	public Zombie getBukkitEntity() {
		return bukkitEntity;
	}
	
	public void onConstructor() {
		bukkitEntity = new WoolZombie(MixinHacks.cast(ZombieEntity.class, this));
	}
	
}
