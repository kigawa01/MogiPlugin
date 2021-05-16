package net.kigawa.minecraft.spigot.mogiplugin;

import net.kigawa.minecraft.spigot.mogiplugin.Listener.MogiListener;
import net.kigawa.minecraft.spigot.mogiplugin.command.ListCommand;
import net.kigawa.minecraft.spigot.mogiplugin.command.LoadCommand;
import net.kigawa.minecraft.spigot.mogiplugin.command.RedStoneCommand;
import net.kigawa.minecraft.spigot.mogiplugin.command.RestoreCommand;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class MogiPlugin extends JavaPlugin {
    MogiPlugin plugin=this;
    File worldFile;
    File worldBackup;
    public boolean redStoneCommand=false;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin.getDataFolder().mkdirs();
        worldFile=new File(plugin.getDataFolder(),"worlds");
        worldFile.mkdirs();
        worldBackup=new File(plugin.getDataFolder(),"worlds");
        worldBackup.mkdirs();
        plugin.saveDefaultConfig();
        Server server=getServer();
        PluginManager pluginManager=server.getPluginManager();

        plugin.getCommand("list").setExecutor(new ListCommand(this));
        plugin.getCommand("load").setExecutor(new LoadCommand(this));
        plugin.getCommand("restore").setExecutor(new RestoreCommand(this));
        plugin.getCommand("redstone").setExecutor(new RedStoneCommand(this));

        pluginManager.registerEvents(new MogiListener(this),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public void Logger(String message){
        if(plugin.getConfig().getBoolean("debug")){
            plugin.getLogger().info(message);
        }
    }
    public File getWorldFile(){
        return worldFile;
    }
    public File getWorldBackup(){
        return worldBackup;
    }
}
