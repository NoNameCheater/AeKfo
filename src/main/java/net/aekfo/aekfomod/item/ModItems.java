package net.aekfo.aekfomod.item;

import net.aekfo.aekfomod.AeKfoMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AeKfoMod.MOD_ID);

    public static final DeferredItem<Item> FIRE_CRYSTAL = ITEMS.register("fire_crystal",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WATER_CRYSTAL = ITEMS.register("water_crystal",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> EARTH_CRYSTAL = ITEMS.register("earth_crystal",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> AIR_CRYSTAL = ITEMS.register("air_crystal",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
