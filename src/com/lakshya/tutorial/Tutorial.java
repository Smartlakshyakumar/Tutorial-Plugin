package com.lakshya.tutorial;

import com.lakshya.tutorial.events.TutorialEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin
{

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TutorialEvents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[Tutorial] : Plugin is enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[Tutorial] : Plugin is disabled");
    }

}
