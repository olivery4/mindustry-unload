package main;

import mindustry.mod.Mod;
import unload.ModBlocks;

public class ModLoader extends Mod {

    public ModLoader() {}

    @Override
    public void loadContent() {
        RemoteCoreUnloader.load();
    }
}
