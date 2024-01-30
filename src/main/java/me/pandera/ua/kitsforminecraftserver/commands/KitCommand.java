package me.pandera.ua.kitsforminecraftserver.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class KitCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player)sender;
        switch (args[0]){
            case "fisherman": kitFisherman(player); break;
            case "hunter": kitHunter(player); break;
            case "fighter": kitFighter(player); break;
            case "miner": kitMiner(player);
        }
        return true;
    }
    ItemStack setItemMeta(String name, List<String> description, ItemStack itemStack){
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(name);
        itemMeta.setLore(description);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
    void setEnchantments(ItemStack itemStack, Map<Enchantment, Integer> enchantments){
        itemStack.addEnchantments(enchantments);
    }

    void kitFisherman(Player player){
        ItemStack itemStack = setItemMeta("Luckiest fishing rod",
                List.of("There have been legends about her since ancient times,",
                        "as if she is the luckiest fishing rod in the world"), new ItemStack(Material.FISHING_ROD));

        HashMap<Enchantment, Integer> enchantmentIntegerHashMap = new HashMap<>();
        enchantmentIntegerHashMap.put(Enchantment.LUCK, Enchantment.LUCK.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.LURE, Enchantment.LURE.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.MENDING, Enchantment.MENDING.getMaxLevel());
        setEnchantments(itemStack, enchantmentIntegerHashMap);
        enchantmentIntegerHashMap.clear();

        player.getInventory().addItem(itemStack);

        itemStack = setItemMeta("Fishing boots",
                List.of("These boots will help the fisherman in his adventures"), new ItemStack(Material.IRON_BOOTS));

        enchantmentIntegerHashMap.put(Enchantment.DURABILITY, Enchantment.DURABILITY.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.FROST_WALKER, Enchantment.FROST_WALKER.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.PROTECTION_ENVIRONMENTAL.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.PROTECTION_FALL, Enchantment.PROTECTION_FALL.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.MENDING, Enchantment.MENDING.getMaxLevel());
        setEnchantments(itemStack, enchantmentIntegerHashMap);
        enchantmentIntegerHashMap.clear();

        player.getInventory().addItem(itemStack);
    }
    void kitHunter(Player player){
        ItemStack itemStack = setItemMeta("Robin Hood's bow",
                List.of("The bow of the real Robin Hood"), new ItemStack(Material.BOW));

        HashMap<Enchantment, Integer> enchantmentIntegerHashMap = new HashMap<>();
        enchantmentIntegerHashMap.put(Enchantment.ARROW_INFINITE, Enchantment.ARROW_INFINITE.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.ARROW_FIRE, Enchantment.ARROW_FIRE.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.ARROW_DAMAGE, Enchantment.ARROW_DAMAGE.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.MENDING, Enchantment.MENDING.getMaxLevel());
        setEnchantments(itemStack, enchantmentIntegerHashMap);
        enchantmentIntegerHashMap.clear();

        player.getInventory().addItem(itemStack);

        itemStack = setItemMeta("Hunting jacket",
                List.of("Will never let you down on the hunt"), new ItemStack(Material.IRON_CHESTPLATE));

        enchantmentIntegerHashMap.put(Enchantment.DURABILITY, Enchantment.DURABILITY.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.PROTECTION_ENVIRONMENTAL.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.THORNS, Enchantment.THORNS.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.MENDING, Enchantment.MENDING.getMaxLevel());
        setEnchantments(itemStack, enchantmentIntegerHashMap);
        enchantmentIntegerHashMap.clear();

        player.getInventory().addItem(itemStack);
    }

    void kitFighter(Player player){
        ItemStack itemStack = setItemMeta("Sword of Areus",
                List.of("The sword of Areus, the son of the great Sky-Svarga",
                        "and the holy Mother Earth, the god of war and peace"), new ItemStack(Material.IRON_SWORD));

        HashMap<Enchantment, Integer> enchantmentIntegerHashMap = new HashMap<>();
        enchantmentIntegerHashMap.put(Enchantment.DAMAGE_ALL, Enchantment.DAMAGE_ALL.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.FIRE_ASPECT, Enchantment.FIRE_ASPECT.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.KNOCKBACK, Enchantment.KNOCKBACK.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.DURABILITY, Enchantment.DURABILITY.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.SWEEPING_EDGE, Enchantment.SWEEPING_EDGE.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.MENDING, Enchantment.MENDING.getMaxLevel());
        setEnchantments(itemStack, enchantmentIntegerHashMap);
        enchantmentIntegerHashMap.clear();

        player.getInventory().addItem(itemStack);

        itemStack = setItemMeta("Medieval shield",
                List.of("The shield of the strongest warrior of the Middle Ages"), new ItemStack(Material.SHIELD));

        enchantmentIntegerHashMap.put(Enchantment.DURABILITY, Enchantment.DURABILITY.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.PROTECTION_ENVIRONMENTAL.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.MENDING, Enchantment.MENDING.getMaxLevel());
        setEnchantments(itemStack, enchantmentIntegerHashMap);
        enchantmentIntegerHashMap.clear();

        player.getInventory().addItem(itemStack);
    }

    void kitMiner(Player player){
        ItemStack itemStack = setItemMeta("Super pickaxe",
                List.of("The fastest and strongest pickaxe"), new ItemStack(Material.IRON_PICKAXE));

        HashMap<Enchantment, Integer> enchantmentIntegerHashMap = new HashMap<>();
        enchantmentIntegerHashMap.put(Enchantment.DIG_SPEED, Enchantment.DIG_SPEED.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.LUCK, Enchantment.LUCK.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.DURABILITY, Enchantment.DURABILITY.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.MENDING, Enchantment.MENDING.getMaxLevel());
        setEnchantments(itemStack, enchantmentIntegerHashMap);
        enchantmentIntegerHashMap.clear();

        player.getInventory().addItem(itemStack);

        itemStack = setItemMeta("Miner's helmet",
                List.of("Helmet for miners for all occasions"), new ItemStack(Material.IRON_HELMET));

        enchantmentIntegerHashMap.put(Enchantment.DURABILITY, Enchantment.DURABILITY.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.PROTECTION_ENVIRONMENTAL.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.WATER_WORKER, Enchantment.WATER_WORKER.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.OXYGEN, Enchantment.OXYGEN.getMaxLevel());
        enchantmentIntegerHashMap.put(Enchantment.MENDING, Enchantment.MENDING.getMaxLevel());
        setEnchantments(itemStack, enchantmentIntegerHashMap);
        enchantmentIntegerHashMap.clear();

        player.getInventory().addItem(itemStack);
    }
}
