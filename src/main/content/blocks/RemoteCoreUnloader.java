package main.content.blocks;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.Unloader;
import mindustry.world.meta.BuildVisibility;
import mindustry.type.ItemStack;

public class RemoteCoreUnloader extends Unloader {

    remoteCoreUnloader

    public static void load() {
        remoteCoreUnloader = new CoreUnloader("remoteCoreUnloader") {{  
            // General block properties
            size = 1;
            health = 150;
            itemCapacity = 50;
    
            // Resource requirements to build
            requirements(Category.distribution, ItemStack.with(
                Items.titanium, 40,
                Items.silicon, 25,
            ));
    
            // Power usage
            consumesPower = true;
            consumePower(50f / 60f); // ~40 power/sec
    
            buildVisibility = BuildVisibility.shown;
    
            // Research tree dependency
            research = "unloader";
        }};
    }
}
