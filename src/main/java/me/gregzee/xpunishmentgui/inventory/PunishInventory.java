package me.gregzee.xpunishmentgui.inventory;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class PunishInventory implements InventoryHolder {
	private final Inventory punishInventory;

	public PunishInventory(Player target) {
		this.punishInventory = createPunishInventory(target);
	}

	/**
	 * Creates the punish inventory for the specified player with the target specified.
	 *
	 * @param target the player to punish
	 */
	public Inventory createPunishInventory(Player target) {
		// logic here

		return null;
	}

	/**
	 * Getter for the punish inventory.
	 * @return the inventory
	 */
	@Override
	public @NotNull Inventory getInventory() {
		return this.punishInventory;
	}
}
