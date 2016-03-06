package de.mystery.cmd;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitTask;

public class Effects implements Listener{

	 public static HashMap<String, BukkitTask> id = new HashMap<String, BukkitTask>();
	 public static HashMap<String, Integer> i = new HashMap<String, Integer>();
	 
	 public static void StartEffecte(Player p){
	  
	  //Spieler in der HashMap ?
	  
	  //Wenn Spieler in HashMap , wird er nicht nochmal eingesetzt. Überspringt...
	  
	  if (!id.containsKey(p.getName())){
	   
	   
	  //Task startet
	   
	   
	   i.put(p.getName(), 0);
		  
	   id.put(p.getName(), Bukkit.getScheduler().runTaskTimer(Bukkit.getServer().getPluginManager().getPlugin("Mys") , new Runnable(){

	    @Override
	    public void run() {

	     //Hier das wird Ausgeführt.
	    	//macht immer +1
	    	i.put(p.getName(), i.get(p.getName())+1);
	    	//wenn eins ist wir das aus geführt
	    	if (i.get(p.getName()) == 1){
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.2, -0.2, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.2, -0.2, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 2){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.2, -0.2, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.4, -0.4, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.4, -0.4, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 3){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.4, -0.4, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.6, -0.6, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.6, -0.6, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 4){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.6, -0.6, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.8, -0.8, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.8, -0.8, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 5){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.8, -0.8, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(1.0, -1.0, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-1.0, -1.0, 0), 17.0);
	    		}
	    		//5
	    		if (i.get(p.getName()) == 6){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-1.0, -1.0, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(1.0, -1.2, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-1.0, -1.2, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 7){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-1.0, -1.2, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.8, -1.4, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.8, -1.4, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 8){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.8, -1.4, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.6, -1.6, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.6, -1.6, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 9){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.6, -1.6, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.4, -1.8, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.4, -1.8, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 10){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.4, -1.8, 0), 17.0);
	    			ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.4, -1.8, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0.2, -2.0, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(-0.2, -2.0, 0), 17.0);
	    		}
	    		//#######################
	    		//#		Es				#
	    		//#		Baut			#
	    		//#		sich			#
	    		//#		wieder			#
	    		//#		ab				#
	    		//#######################

	    		if (i.get(p.getName()) == 10){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.2, -0.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.4, -1.8, 0), 17.0);
	    			ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.4, -1.8, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.2, -2.0, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.2, -2.0, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 11){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.4, -0.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.4, -1.8, 0), 17.0);
	    			ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.4, -1.8, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.2, -2.0, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.2, -2.0, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 12){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.6, -0.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.4, -1.8, 0), 17.0);
	    			ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.4, -1.8, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.2, -2.0, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.2, -2.0, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 13){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.8, -0.8, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.4, -1.8, 0), 17.0);
	    			ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.4, -1.8, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.2, -2.0, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.2, -2.0, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 14){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-1.0, -1.0, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.4, -1.8, 0), 17.0);
	    			ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.4, -1.8, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.2, -2.0, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.2, -2.0, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 15){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-1.0, -1.2, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.4, -1.8, 0), 17.0);
	    			ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.4, -1.8, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.2, -2.0, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.2, -2.0, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 16){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.8, -1.4, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.4, -1.8, 0), 17.0);
	    			ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.4, -1.8, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.2, -2.0, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.2, -2.0, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 17){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.4, -1.8, 0), 17.0);
	    			ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.4, -1.8, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.2, -2.0, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.2, -2.0, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 18){
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.6, -1.6, 0), 17.0);
	    	    	ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.4, -1.8, 0), 17.0);
	    			ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.4, -1.8, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.2, -2.0, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.2, -2.0, 0), 17.0);
	    		}
	    		if (i.get(p.getName()) == 19){
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(0.2, -2.0, 0), 17.0);
	    		ParticleEffect.REDSTONE.display(0.2f, 0.2f, 0.2f, 0f, 5, p.getLocation().subtract(-0.2, -2.0, 0), 17.0);
	    		}
	    		
	    		//10
	    		
	    		//Zeitabstand
	    		ParticleEffect.LAVA.display(0.2f, 0.2f, 0.2f, 0.1f, 3, p.getLocation().subtract(0, 0.1, 0), 17.0);
	    		ParticleEffect.FLAME.display(0.2f, 0.2f, 0.2f, 0f, 10, p.getLocation().subtract(0, 0.1, 0), 17.0);
	    		if (i.get(p.getName()) == 20){
	    			//macht es zu =
	    			i.put(p.getName(), 0);
	    		
	    		
	    	 
	    	
	   
	    	
	  
	    	
	    	
	
	    
	    // Zeit in Ticks (Intervall, Startverzögerung nach Aktivieren)
	   }, 2L, 5L));
	   
	  } else {
	   
	   p.sendMessage("§eDu hast schon Effekte laufen.");
	   
	  }
	 }
	 
	 public static void StopEffecte(Player p){
		 
		 if(i.containsKey(p.getName())){
			 	p.sendMessage("§cDer Effect wurde wieder ausgeschaltet.");
			 i.remove(p.getName());
		 }
	  
		 if (id.containsKey(p.getName())){
	   
			 id.get(p.getName().toString()).cancel();
			 id.remove(p.getName());
	  
	  } else {
		  if(p.isOnline()){

		  p.sendMessage("§cDu hast keine Effekte laufen.");
		  }
	  }
	  
	  
	 }
	 @EventHandler
	 public void onQuit(PlayerQuitEvent e){
		 Player p = e.getPlayer();
		 StopEffecte(p);
	 }
	 
	 
	}