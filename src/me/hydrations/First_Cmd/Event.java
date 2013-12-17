package me.hydrations.First_Cmd;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Event implements Listener {
	
	private Main plugin;
	public Event(Main plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		p.sendMessage(ChatColor.GREEN + "You have moved!");
			
		}
	}
