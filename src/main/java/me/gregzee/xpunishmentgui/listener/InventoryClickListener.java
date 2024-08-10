package me.gregzee.xpunishmentgui.listener;

import me.gregzee.xpunishmentgui.inventory.PunishInventory;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryClickListener implements Listener {

	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		Inventory inventory = event.getClickedInventory();

		if (inventory == null || !(inventory.getHolder(false) instanceof PunishInventory punishInventory)) {
			return;
		}

		event.setCancelled(true);

		ItemStack clickedItem = event.getCurrentItem();

		if (clickedItem != null && clickedItem.getType() == Material.AIR) {

		}
	}
}
