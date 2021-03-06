package io.github.woolmc.wool.mixin.common;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin (ServerWorld.class)
public interface ServerWorldAccessor {
    @Accessor
    public Int2ObjectMap<Entity> getEntitiesById();
}