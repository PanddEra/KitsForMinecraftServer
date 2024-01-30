package me.pandera.ua.kitsforminecraftserver.commands.tabCompleters;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.List;

public class KitTabCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 1){
            return List.of("fisherman", "hunter", "fighter", "miner");
        }
        return null;
    }
}
