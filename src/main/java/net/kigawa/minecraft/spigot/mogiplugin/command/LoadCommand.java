package net.kigawa.minecraft.spigot.mogiplugin.command;

import net.kigawa.minecraft.spigot.mogiplugin.MogiPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class LoadCommand implements CommandExecutor {
    MogiPlugin plugin;
    public LoadCommand(MogiPlugin mogiPlugin) {
        plugin=mogiPlugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player=(Player)sender;

        return false;
    }
}
