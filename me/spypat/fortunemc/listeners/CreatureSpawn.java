package me.spypat.fortunemc.listeners;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.Plugin;

import me.spypat.fortunemc.FortuneMC;

public class CreatureSpawn implements Listener{
	public CreatureSpawn(Plugin plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onCreatureSpawn(CreatureSpawnEvent event){
		if(event.getEntityType().equals(EntityType.WITHER)){
			if((FortuneMC.getInstance()).getFeature("wither_nerf")){
				event.getEntity().setMaxHealth(event.getEntity().getMaxHealth()*0.5);
				event.getEntity().setHealth(event.getEntity().getMaxHealth());
			}
		}
	}
}
