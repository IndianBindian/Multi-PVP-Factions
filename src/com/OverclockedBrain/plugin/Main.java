package com.OverclockedBrain.plugin;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.*;

public class Main extends JavaPlugin {

	Player targetPlayer;
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
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String{} args){
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("ttp")){
			if(!player.isOp()){
				player.sendMessage(ChatColor.AQUA + "Permissions>" + ChatColor.GRAY + "You need the rank " + ChatColor.RED + ChatColor.BOLD + "ADMIN" + ChatColor.GRAY + " to use that command!");
			}else if(player.isOp()){
				if(args.length == 0){
					player.sendMessage(ChatColor.AQUA + "Staff Teleport>" + ChatColor.GRAY + "You need to specify a player to teleport to!");
				}else if(args.length == 1){
					targetPlayer = player.getServer().getPlayer(args[0]);
					Location tagetPlayerlocation = targetPlayer.getLocation();
					player.teleport(targetPlayerLocation);
				}else if(args.length == 2){
					targetPlayer = player.getServer().getPlayer(args[0]);
					Player targetPlayer1 = player.getServer().getPlayer(args[1]);
					Location targetPlayer1Location = targetPlayer1.getLocation();
					targetPlayer.teleport(targetPlayer1Location);
				}
				
			}
		}
	}
	


}


