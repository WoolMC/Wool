package io.github.woolmc.wool.scheduler;

import io.github.woolmc.WoolMod;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.scheduler.BukkitWorker;
import org.jetbrains.annotations.NotNull;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

import static io.github.woolmc.wool.scheduler.WoolTask.NO_REPEAT;

public class WoolScheduler implements BukkitScheduler {
	private final AtomicInteger integer = new AtomicInteger(0);

	private Int2ObjectMap<WoolTask> idToTask = new Int2ObjectOpenHashMap<>();
	private Map<Plugin, WoolTask> pluginToTask = new HashMap<>();
	private ExecutorService service = Executors.newFixedThreadPool(WoolMod.getWoolConfig().schedulerAsyncThreads);

	private WoolTask newTask(Plugin plugin, Runnable runnable, long delay, long time, boolean async) {
		return newTask(new WoolTask(plugin, runnable, delay, time, async));
	}

	private WoolTask newTask(WoolTask task) {
		int id = integer.getAndIncrement();
		task.setId(id);
		idToTask.put(id, task);
		pluginToTask.put(task.getOwner(), task);
		return task;
	}

	public void tick(int tick) {
		idToTask.forEach((i, w) -> {
			if(w.isSync())
				w.exec(tick);
			else
				service.submit(() -> w.exec(tick));
		});
	}

	@Override
	public int scheduleSyncDelayedTask(@NotNull Plugin plugin, @NotNull Runnable task, long delay) {
		return runTaskTimer(plugin, task, delay, NO_REPEAT).getTaskId();
	}

	@Override
	public int scheduleSyncDelayedTask(@NotNull Plugin plugin, @NotNull BukkitRunnable task, long delay) {
		return scheduleSyncDelayedTask(plugin, task::run, delay);
	}

	@Override
	public int scheduleSyncDelayedTask(@NotNull Plugin plugin, @NotNull Runnable task) {
		return scheduleSyncDelayedTask(plugin, task, 0);
	}

	@Override
	public int scheduleSyncDelayedTask(@NotNull Plugin plugin, @NotNull BukkitRunnable task) {
		return scheduleSyncDelayedTask(plugin, task, 0);
	}

	@Override
	public int scheduleSyncRepeatingTask(@NotNull Plugin plugin, @NotNull Runnable task, long delay, long period) {
		return runTaskTimer(plugin, task, delay, period).getTaskId();
	}

	@Override
	public int scheduleSyncRepeatingTask(@NotNull Plugin plugin, @NotNull BukkitRunnable task, long delay, long period) {
		return scheduleSyncRepeatingTask(plugin, task::run, delay, period);
	}

	@Override
	public int scheduleAsyncDelayedTask(@NotNull Plugin plugin, @NotNull Runnable task, long delay) {
		return runTaskTimerAsynchronously(plugin, task, delay, NO_REPEAT).getTaskId(); // TODO implement
	}

	@Override
	public int scheduleAsyncDelayedTask(@NotNull Plugin plugin, @NotNull Runnable task) {
		return scheduleAsyncDelayedTask(plugin, task, 0);
	}

	@Override
	public int scheduleAsyncRepeatingTask(@NotNull Plugin plugin, @NotNull Runnable task, long delay, long period) {
		return runTaskTimerAsynchronously(plugin, task, delay, period).getTaskId();
	}

	@Override
	public @NotNull <T> Future<T> callSyncMethod(@NotNull Plugin plugin, @NotNull Callable<T> task) {
		return null; // TODO implement
	}

	@Override
	public void cancelTask(int taskId) {
		WoolTask task = idToTask.remove(taskId);
		if(task != null) {
			pluginToTask.remove(task.getOwner());
			task.cancel();
		}
	}

	@Override
	public void cancelTasks(@NotNull Plugin plugin) {
		WoolTask task = pluginToTask.remove(plugin);
		if(task != null) {
			idToTask.remove(task.getTaskId());
			task.cancel();
		}
	}

	@Override
	public boolean isCurrentlyRunning(int taskId) {
		WoolTask task = idToTask.get(taskId);
		return task != null && task.isRunning();
	}

	@Override
	public boolean isQueued(int taskId) {
		return idToTask.containsKey(taskId);
	}

	@Override
	public @NotNull List<BukkitWorker> getActiveWorkers() {
		return Collections.EMPTY_LIST;
	}

	@Override
	public @NotNull List<BukkitTask> getPendingTasks() {
		return new ArrayList<>(idToTask.values());
	}

