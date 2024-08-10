package me.gregzee.xpunishmentgui.command;

import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.PlayerArgument;
import me.gregzee.xpunishmentgui.inventory.PunishInventory;
import org.bukkit.entity.Player;

public class PunishCommand {

	public PunishCommand() {
		registerPunishCommand();
	}

	public static void registerPunishCommand() {

		new CommandAPICommand("punish")
			.withPermission("xpunishmentgui.punish")
			.withArguments(new PlayerArgument("target"))
			.withUsage("/punish <target>")
			.executesPlayer((player, args) -> {
				PunishInventory punishInventory = new PunishInventory((Player) args.get("target"));
				player.openInventory(punishInventory.getInventory());
			}).register();
	}
}
