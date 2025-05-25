package UAW.content.blocks;

import mindustry.world.blocks.storage.CoreBlock;   // if interacting with core blocks
import mindustry.world.Block;
import mindustry.world.Tile;
import mindustry.entities.units.BuildPlan;
import mindustry.gen.Building;
import mindustry.type.ItemStack;
import mindustry.world.blocks.distribution.Unloader;  // if extending Unloader or similar
import mindustry.content.Items;  // for referencing built-in items like titanium, phase fabric
import mindustry.type.ItemStack;
import arc.struct.Seq;  // for collections, if needed
import arc.util.Log;  // for logging/debugging

// For consuming power if your block uses power
import mindustry.world.meta.BlockFlag;
import mindustry.world.blocks.power.PowerNode;


public class RemoteCoreUnloader extends Unloader {
    public RemoteCoreUnloader(String name) {
        super(name);
        size = 1;                    // block size 1x1
        health = 100;                // block health
        itemCapacity = 50;           // item capacity in inventory
        
        requirements(Category.distribution, with(
            Items.titanium, 50,
            Items.silicon, 40,
            Items.phaseFabric, 30    // added phase fabric as requested
        ));

        researchRequirements
        
        consumesPower = true;        // uses power
        consumePower = 50f / 60f;    // consumes 50 power units per second
        
        buildVisibility = BuildVisibility.shown;  // visible in build menu

        research = "unloader";  // Unlock this block after unloader is researched
    }
    
    // Override methods if needed to customize behavior
}
