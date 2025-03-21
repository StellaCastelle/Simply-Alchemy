package com.stellac.simplyalchemy.block;

import com.stellac.simplyalchemy.SimplyAlchemy;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    //DeferredRegister Setup
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SimplyAlchemy.MOD_ID);

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    //Block Registry

}
