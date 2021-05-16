package net.kigawa.minecraft.spigot.mogiplugin.command;

import net.kigawa.minecraft.spigot.mogiplugin.MogiPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class RedStoneCommand implements CommandExecutor {
    MogiPlugin plugin;
    public RedStoneCommand(MogiPlugin mogiPlugin) {
        plugin=mogiPlugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(label.equals("true")) {
            plugin.redStoneCommand = true;
            return true;
        }
        if(label.equals("false")){
            plugin.redStoneCommand=false;
            return true;
        }
        return false;
    }
}
