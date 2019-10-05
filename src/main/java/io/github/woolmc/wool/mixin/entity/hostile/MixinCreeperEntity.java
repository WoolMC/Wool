package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.Creeper;
import org.spongepowered.asm.mixin.Mixin;

import io.github.woolmc.wool.mixin.entity.BukkitEntityAccess;
import io.github.woolmc.wool.server.entity.hostile.WoolCreeper;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.CreeperEntity;

@Mixin(CreeperEntity.class)
public class MixinCreeperEntity implements BukkitEntityAccess<Creeper> {
	private Creeper bukkitEntity;

	@Override
	public Creeper getBukkitEntity() {
		return bukkitEntity;
	}
	
	public void onConstructor() {
		bukkitEntity = new WoolCreeper(MixinHacks.cast(CreeperEntity.class, this));
	}
}
