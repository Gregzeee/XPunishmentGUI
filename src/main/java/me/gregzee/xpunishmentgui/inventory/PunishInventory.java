package me.gregzee.xpunishmentgui.inventory;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class PunishInventory implements InventoryHolder {

	private final Inventory inventory;

	public PunishInventory(Player player, Player target) {
		this.inventory = createPunishInventory(player, target);
	}

	/**
	 * Creates the punish inventory for the specified player with the target specified.
	 *
	 * @param player the player to open the inventory for
	 * @param target the player to punish
	 */
	public Inventory createPunishInventory(Player player, Player target) {
		// logic here

		return null;
	}

	/**
	 * Getter for the punish inventory.
	 * @return the inventory
	 */
	@Override
	public @NotNull Inventory getInventory() {
		return this.inventory;
	}
}
