package me.sedano.shittest;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

@Getter
public final class ShitTest extends JavaPlugin {

    private ShitTest instance;
    private final Logger logger = this.getLogger();

    @Override
    public void onEnable() {

        instance = this;

    }
}
