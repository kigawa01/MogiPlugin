package net.kigawa.minecraft.spigot.mogiplugin.Listener;

import net.kigawa.minecraft.spigot.mogiplugin.MogiPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;

public class MogiListener implements Listener {
    MogiPlugin plugin;
    public MogiListener(MogiPlugin mogiPlugin) {
        plugin=mogiPlugin;
    }
    @EventHandler
    public void onRedStone(BlockRedstoneEvent event){
        if(plugin.redStoneCommand){
            event.setNewCurrent(event.getOldCurrent());
        }
    }
}
