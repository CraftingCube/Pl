package de.mystery.cmd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;




public class anfang extends org.bukkit.plugin.java.JavaPlugin{
	
	ArrayList<String> blacklist = new ArrayList<String>();
	
	
	@Override
	public void onDisable() {
		
		System.out.println("[Infos/PL] wurde nicht erkannt");
	}

	@Override
	
	public void onEnable() {
		
		
		
		loadConfig();
        new Event(this);
		
		
		//Blacklist
		File file = new File(this.getDataFolder() + "//blacklist.txt");
		
		try {
			Scanner s = new Scanner(file);
			
			while(s.hasNextLine()){
				blacklist.add(s.nextLine());
				
			}
			
			
			
			s.close();
		} catch (FileNotFoundException e) {
			System.err.println("Fehler:" + e.getLocalizedMessage());
		}
		
		//Blacklist ende
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		Player p = (Player) sender;
	    
		
		//TS
		if(command.getName().equalsIgnoreCase("ts")){
			
		String msg = getConfig().getString("Commands.ts");
		msg = msg.replace("[player]", p.getName());
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
		
			
			
		return true;
		
		}
		
		if(command.getName().equalsIgnoreCase("teamspeak")){
			
		String msg = getConfig().getString("Commands.ts");
		msg = msg.replace("[player]", p.getName());
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
		
			
			
		return true;
		
		}

		if(command.getName().equalsIgnoreCase("teamspeak3")){
			
		String msg = getConfig().getString("Commands.ts");
		msg = msg.replace("[player]", p.getName());
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
		
			
			
		return true;
		
		}
		//Reload /mys |-on
		if(command.getName().equalsIgnoreCase("mys")){
			
			if(args.length == 0) {
				String msg = getConfig().getString("Commands.System");
				msg = msg.replace("[player]", p.getName());
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
				
				String msg1 = getConfig().getString("Commands.ts");
				msg1 = msg1.replace("[player]", p.getName());
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg1));
				
				String msg2 = getConfig().getString("Commands.web");
				msg2 = msg2.replace("[player]", p.getName());
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg2));
				
				String msg3 = getConfig().getString("Commands.regeln");
				msg3 = msg3.replace("[player]", p.getName());
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg3));
			}
			else if(args.length == 1 && args[0].equalsIgnoreCase("test")) {
				
	              ParticleEffect.HEART.display(0.2f, 0.2f, 0.2f, 0f, 100, p.getLocation().subtract(0, 0.15, 0), 17.0);
			}
	              
			//Effects off
			else if(args.length == 1 && args[0].equalsIgnoreCase("off")) {
				if(p.hasPermission("mys.effects")){
				
				Effects.StopEffecte(p);
				}
			}
			//Effects on
			else if(args.length == 1 && args[0].equalsIgnoreCase("on")) {
			
				
				if(p.hasPermission("mys.effects")){
				Effects.StartEffecte(p);
				p.sendMessage("§cDer Effect ist an geschalt.");
				}

				}
			
			//relaod
			else if(args.length == 1 && args[0].equalsIgnoreCase("reload")) {
				
				
			
			if(p.hasPermission("mys.reload")){
				
			
			
			reloadConfig();
			
			p.sendMessage(ChatColor.GREEN + "Mys wurde reloaded!");
			}
			else{
				p.sendMessage(ChatColor.RED + "Du hast kein Rechte.");
			}
			}
			
			else{
				p.sendMessage(ChatColor.DARK_RED + "Dieses Argument gibt es nicht.");
			}
		}
		
		//WEB
		if(command.getName().equalsIgnoreCase("web")){
			
		String msg = getConfig().getString("Commands.web");
		msg = msg.replace("[player]", p.getName());
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
		
			
			
		return true;
		
		}
		
		if(command.getName().equalsIgnoreCase("webseite")){
			
		String msg = getConfig().getString("Commands.web");
		msg = msg.replace("[player]", p.getName());
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
		
			
			
		return true;
		
		}
		//regeln
		if(command.getName().equalsIgnoreCase("regeln")){
			
		String msg = getConfig().getString("Commands.regeln");
		msg = msg.replace("[player]", p.getName());
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
		
			
			
		return true;
		
		}
		
		if(command.getName().equalsIgnoreCase("links")){
			
			String msg = getConfig().getString("Commands.System");
			msg = msg.replace("[player]", p.getName());
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
			
			String msg1 = getConfig().getString("Commands.ts");
			msg1 = msg1.replace("[player]", p.getName());
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg1));
			
			String msg2 = getConfig().getString("Commands.web");
			msg2 = msg2.replace("[player]", p.getName());
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg2));
			
			String msg3 = getConfig().getString("Commands.regeln");
			msg3 = msg3.replace("[player]", p.getName());
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', msg3));
		
			
			
		return true;
		
		}
	return false;
	}
	
	public void loadConfig() {
		
		this.reloadConfig();
		this.getConfig().options().header("			MYS\n	Is a Private plugin for the server MysteryCraft.de");
		this.getConfig().addDefault("Commands.ts", "&3Unser Teamspeak 3 Server ist: &6Crafting.net.necror.de&3.");
		this.getConfig().addDefault("Commands.web", "&3Unsere Internetseite ist&6 Coming soon");
		this.getConfig().addDefault("&3Unsere Regeln sind unter:&6 Coming soon &3zu er halten.");
		this.getConfig().addDefault("&c[&9Crafting&bCube&c]");
		
		
		
		this.getConfig().options().copyDefaults(true);
		saveConfig();
		
	}
	
}
