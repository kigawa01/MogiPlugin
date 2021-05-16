package net.kigawa.minecraft.spigot.mogiplugin.command;

import net.kigawa.minecraft.spigot.mogiplugin.MogiPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class RestoreCommand implements CommandExecutor {
    public RestoreCommand(MogiPlugin mogiPlugin) {

    }

    @Override
    public boolean onCommand( CommandSender sender,  Command command, String label,  String[] args) {
        return false;
    }
}
