package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.Husk;
import org.spongepowered.asm.mixin.Mixin;

import io.github.woolmc.wool.mixin.entity.BukkitEntityAccess;
import io.github.woolmc.wool.server.entity.hostile.zombie.WoolHusk;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.HuskEntity;

@Mixin(HuskEntity.class)
public class MixinHuskEntity implements BukkitEntityAccess<Husk> {
	private Husk bukkitEntity;

	@Override
	public Husk getBukkitEntity() {
		return bukkitEntity;
	}
	
	public void onConstructor() {
		bukkitEntity = new WoolHusk(MixinHacks.cast(HuskEntity.class, this));
	}
}
