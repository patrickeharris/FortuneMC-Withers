package me.spypat.fortunemc;

import java.util.HashMap;
import me.spypat.fortunemc.commands.Commands;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;





public class FortuneMC
  extends JavaPlugin
{
  public static FortuneMC plugin;
  public HashMap<String, Boolean> features = new HashMap<>();
  
  FileConfiguration config = getConfig();

  
  public void onEnable() {
    getConfig().options().copyDefaults(true);
    getConfig().addDefault("withers.enabled", Boolean.valueOf(true));
    saveDefaultConfig();
    plugin = this;
    System.out.print("Enabling FortuneMC-Withers 1.0.0 By Spypat!");


    
    getCommand("withers").setExecutor((CommandExecutor)new Commands());

















    
    if (!this.config.contains("withers.features")) {
      this.features.put("wither_regen", Boolean.valueOf(true));
      this.features.put("wither_nerf", Boolean.valueOf(true));
      this.config.set("withers.features.wither_regen", Boolean.valueOf(true));
      this.config.set("withers.features.wither_nerf", Boolean.valueOf(true));
      saveConfig();
    } else {
      this.features.put("wither_regen", Boolean.valueOf(this.config.getBoolean("withers.features.wither_regen")));
      this.features.put("wither_nerf", Boolean.valueOf(this.config.getBoolean("withers.features.wither_nerf")));
    } 
    
    System.out.print("Enabled FortuneMC-Withers 1.0.0 By Spypat!");
  }


  
  public void onDisable() {
    System.out.print("Disabling FortuneMC-Withers 1.0.0 By Spypat!");
    saveConfig();
  }

  
  public static FortuneMC getInstance() { return plugin; }
  
  public void toggleFeature(String name, Player p) {
    if (name.equalsIgnoreCase("wither_regen")) {
      if (this.features.containsKey("wither_regen")) {
        if (((Boolean)this.features.get("wither_regen")).booleanValue()) {
          this.features.replace("wither_regen", Boolean.valueOf(false));
          this.config.set("withers.features.wither_regen", Boolean.valueOf(false));
          saveConfig();
          p.sendMessage(ChatColor.AQUA + "No Wither Regeneration " + ChatColor.RED + "Has Been Disabled!");
          return;
        } 
        if (!((Boolean)this.features.get("wither_regen")).booleanValue()) {
          this.features.replace("wither_regen", Boolean.valueOf(true));
          this.config.set("withers.features.wither_regen", Boolean.valueOf(true));
          saveConfig();
          p.sendMessage(ChatColor.AQUA + "No Wither Regeneration " + ChatColor.RED + "Has Been Enabled!");
          return;
        } 
        p.sendMessage(ChatColor.RED + "Something Went Wrong! Please Contact Spypat!");
      } 
      p.sendMessage(ChatColor.RED + "Something Went Wrong! Please Contact Spypat!");
    } 
    if (name.equalsIgnoreCase("wither_nerf")) {
      if (this.features.containsKey("wither_nerf")) {
        if (((Boolean)this.features.get("wither_nerf")).booleanValue()) {
          this.features.replace("wither_nerf", Boolean.valueOf(false));
          this.config.set("withers.features.wither_nerf", Boolean.valueOf(false));
          saveConfig();
          p.sendMessage(ChatColor.AQUA + "50% Wither Health " + ChatColor.RED + "Has Been Disabled!");
          return;
        } 
        if (!((Boolean)this.features.get("wither_nerf")).booleanValue()) {
          this.features.replace("wither_nerf", Boolean.valueOf(true));
          this.config.set("withers.features.wither_nerf", Boolean.valueOf(true));
          saveConfig();
          p.sendMessage(ChatColor.AQUA + "50% Wither Health " + ChatColor.RED + "Has Been Enabled!");
          return;
        } 
        p.sendMessage(ChatColor.RED + "Something Went Wrong! Please Contact Spypat!");
      } 
      p.sendMessage(ChatColor.RED + "Something Went Wrong! Please Contact Spypat!");
    } 
    p.sendMessage(ChatColor.RED + "Something Went Wrong! Please Contact Spypat!");
  }
  
  public boolean getFeature(String s) {
    if (this.features.containsKey(s)) {
      return ((Boolean)this.features.get(s)).booleanValue();
    }
    System.out.print("Something Went Wrong In FortuneMC! Please Contact Spypat!");
    return true;
  }
}
