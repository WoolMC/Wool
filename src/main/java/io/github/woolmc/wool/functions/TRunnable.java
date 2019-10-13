package io.github.woolmc.wool.functions;

public interface TRunnable extends Runnable {
	default void run() {
		try {
			exec();
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	void exec() throws Throwable;
}
