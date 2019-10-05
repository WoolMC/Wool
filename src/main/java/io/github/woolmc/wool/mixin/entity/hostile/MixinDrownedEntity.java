package io.github.woolmc.wool.mixin.entity.hostile;

import org.bukkit.entity.Drowned;
import org.spongepowered.asm.mixin.Mixin;

import io.github.woolmc.wool.mixin.entity.BukkitEntityAccess;
import io.github.woolmc.wool.server.entity.hostile.zombie.WoolDrowned;
import io.github.woolmc.wool.util.MixinHacks;
import net.minecraft.entity.mob.DrownedEntity;

@Mixin(DrownedEntity.class)
public class MixinDrownedEntity implements BukkitEntityAccess<Drowned> {
	private Drowned bukkitEntity;

	@Override
	public Drowned getBukkitEntity() {
		return bukkitEntity;
	}
	
	public void onConstructor() {
		bukkitEntity = new WoolDrowned(MixinHacks.cast(DrownedEntity.class, this));
	}

}
