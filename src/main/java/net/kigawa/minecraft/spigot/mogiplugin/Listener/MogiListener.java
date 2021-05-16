package net.kigawa.minecraft.spigot.mogiplugin.Listener;

import net.kigawa.minecraft.spigot.mogiplugin.MogiPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;

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
    @EventHandler
    public void onPhysics(BlockPhysicsEvent event){
        if(plugin.redStoneCommand){
            event.setCancelled(true);
        }
    }
    @EventHandler
    public void onFade(BlockFadeEvent event){
        if(plugin.redStoneCommand){
            event.setCancelled(true);
        }
    }
    @EventHandler
    public void onFluidLevel(FluidLevelChangeEvent event){
        if(plugin.redStoneCommand){
            event.setCancelled(true);
        }
    }
    @EventHandler
    public void onFromTo(BlockFromToEvent event){
        if(plugin.redStoneCommand){
            event.setCancelled(true);
        }
    }
    @EventHandler
    public void onForm(BlockFormEvent event){
        if(plugin.redStoneCommand){
            event.setCancelled(true);
        }
    }
}
