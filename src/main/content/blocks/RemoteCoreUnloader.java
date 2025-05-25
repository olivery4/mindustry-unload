package main.content.blocks;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.Unloader;
import mindustry.world.meta.BuildVisibility;
import mindustry.type.ItemStack;

public class RemoteCoreUnloader extends Unloader {

    public RemoteCoreUnloader(String name) {
        super(name);

        size = 1;
        health = 100;
        itemCapacity = 50;

        requirements(Category.distribution, ItemStack.with(
            Items.titanium, 50,
            Items.silicon, 40,
            Items.phaseFabric, 30
        ));

        consumesPower = true;
        consumePower(50f / 60f); // 50 power/sec

        buildVisibility = BuildVisibility.shown;
        research = "unloader";
    }
}
