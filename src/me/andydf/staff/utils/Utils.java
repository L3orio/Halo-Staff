package me.andydf.staff.utils;

import org.bukkit.ChatColor;

public class Utils {
    public static String chat(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}