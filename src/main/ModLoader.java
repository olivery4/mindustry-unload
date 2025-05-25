package main;

import mindustry.mod.Mod;
import main.ModBlocks;

public class ModLoader extends Mod {

    public ModLoader() {}

    @Override
    public void loadContent() {
        ModBlocks.load();
    }
}
