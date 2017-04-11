package me.WestNestMC.zombie.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.WestNestMC.zombie.Main;

public class onLeave implements Listener {
	
	String prefix = Main.prefix;
	
	public void onJoin1(PlayerJoinEvent e){
		Player p = e.getPlayer();
		e.setJoinMessage(prefix+"§6"+p.getName()+" Left the MiniGame!");
	}
}
