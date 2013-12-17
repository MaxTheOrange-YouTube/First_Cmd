package me.hydrations.First_Cmd;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		
	getCommand("maxtheorange2").setExecutor(new Second_Class(this));
	Bukkit.getServer().getPluginManager().registerEvents(new Event(this), this);
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("maxtheorange")) { //if the entered command is "maxtheorange"
			if(sender instanceof Player) { // if the command sender is a player
				Player p = (Player)  sender; //define the variable of the sender 
				p.sendMessage(ChatColor.GREEN + "This is my first command! Woot!");
			}
		}
		return true;
	}
	
	public void onDisable() {
		
	}
}

