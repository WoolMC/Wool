package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.Stray;
import org.spongepowered.asm.mixin.Mixin;

import io.github.woolmc.wool.mixin.entity.BukkitEntityAccess;
import io.github.woolmc.wool.server.entity.skeleton.WoolStray;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.StrayEntity;

@Mixin(StrayEntity.class)
public class MixinStrayEntity implements BukkitEntityAccess<Stray> {
	private Stray bukkitEntity;

	@Override
	public Stray getBukkitEntity() {
		return bukkitEntity;
	}
	
	public void onConstructor() {
		bukkitEntity = new WoolStray(MixinHacks.cast(StrayEntity.class, this));
	}
}
