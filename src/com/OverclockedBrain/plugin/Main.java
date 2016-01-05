package com.OverclockedBrain.plugin;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() 
	{
			
	}
	
	
	

	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = logger.getLogger("Minecraft");
		
		logger.info(pdfFile.getName() + " has been enabled (v. " + pdfFile.getVersion() + ")");
	}

	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger - logger.getLogger("Minecraft");
		
		logger.info(pdfFile.getName() + " has been disabled (v. " + pdfFile.getVersion() + ")");
	}
}
