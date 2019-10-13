package io.github.woolmc.wool.scheduler;

import io.github.woolmc.WoolMod;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.*;

public class WoolFutureTask<T> implements WoolTask, Future<T> {
	private Plugin plugin; // owning plugin
	private Callable<T> callable; // action to perform
	private long delay; // delay until execution
	private boolean async;

	private int id; // task id
	private boolean running; // if the task is currently running
	private boolean cancelled; // if the task is cancelled


	private T value; // the output value
	private Throwable exception; // exception in execution
	private volatile boolean done; // if the task has been finished

	public WoolFutureTask(Plugin plugin, Callable<T> callable, long delay, boolean async) {
		this.plugin = plugin;
		this.callable = callable;
		this.delay = delay;
		this.async = async;
	}

	@Override
	public void exec(int tick) {
		if(delay < 0) {
			running = true;
			try {
				value = callable.call();
			} catch (Throwable e) {
				exception = e;
			}
			running = false;
			done = true;
		}
	}

	@Override
	public boolean remove() {
		return cancelled || done;
	}

	@Override
	public boolean isRunning() {
		return running;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		if(mayInterruptIfRunning)
			throw new UnsupportedOperationException("mayInterruptIfRunning not supported on WoolFutureTask");
		cancel();
		return true;
	}

	@Override
	public boolean isDone() {
		return done;
	}

	@Override
	public T get() throws ExecutionException {
		checkThread();
		while (!done);
		if(exception == null)
			return value;
		else
			throw new ExecutionException(exception);
	}

	@Override
	public T get(long timeout, @NotNull TimeUnit unit) throws ExecutionException, TimeoutException {
		checkThread();
		long time = System.currentTimeMillis();
		while (true) {
			if (done) break;
			else if ((System.currentTimeMillis() - time) > unit.toMillis(timeout))
				throw new TimeoutException("Timed out.");
		}

		if(exception == null)
			return value;
		else
			throw new ExecutionException(exception);
	}

	private void checkThread() {
		if (!(done || async || WoolMod.getMainThread() != Thread.currentThread()))
			throw new UnsupportedOperationException("Cannot wait on the main thread for a non-async task TaskID: " + getTaskId());
	}

	@Override
	public int getTaskId() {
		return id;
	}

	@Override
	public @NotNull Plugin getOwner() {
		return plugin;
	}

	@Override
	public boolean isSync() {
		return !async;
	}

	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void cancel() {
		cancelled = true;
	}
}
