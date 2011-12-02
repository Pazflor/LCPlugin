package no.pazflor.lcplugin;

import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerListener;

public class PluginPlayerListener extends PlayerListener {
	
	public void onBlockPlace(BlockPlaceEvent event) {
		
		Methods.tntBlock(event.getBlock());
	}
	
	public void onBlockBreak(BlockBreakEvent event) {
		
		Methods.glassDrop(event.getBlock());
	}

}
