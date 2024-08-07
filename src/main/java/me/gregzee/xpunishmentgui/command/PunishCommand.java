package me.gregzee.xpunishmentgui.command;

import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.PlayerArgument;

public class PunishCommand {

	public static void register() {

		new CommandAPICommand("punish")
			.withPermission("xpunishmentgui.punish")
			.withArguments(new PlayerArgument("target"))
			.withUsage("/punish <target>")
			.executesPlayer((player, args) -> {
				// logic here?
			});
	}
}
