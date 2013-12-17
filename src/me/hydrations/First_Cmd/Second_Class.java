package me.hydrations.First_Cmd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Second_Class implements CommandExecutor {

	private Main plugin;
	public Second_Class(Main plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(cmd.getName().equalsIgnoreCase("maxtheorange2")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				p.sendMessage(ChatColor.GREEN + "This is our second command! Woot woot!");
				
			}
		}
		return false;
	}
}
