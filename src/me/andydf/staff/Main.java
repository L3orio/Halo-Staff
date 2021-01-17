package me.andydf.staff;

import me.andydf.staff.command.Staff;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        getCommand("Staff+").setExecutor((CommandExecutor)new Staff(this));
        getCommand("Staff-").setExecutor((CommandExecutor)new Staff(this));
        saveDefaultConfig();
    }
}
