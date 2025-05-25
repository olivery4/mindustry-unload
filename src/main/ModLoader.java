package main;

import arc.Events;
import mindustry.game.EventType.FileTreeInitEvent;
import mindustry.mod.Mod;
import main.content.*;

public class ModLoader extends Mod {

    public ModLoader() {}

    @Override
    public void loadContent() {
        ModBlocks.load();
    }
}
