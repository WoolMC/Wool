package io.github.woolmc.wool.functions;

import java.util.function.BiConsumer;

public interface TBiConsumer<A, B> extends BiConsumer<A, B> {

	default void accept(A a, B b) {
		try {
			consume(a, b);
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	void consume(A a, B b) throws Throwable;
}
