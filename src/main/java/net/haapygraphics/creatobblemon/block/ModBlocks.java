package net.haapygraphics.creatobblemon.block;

import net.haapygraphics.creatobblemon.Creatobblemon;
import net.haapygraphics.creatobblemon.fluid.ModFluids;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Creatobblemon.MODID);

    public static final DeferredBlock<LiquidBlock> MEDICINAL_BREW_BLOCK = BLOCKS.register("medicinal_brew_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MEDICINAL_BREW.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)
                            .noCollission()
                            .strength(100.0F)
                            .noLootTable()));

    public static final DeferredBlock<LiquidBlock> POTION_BLOCK = BLOCKS.register("potion_block",
            () -> new LiquidBlock(ModFluids.SOURCE_POTION.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> SUPER_POTION_BLOCK = BLOCKS.register("super_potion_block",
            () -> new LiquidBlock(ModFluids.SOURCE_SUPER_POTION.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> HYPER_POTION_BLOCK = BLOCKS.register("hyper_potion_block",
            () -> new LiquidBlock(ModFluids.SOURCE_HYPER_POTION.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> MAX_POTION_BLOCK = BLOCKS.register("max_potion_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MAX_POTION.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> FULL_RESTORE_BLOCK = BLOCKS.register("full_restore_block",
            () -> new LiquidBlock(ModFluids.SOURCE_FULL_RESTORE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> ANTIDOTE_BLOCK = BLOCKS.register("antidote_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ANTIDOTE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> AWAKENING_BLOCK = BLOCKS.register("awakening_block",
            () -> new LiquidBlock(ModFluids.SOURCE_AWAKENING.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> BURN_HEAL_BLOCK = BLOCKS.register("burn_heal_block",
            () -> new LiquidBlock(ModFluids.SOURCE_BURN_HEAL.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> ICE_HEAL_BLOCK = BLOCKS.register("ice_heal_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ICE_HEAL.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> PARALYZE_HEAL_BLOCK = BLOCKS.register("paralyze_heal_block",
            () -> new LiquidBlock(ModFluids.SOURCE_PARALYZE_HEAL.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> FULL_HEAL_BLOCK = BLOCKS.register("full_heal_block",
            () -> new LiquidBlock(ModFluids.SOURCE_FULL_HEAL.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> ETHER_BLOCK = BLOCKS.register("ether_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ETHER.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> MAX_ETHER_BLOCK = BLOCKS.register("max_ether_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MAX_ETHER.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> ELIXIR_BLOCK = BLOCKS.register("elixir_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ELIXIR.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> MAX_ELIXIR_BLOCK = BLOCKS.register("max_elixir_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MAX_ELIXIR.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> HP_UP_BLOCK = BLOCKS.register("hp_up_block",
            () -> new LiquidBlock(ModFluids.SOURCE_HP_UP.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> PROTEIN_BLOCK = BLOCKS.register("protein_block",
            () -> new LiquidBlock(ModFluids.SOURCE_PROTEIN.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> IRON_BLOCK = BLOCKS.register("iron_block",
            () -> new LiquidBlock(ModFluids.SOURCE_IRON.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> CALCIUM_BLOCK = BLOCKS.register("calcium_block",
            () -> new LiquidBlock(ModFluids.SOURCE_CALCIUM.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> ZINC_BLOCK = BLOCKS.register("zinc_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ZINC.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> CARBOS_BLOCK = BLOCKS.register("carbos_block",
            () -> new LiquidBlock(ModFluids.SOURCE_CARBOS.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> PP_UP_BLOCK = BLOCKS.register("pp_up_block",
            () -> new LiquidBlock(ModFluids.SOURCE_PP_UP.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> BERRY_JUICE_BLOCK = BLOCKS.register("berry_juice_block",
            () -> new LiquidBlock(ModFluids.SOURCE_BERRY_JUICE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> PP_MAX_BLOCK = BLOCKS.register("pp_max_block",
            () -> new LiquidBlock(ModFluids.SOURCE_PP_MAX.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> ECHO_MATTER_BLOCK = BLOCKS.register("echo_matter_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ECHO_MATTER.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.LAVA).noCollission().strength(100.0F).noLootTable()));
    public static final DeferredBlock<LiquidBlock> ABILITY_BLOCK = BLOCKS.register("ability_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ABILITY_SOLUTION.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noCollission().strength(100.0F).noLootTable()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
