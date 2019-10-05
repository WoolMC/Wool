package io.github.woolmc.wool.mixin.entity;

public interface BukkitEntityAccess<E extends org.bukkit.entity.Entity> {
	
	E getBukkitEntity();
	
	public static <E extends org.bukkit.entity.Entity> E getEntity(Object nmsObject) {
		return (E) nmsObject;
	}
}
