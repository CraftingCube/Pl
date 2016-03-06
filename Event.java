package de.mystery.cmd;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Event implements Listener{
	
	anfang plugin;
	public Event(anfang plugin){
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		
	}
	
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerChat(AsyncPlayerChatEvent chat){
		Player p = chat.getPlayer();
		if(!p.hasPermission("mys.blacklist")){
		String msg = chat.getMessage();
		for(int i = 0; i < plugin.blacklist.size(); i++){
			msg = msg.replaceAll(plugin.blacklist.get(i), "Liebe");
			
		}
		
		chat.setMessage(msg);
		}
	}
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerChat2(AsyncPlayerChatEvent chat2){
		String msg = chat2.getMessage();
//		String wil = getConfig().getString("Config.wil");
			msg = msg.replaceAll("#Willkommen", "§3Herzlich§6 Willkommen§b auf diesem Server!§r");
			msg = msg.replaceAll("#willkommen", "§3Herzlich§6 Willkommen§b auf diesem Server!§r");
		
		chat2.setMessage(msg);
		
		
	}

	@EventHandler
	public void onMove(PlayerMoveEvent e){
		Player p = (Player) e.getPlayer();
	
	
		if(p.hasPermission("mys.effects")){

			if(Effects.id.containsKey(p.getName())){

			ParticleEffect.FLAME.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0, 0.1, 0), 17.0);
			
			}
			
		}
	}


}
