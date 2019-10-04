package io.github.woolmc.wool.util;

public class MixinHacks {

	public static <T> T cast(Class<T> clazz, Object object) {
		return (T) object;
	}

}
