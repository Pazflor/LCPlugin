package no.pazflor.lcplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Executor implements CommandExecutor {
	
	public static LCPlugin plugin;
	
	public Executor(LCPlugin instance) {
		plugin = instance;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		if (commandLabel.equalsIgnoreCase("loc")) {
			if (sender instanceof Player) {
				Methods.loc((Player) sender);
				
			}
		} else if (commandLabel.equalsIgnoreCase("hjelp")) {
			Methods.hjelp((Player) sender);
			
		} else if(commandLabel.equalsIgnoreCase("regler")) {
			Methods.regler((Player) sender);
			
		}
		return false;
	}

}
