package main;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;

public class UnloaderMod extends Mod{

    public UnloaderMod(){
        
    }

    @Override
    public void loadContent(){
        remoteCoreUnloader.load();
        Log.info("Loading some example content.");
    }

}
