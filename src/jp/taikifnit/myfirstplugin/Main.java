package jp.taikifnit.myfirstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
    //@Override
    public void onEnable(){
        //Fired when the server enables the plugin
        this.getCommand("fnit").setExecutor(new CommandFnit());
    }

    //@Override
    public void onDisable(){
        //Fired when the server stops and disables all plugins
    }
}
