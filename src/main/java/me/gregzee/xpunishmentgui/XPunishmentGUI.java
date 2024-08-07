package me.gregzee.xpunishmentgui;

import dev.jorel.commandapi.CommandAPI;
import dev.jorel.commandapi.CommandAPIBukkitConfig;
import dev.jorel.commandapi.CommandAPIConfig;
import lombok.Getter;
import me.gregzee.xpunishmentgui.command.PunishCommand;
import me.gregzee.xpunishmentgui.config.ConfigManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Optional;

public final class XPunishmentGUI extends JavaPlugin {

    @Getter
    private static XPunishmentGUI instance;
    public ConfigManager configManager;

    @Override
    public void onLoad() {
        CommandAPI.onLoad(new CommandAPIBukkitConfig(this).silentLogs(true));
        CommandAPI.onEnable();
    }

    @Override
    public void onEnable() {
        instance = this;
        configManager = new ConfigManager(this);

        if (!loadConfig()) {
            instance.getServer().getPluginManager().disablePlugin(instance);
            return;
        }

        registerCommands();
        registerListeners();
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabling plugin 'TotemGuard'...");
        saveDefaultConfig();
    }

    /**
     * Registers the plugin commands.
     */
    private void registerCommands() {

    }

    /**
     * Registers the plugin listeners.
     */
    private void registerListeners() {

    }

    /**
     * Loads the plugin configuration.
     *
     * @return true if the configuration was loaded successfully, false otherwise.
     */
    private boolean loadConfig() {
        final Optional<Throwable> error = configManager.loadConfig();
        if (error.isPresent()) {
            instance.getLogger().log(java.util.logging.Level.SEVERE, "Failed to load configuration", error.get());
            return false;
        }
        return true;
    }
}
