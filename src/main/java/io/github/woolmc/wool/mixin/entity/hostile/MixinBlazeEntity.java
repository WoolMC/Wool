package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.Blaze;
import org.spongepowered.asm.mixin.Mixin;

import io.github.woolmc.wool.mixin.entity.BukkitEntityAccess;
import io.github.woolmc.wool.server.entity.hostile.WoolBlaze;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.BlazeEntity;

@Mixin(BlazeEntity.class)
public class MixinBlazeEntity implements BukkitEntityAccess<Blaze> {
	private Blaze bukkitEntity;

	@Override
	public Blaze getBukkitEntity() {
		return bukkitEntity;
	}
	
	public void onConstructor() {
		bukkitEntity = new WoolBlaze(MixinHacks.cast(BlazeEntity.class, this));
	}
}
