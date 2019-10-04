package io.github.woolmc.wool.mixin.entity;

import org.bukkit.entity.ZombieVillager;
import org.spongepowered.asm.mixin.Mixin;

import io.github.woolmc.wool.server.entity.hostile.zombie.WoolZombieVillager;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.ZombieVillagerEntity;

@Mixin(ZombieVillagerEntity.class)
public class MixinZombieVillager implements BukkitEntityAccess<ZombieVillager> {
	
	private ZombieVillager bukkitEntity;

	@Override
	public ZombieVillager getBukkitEntity() {
		return bukkitEntity;
	}
	
	public void onConstructor() {
		bukkitEntity = new WoolZombieVillager(MixinHacks.cast(ZombieVillagerEntity.class, this));
	}
}
