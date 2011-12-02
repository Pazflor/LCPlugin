package no.pazflor.lcplugin;

import java.io.File;
import java.util.Scanner;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Methods {
	
	public static LCPlugin plugin;
	
	public Methods(LCPlugin instance) {
		plugin = instance;
	}
	
	public static void tntBlock(Block block) {
		if (block.getType() == Material.TNT) {
			block.setType(Material.AIR);
		}
	}
	
	public static void glassDrop(Block block) {
		if (block.getType() == Material.GLASS) {
			block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GLASS, 1));
		}
	}

	public static void loc(Player player) {
		Location loc = player.getLocation();
		player.getLocation();
		player.sendMessage(ChatColor.GREEN + "Dine kordinater er: "
				+ "X: " + loc.getX() + " Y: " + loc.getY() + " Z: " + loc.getZ());
	}
	
	public static void hjelp(Player player) {
		try {
			File hjelp = new File(plugin.getDataFolder() + File.separator
					+ "hjelp.txt");
			Scanner scanner = new Scanner(hjelp);
			while (scanner.hasNext()) {
				String hjelpm = scanner.nextLine();
				player.sendMessage(LCPlugin.fargetTekst(hjelpm));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void regler(Player player) {
		try {
			File regler = new File(plugin.getDataFolder() + File.separator
					+ "regler.txt");
			Scanner scanner = new Scanner(regler);
			while (scanner.hasNext()) {
				String reglerm = scanner.nextLine();
				player.sendMessage(LCPlugin.fargetTekst(reglerm));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