	@Override
	public @NotNull BukkitTask runTask(@NotNull Plugin plugin, @NotNull Runnable task) throws IllegalArgumentException {
		return runTaskTimer(plugin, task, 0, NO_REPEAT);
	}

	@Override
	public void runTask(@NotNull Plugin plugin, @NotNull Consumer<BukkitTask> task) throws IllegalArgumentException {
		runTaskTimer(plugin, task, 0, NO_REPEAT);
	}

	@Override
	public @NotNull BukkitTask runTask(@NotNull Plugin plugin, @NotNull BukkitRunnable task) throws IllegalArgumentException {
		return runTask(plugin, task::run);
	}

	@Override
	public @NotNull BukkitTask runTaskAsynchronously(@NotNull Plugin plugin, @NotNull Runnable task) throws IllegalArgumentException {
		return runTaskTimerAsynchronously(plugin, task, 0, NO_REPEAT);
	}

	@Override
	public void runTaskAsynchronously(@NotNull Plugin plugin, @NotNull Consumer<BukkitTask> task) throws IllegalArgumentException {
		runTaskTimerAsynchronously(plugin, task, 0, NO_REPEAT);
	}

	@Override
	public @NotNull BukkitTask runTaskAsynchronously(@NotNull Plugin plugin, @NotNull BukkitRunnable task) throws IllegalArgumentException {
		return runTaskAsynchronously(plugin, task::run);
	}

	@Override
	public @NotNull BukkitTask runTaskLater(@NotNull Plugin plugin, @NotNull Runnable task, long delay) throws IllegalArgumentException {
		return runTaskTimer(plugin, task, delay, NO_REPEAT);
	}

	@Override
	public void runTaskLater(@NotNull Plugin plugin, @NotNull Consumer<BukkitTask> task, long delay) throws IllegalArgumentException {
		runTaskTimer(plugin, task, delay, NO_REPEAT);
	}

	@Override
	public @NotNull BukkitTask runTaskLater(@NotNull Plugin plugin, @NotNull BukkitRunnable task, long delay) throws IllegalArgumentException {
		return newTask(plugin, task::run, delay, NO_REPEAT, false);
	}

	@Override
	public @NotNull BukkitTask runTaskLaterAsynchronously(@NotNull Plugin plugin, @NotNull Runnable task, long delay) throws IllegalArgumentException {
		return runTaskTimerAsynchronously(plugin, task, delay, NO_REPEAT);
	}

	@Override
	public void runTaskLaterAsynchronously(@NotNull Plugin plugin, @NotNull Consumer<BukkitTask> task, long delay) throws IllegalArgumentException {
		runTaskTimerAsynchronously(plugin, task, delay, NO_REPEAT);
	}

	@Override
	public @NotNull BukkitTask runTaskLaterAsynchronously(@NotNull Plugin plugin, @NotNull BukkitRunnable task, long delay) throws IllegalArgumentException {
		return runTaskLaterAsynchronously(plugin, task::run, delay);
	}


	@Override
	public @NotNull BukkitTask runTaskTimer(@NotNull Plugin plugin, @NotNull Runnable task, long delay, long period) throws IllegalArgumentException {
		return newTask(plugin, task, delay, period, false);
	}

	@Override
	public void runTaskTimer(@NotNull Plugin plugin, @NotNull Consumer<BukkitTask> task, long delay, long period) throws IllegalArgumentException {
		newTask(new WoolTask(plugin, null, delay, period, false) {
			{
				this.action = () -> task.accept(this);
			}
		});
	}

	@Override
	public @NotNull BukkitTask runTaskTimer(@NotNull Plugin plugin, @NotNull BukkitRunnable task, long delay, long period) throws IllegalArgumentException {
		return runTaskTimer(plugin, task::run, delay, period);
	}

	@Override
	public @NotNull BukkitTask runTaskTimerAsynchronously(@NotNull Plugin plugin, @NotNull Runnable task, long delay, long period) throws IllegalArgumentException {
		return newTask(plugin, task, delay, period, true);
	}

	@Override
	public void runTaskTimerAsynchronously(@NotNull Plugin plugin, @NotNull Consumer<BukkitTask> task, long delay, long period) throws IllegalArgumentException {
		newTask(new WoolTask(plugin, null, delay, period, true) {
			{
				this.action = () -> task.accept(this);
			}
		});
	}

	@Override
	public @NotNull BukkitTask runTaskTimerAsynchronously(@NotNull Plugin plugin, @NotNull BukkitRunnable task, long delay, long period) throws IllegalArgumentException {
		return runTaskTimerAsynchronously(plugin, task::run, delay, period);
	}
}
