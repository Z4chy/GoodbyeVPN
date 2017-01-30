package red.zach.goodbyevpn;

import org.bukkit.plugin.java.JavaPlugin;
import red.zach.goodbyevpn.listeners.JoinListener;

public class Main extends JavaPlugin {
    public static Main instance;

    public void onEnable(){
        this.instance = this;

        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        saveDefaultConfig();
    }

    public static Main getInstance(){

        return instance;
    }


}
