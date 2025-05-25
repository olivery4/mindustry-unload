package main.content.blocks.distribution;

import mindustry.world.blocks.distribution.Unloader;
import mindustry.type.Category;
import mindustry.world.meta.BuildVisibility;
import mindustry.content.Items;
import mindustry.type.ItemStack;

public class CoreUnloader extends Unloader {

    public CoreUnloader(String name) {
        super(name);

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
    }
}
