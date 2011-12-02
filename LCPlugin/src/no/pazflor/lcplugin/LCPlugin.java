package no.pazflor.lcplugin;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class LCPlugin extends JavaPlugin {
	
	Logger log = Logger.getLogger("Minecraft");
	
	public Methods methods = new Methods(this);
	public Executor executor = new Executor(this);
	
	public void onEnable() {
		
		//Lager filer
		File mappe = this.getDataFolder();
		File hjelp = new File(mappe + File.separator
				+ "hjelp.txt");
		File regler = new File(mappe + File.separator
				+ "regler.txt");
		if (!mappe.exists() && (!hjelp.exists())) {
			try {
				mappe.mkdir();
				hjelp.createNewFile();
				regler.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//Commands
		getCommand("loc").setExecutor(executor);
		getCommand("hjelp").setExecutor(executor);
		getCommand("regler").setExecutor(executor);
		
		//Aktiverings melding
		log.info(this + " enabled.");
	}
	
	public void onDisable() {
		
		//Deaktiverings melding
		log.info(this + " disabled.");
	}
	
	 public static String fargetTekst(String string) {
	        string = string.replaceAll("&0", ChatColor.BLACK + "");
	        string = string.replaceAll("&1", ChatColor.DARK_BLUE + "");
	        string = string.replaceAll("&2", ChatColor.DARK_GREEN + "");
	        string = string.replaceAll("&3", ChatColor.DARK_AQUA + "");
	        string = string.replaceAll("&4", ChatColor.DARK_RED + "");
	        string = string.replaceAll("&5", ChatColor.DARK_PURPLE + "");
	        string = string.replaceAll("&6", ChatColor.GOLD + "");
	        string = string.replaceAll("&7", ChatColor.GRAY + "");
	        string = string.replaceAll("&8", ChatColor.DARK_GRAY + "");
	        string = string.replaceAll("&9", ChatColor.BLUE + "");
	        string = string.replaceAll("&a", ChatColor.GREEN + "");
	        string = string.replaceAll("&b", ChatColor.AQUA + "");
	        string = string.replaceAll("&c", ChatColor.RED + "");
	        string = string.replaceAll("&d", ChatColor.LIGHT_PURPLE + "");
	        string = string.replaceAll("&e", ChatColor.YELLOW + "");
	        string = string.replaceAll("&f", ChatColor.WHITE + "");
	        return string;
	    }

}
