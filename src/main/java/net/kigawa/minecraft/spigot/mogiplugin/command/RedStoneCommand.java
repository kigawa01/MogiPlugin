package net.kigawa.minecraft.spigot.mogiplugin.command;

import net.kigawa.minecraft.spigot.mogiplugin.MogiPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class RedStoneCommand implements CommandExecutor {
    MogiPlugin plugin;
    public RedStoneCommand(MogiPlugin mogiPlugin) {
        plugin=mogiPlugin;
    }

    @Override
    public boolean onCommand(CommandSender sender,  Command command, String label, String[] args) {
        plugin.Logger("redstone1");
        if(args[0].equals("on")) {
            plugin.Logger("redstone1.1");
            plugin.redStoneCommand = true;
            return true;
        }
        plugin.Logger("redstone2");
        if(args[0].equals("off")){
            plugin.Logger("redstone2.1");
            plugin.redStoneCommand=false;
            return true;
        }
        plugin.Logger("redstone3");
        return false;
    }
}
