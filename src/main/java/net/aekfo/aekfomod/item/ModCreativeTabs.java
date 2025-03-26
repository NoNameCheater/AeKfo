package net.aekfo.aekfomod.item;

import net.aekfo.aekfomod.AeKfoMod;
import net.aekfo.aekfomod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AeKfoMod.MOD_ID);

    public static final Supplier<CreativeModeTab> ELEMENTAL_CRYSTALS_TAB = CREATIVE_MODE_TAB.register("elemental_crystals",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.FIRE_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.aekfomod.elemental_crystals"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FIRE_CRYSTAL.get());
                        output.accept(ModItems.WATER_CRYSTAL.get());
                        output.accept(ModItems.EARTH_CRYSTAL.get());
                        output.accept(ModItems.AIR_CRYSTAL.get());

                        output.accept(ModBlocks.FIRE_CRYSTAL_BLOCK.get().asItem());
                        output.accept(ModBlocks.WATER_CRYSTAL_BLOCK.get().asItem());
                        output.accept(ModBlocks.EARTH_CRYSTAL_BLOCK.get().asItem());
                        output.accept(ModBlocks.AIR_CRYSTAL_BLOCK.get().asItem());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
