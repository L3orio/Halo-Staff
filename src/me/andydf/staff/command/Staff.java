package me.andydf.staff.command;

import me.andydf.staff.Main;
import me.andydf.staff.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Staff implements CommandExecutor{
    private static Main plugin;

    public Staff(Main plugin) { this.plugin = plugin; }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("Staff-")) {
            if (p.hasPermission("halo.staff")) {
                Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), plugin.getConfig().getString("DChat-CMD").replace("<name>", sender.getName()));
                Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), plugin.getConfig().getString("NTE-CMD").replace("<name>", sender.getName()));
                p.sendMessage(Utils.chat(plugin.getConfig().getString("Staff-MSG")));
            } else {
                p.sendMessage(Utils.chat("&4&lERROR &8> &cYou do not have permission to do that!"));
            }
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("Staff+")) {
            if (p.hasPermission("halo.staff")) {
                Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), plugin.getConfig().getString("DChat+CMD").replace("<name>", sender.getName()));
                Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), plugin.getConfig().getString("NTE+CMD").replace("<name>", sender.getName()));
                p.sendMessage(Utils.chat(plugin.getConfig().getString("Staff+MSG")));
            } else {
                p.sendMessage(Utils.chat("&4&lERROR &8> &cYou do not have permission to do that!"));
            }
            return true;
        }
        return false;
    }
}

