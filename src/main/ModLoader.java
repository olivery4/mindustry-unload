package main;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;

public class ModLoader extends Mod{

    public ModLoader(){
        
    }

    @Override
    public void loadContent(){
        remoteCoreUnloader.load();
        Log.info("Loading some example content.");
    }

}
