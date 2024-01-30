package me.pandera.ua.kitsforminecraftserver;

import me.pandera.ua.kitsforminecraftserver.commands.KitCommand;
import me.pandera.ua.kitsforminecraftserver.commands.tabCompleters.KitTabCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public final class KitsPluginForMinecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("kit").setExecutor(new KitCommand());
        getCommand("kit").setTabCompleter(new KitTabCompleter());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
