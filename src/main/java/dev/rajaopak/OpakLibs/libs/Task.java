package dev.rajaopak.OpakLibs.libs;

import dev.rajaopak.OpakLibs.OpakLibs;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;

public class Task {

    public static void sync(Runnable runnable) {
        Bukkit.getScheduler().runTask(OpakLibs.INSTANCE, runnable);
    }

    public static void syncLater(long delay, Runnable runnable) {
        Bukkit.getScheduler().runTaskLater(OpakLibs.INSTANCE, runnable, delay);
    }

    public static BukkitTask syncTimer(long delay, long runEvery, Runnable runnable) {
        return Bukkit.getScheduler().runTaskTimer(OpakLibs.INSTANCE, runnable, delay, runEvery);
    }

    public static BukkitTask async(Runnable runnable) {
        return Bukkit.getScheduler().runTaskAsynchronously(OpakLibs.INSTANCE, runnable);
    }

    public static void asyncLater(long delay, Runnable runnable) {
        Bukkit.getScheduler().runTaskLaterAsynchronously(OpakLibs.INSTANCE, runnable, delay);
    }

    public static void asyncTimer(long delay, long runEvery, Runnable runnable) {
        Bukkit.getScheduler().runTaskTimerAsynchronously(OpakLibs.INSTANCE, runnable, delay, runEvery);
    }

}
