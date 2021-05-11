package net.kigawa.minecraft.spigot.mogiplugin.command;

import net.kigawa.minecraft.spigot.mogiplugin.MogiPlugin;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.awt.*;
import java.io.File;
import java.util.List;

public class ListCommand implements CommandExecutor {
    MogiPlugin plugin;
    public ListCommand(MogiPlugin mogiPlugin) {
        plugin=mogiPlugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player= (Player) sender;
            File[] worldFiles=plugin.getWorldFile().listFiles();
            File[] worldBackup=plugin.getWorldBackup().listFiles();
            for (File file : worldBackup){
                TextComponent message=new TextComponent(file.getName());
                message.setClickEvent(
                        new ClickEvent(
                                ClickEvent.Action.RUN_COMMAND,
                                "restore "+file.getName()));
                player.spigot().sendMessage(message);
            }
            for (File file : worldFiles){
                TextComponent message=new TextComponent(file.getName());
                message.setClickEvent(
                        new ClickEvent(
                                ClickEvent.Action.RUN_COMMAND,
                                "load "+file.getName()));
                player.spigot().sendMessage(message);
            }
        }
        return false;
    }
}
