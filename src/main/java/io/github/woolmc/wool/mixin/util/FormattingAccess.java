package io.github.woolmc.wool.mixin.util;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.util.Formatting;

@Mixin(Formatting.class)
public interface FormattingAccess {
	@Accessor
	char getCode();
}
