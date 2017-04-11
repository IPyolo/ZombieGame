package me.WestNestMC.zombie;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.WestNestMC.zombie.Events.onJoin;
import me.WestNestMC.zombie.Events.onLeave;

public class Main extends JavaPlugin {
	
	public static String prefix = "§8[§bWest§1Nest§3MC§8]";
	
	@Override
	public void onEnable(){
		System.out.println("=============================");
		System.out.println("Idea by: WESTFIGHTER63");
		System.out.println("Coded by: IPyolo, MaxTheHaxor.");
		System.out.println("Help with errors: Danichef.");
		System.out.println("MiniGame Is now enabled!");
		System.out.println("=============================");
		registerCmds();
		registerEvents();
	}
	@Override
	public void onDisable(){
		System.out.println("=============================");
		System.out.println("Idea by: WESTFIGHTER63");
		System.out.println("Coded by: IPyolo, MaxTheHaxor.");
		System.out.println("Help with errors: Danichef.");
		System.out.println("MiniGame Is now disabled!");
		System.out.println("=============================");
	}
	/*
	 * Registers commands..
	 * Simply add them in the { } part like so...
	 */
	public void registerCmds(){
		getCommand("").setExecutor(null);
	}
	public void registerEvents(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new onJoin(), this);
		pm.registerEvents(new onLeave(), this);
	}
}
