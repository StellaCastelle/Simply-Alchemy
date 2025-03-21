package com.stellac.simplyalchemy.item;

import com.stellac.simplyalchemy.SimplyAlchemy;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    //DeferredRegister Setup
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SimplyAlchemy.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    //Item Registry
    public static final DeferredItem<Item> EXAMPLEITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties()));

    //BlockItem Registry

}
