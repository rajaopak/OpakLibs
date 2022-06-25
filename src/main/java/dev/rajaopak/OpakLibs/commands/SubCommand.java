package dev.rajaopak.OpakLibs.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * modified by rajaopak
 * @author aglerr
 */
public abstract class SubCommand {

    @Nullable
    public abstract String getName();

    @Nullable
    public abstract List<String> getNames();

    @Nullable
    public abstract String getUsage();

    @Nullable
    public abstract String getPermission();

    @Nullable
    public abstract List<String> parseTabCompletions(JavaPlugin plugin, CommandSender sender, String[] args);

    public abstract void execute(JavaPlugin plugin, CommandSender sender, String[] args);

}
