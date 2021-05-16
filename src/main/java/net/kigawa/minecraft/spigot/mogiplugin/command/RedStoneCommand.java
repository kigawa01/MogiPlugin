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
        if(label.equals("true")) {
            plugin.redStoneCommand = true;
            return true;
        }
        plugin.Logger("redstone2");
        if(label.equals("false")){
            plugin.redStoneCommand=false;
            return true;
        }
        plugin.Logger("redstone3");
        return false;
    }
}
