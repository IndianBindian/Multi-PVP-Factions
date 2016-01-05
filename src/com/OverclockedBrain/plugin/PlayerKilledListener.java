package com.OverclockedBrain.plugin;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerKilledListener
{
	@EventHandler
	public void onDeath(PlayerDeathEvent event) {
	    if(event.getEntityType() == EntityType.PLAYER)
	    {
	    	Player p = event.getEntity();
	    	p.sendMessage("You got killed by "+p.getKiller());
	    }
	    
	}
}
