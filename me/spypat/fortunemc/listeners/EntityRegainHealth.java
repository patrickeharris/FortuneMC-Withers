package me.spypat.fortunemc.listeners;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.plugin.Plugin;

public class EntityRegainHealth implements Listener{
	public EntityRegainHealth(Plugin plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	
	@EventHandler
	public void onEntityRegainHealth(EntityRegainHealthEvent event){
		if(event.getEntityType().equals(EntityType.WITHER)){
			if(!event.getRegainReason().equals(EntityRegainHealthEvent.RegainReason.WITHER_SPAWN)){
				event.setCancelled(true);
			}
		}
	}
}
