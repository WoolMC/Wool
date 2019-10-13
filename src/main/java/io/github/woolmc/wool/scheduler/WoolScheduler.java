package io.github.woolmc.wool.scheduler;

import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
 * a better version of the bukkit scheduler, with better future support
 */
public interface WoolScheduler extends BukkitScheduler {
	@Override
	default @NotNull <T> Future<T> callSyncMethod(@NotNull Plugin plugin, @NotNull Callable<T> task) {
		return callSyncMethod(plugin, task, 0);
	}

	/**
	 * Calls a method on the main thread and returns a Future object. This
	 * task will be executed by the main server thread after the delay.
	 * <ul>
	 * <li>Note: The Future.get() methods must NOT be called from the main
	 *     thread. ({@link WoolScheduler#callSyncMethod(Plugin, Callable, long)} supports {@link Future#get()} if and only if the task is already done.)
	 * <li>Note2: There is at least an average of 10ms latency until the
	 *     isDone() method returns true.
	 * </ul>
	 * @param <T> The callable's return type
	 * @param plugin Plugin that owns the task
	 * @param task Task to be executed
	 * @param delay the ticks to wait until execution
	 * @return Future Future object related to the task
	 */
	@NotNull <T> Future<T> callSyncMethod(@NotNull Plugin plugin, @NotNull Callable<T> task, long delay);

	/**
	 * Calls a method on the scheduler thread and returns a Future object. This
	 * task will be executed by the main server thread.
	 * <ul>
	 * <li>Note: The Future.get() methods must NOT be called from the main
	 *     thread. ({@link WoolScheduler#callASyncMethod(Plugin, Callable)} supports {@link Future#get()} if and only if the task is already done.)
	 * <li>Note2: There is at least an average of 10ms latency until the
	 *     isDone() method returns true.
	 * </ul>
	 * @param <T> The callable's return type
	 * @param plugin Plugin that owns the task
	 * @param task Task to be executed
	 * @return Future Future object related to the task
	 */
	default @NotNull <T> Future<T> callASyncMethod(@NotNull Plugin plugin, @NotNull Callable<T> task) {
		return callASyncMethod(plugin, task, 0);
	}

	/**
	 * Calls a method on the scheduler thread and returns a Future object. This
	 * task will be executed by the main server thread after the delay.
	 * <ul>
	 * <li>Note: The Future.get() methods must NOT be called from the main
	 *     thread. ({@link WoolScheduler#callASyncMethod(Plugin, Callable, long)} supports {@link Future#get()} if and only if the task is already done.)
	 * <li>Note2: There is at least an average of 10ms latency until the
	 *     isDone() method returns true.
	 * </ul>
	 * @param <T> The callable's return type
	 * @param plugin Plugin that owns the task
	 * @param task Task to be executed
	 * @param delay the ticks to wait until execution
	 * @return Future Future object related to the task
	 */
	@NotNull <T> Future<T> callASyncMethod(@NotNull Plugin plugin, @NotNull Callable<T> task, long delay);
}
