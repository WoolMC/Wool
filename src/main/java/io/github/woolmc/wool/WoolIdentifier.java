package io.github.woolmc.wool;

import org.bukkit.NamespacedKey;

import net.minecraft.util.Identifier;

public final class WoolIdentifier {
	
	private WoolIdentifier() {}
	
	public static NamespacedKey fromStringOrNull(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        Identifier minecraft = Identifier.tryParse(string);
        return (minecraft == null) ? null : fromIdentifier(minecraft);
    }

    public static NamespacedKey fromString(String string) {
        return fromIdentifier(new Identifier(string));
    }

    @SuppressWarnings("deprecation")
	public static NamespacedKey fromIdentifier(Identifier minecraft) {
        return new NamespacedKey(minecraft.getNamespace(), minecraft.getPath());
    }

    public static Identifier toIdentifier(NamespacedKey key) {
        return new Identifier(key.getNamespace(), key.getKey());
    }
}
