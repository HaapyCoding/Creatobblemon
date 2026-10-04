package net.haapygraphics.creatobblemon.fluid;

import net.haapygraphics.creatobblemon.Creatobblemon;
import net.haapygraphics.creatobblemon.block.ModBlocks;
import net.haapygraphics.creatobblemon.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(BuiltInRegistries.FLUID, Creatobblemon.MODID);

    public static final Supplier<FlowingFluid> SOURCE_MEDICINAL_BREW = FLUIDS.register("medicinal_brew_source",
            () -> new BaseFlowingFluid.Source(ModFluids.MEDICINAL_BREW_PROPERTIES));

    public static final Supplier<FlowingFluid> FLOWING_MEDICINAL_BREW = FLUIDS.register("medicinal_brew_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.MEDICINAL_BREW_PROPERTIES));

    public static final BaseFlowingFluid.Properties MEDICINAL_BREW_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.MEDICINAL_BREW_FLUID_TYPE,
            SOURCE_MEDICINAL_BREW,
            FLOWING_MEDICINAL_BREW)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(1)
            .block(ModBlocks.MEDICINAL_BREW_BLOCK)
            .bucket(ModItems.MEDICINAL_BREW_BUCKET);

    // Potion
    public static final Supplier<FlowingFluid> SOURCE_POTION = FLUIDS.register("potion_source",
            () -> new BaseFlowingFluid.Source(ModFluids.POTION_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_POTION = FLUIDS.register("potion_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.POTION_PROPERTIES));
    public static final BaseFlowingFluid.Properties POTION_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.POTION_FLUID_TYPE, SOURCE_POTION, FLOWING_POTION)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.POTION_BLOCK).bucket(ModItems.POTION_BUCKET);

    // Super Potion
    public static final Supplier<FlowingFluid> SOURCE_SUPER_POTION = FLUIDS.register("super_potion_source",
            () -> new BaseFlowingFluid.Source(ModFluids.SUPER_POTION_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_SUPER_POTION = FLUIDS.register("super_potion_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.SUPER_POTION_PROPERTIES));
    public static final BaseFlowingFluid.Properties SUPER_POTION_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.SUPER_POTION_FLUID_TYPE, SOURCE_SUPER_POTION, FLOWING_SUPER_POTION)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.SUPER_POTION_BLOCK).bucket(ModItems.SUPER_POTION_BUCKET);

    // Hyper Potion
    public static final Supplier<FlowingFluid> SOURCE_HYPER_POTION = FLUIDS.register("hyper_potion_source",
            () -> new BaseFlowingFluid.Source(ModFluids.HYPER_POTION_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_HYPER_POTION = FLUIDS.register("hyper_potion_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.HYPER_POTION_PROPERTIES));
    public static final BaseFlowingFluid.Properties HYPER_POTION_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.HYPER_POTION_FLUID_TYPE, SOURCE_HYPER_POTION, FLOWING_HYPER_POTION)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.HYPER_POTION_BLOCK).bucket(ModItems.HYPER_POTION_BUCKET);

    // Max Potion
    public static final Supplier<FlowingFluid> SOURCE_MAX_POTION = FLUIDS.register("max_potion_source",
            () -> new BaseFlowingFluid.Source(ModFluids.MAX_POTION_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_MAX_POTION = FLUIDS.register("max_potion_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.MAX_POTION_PROPERTIES));
    public static final BaseFlowingFluid.Properties MAX_POTION_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.MAX_POTION_FLUID_TYPE, SOURCE_MAX_POTION, FLOWING_MAX_POTION)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.MAX_POTION_BLOCK).bucket(ModItems.MAX_POTION_BUCKET);

    // Full Restore
    public static final Supplier<FlowingFluid> SOURCE_FULL_RESTORE = FLUIDS.register("full_restore_source",
            () -> new BaseFlowingFluid.Source(ModFluids.FULL_RESTORE_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_FULL_RESTORE = FLUIDS.register("full_restore_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.FULL_RESTORE_PROPERTIES));
    public static final BaseFlowingFluid.Properties FULL_RESTORE_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.FULL_RESTORE_FLUID_TYPE, SOURCE_FULL_RESTORE, FLOWING_FULL_RESTORE)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.FULL_RESTORE_BLOCK).bucket(ModItems.FULL_RESTORE_BUCKET);

    // Antidote
    public static final Supplier<FlowingFluid> SOURCE_ANTIDOTE = FLUIDS.register("antidote_source",
            () -> new BaseFlowingFluid.Source(ModFluids.ANTIDOTE_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_ANTIDOTE = FLUIDS.register("antidote_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.ANTIDOTE_PROPERTIES));
    public static final BaseFlowingFluid.Properties ANTIDOTE_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.ANTIDOTE_FLUID_TYPE, SOURCE_ANTIDOTE, FLOWING_ANTIDOTE)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.ANTIDOTE_BLOCK).bucket(ModItems.ANTIDOTE_BUCKET);

    // Awakening
    public static final Supplier<FlowingFluid> SOURCE_AWAKENING = FLUIDS.register("awakening_source",
            () -> new BaseFlowingFluid.Source(ModFluids.AWAKENING_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_AWAKENING = FLUIDS.register("awakening_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.AWAKENING_PROPERTIES));
    public static final BaseFlowingFluid.Properties AWAKENING_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.AWAKENING_FLUID_TYPE, SOURCE_AWAKENING, FLOWING_AWAKENING)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.AWAKENING_BLOCK).bucket(ModItems.AWAKENING_BUCKET);

    // Burn Heal
    public static final Supplier<FlowingFluid> SOURCE_BURN_HEAL = FLUIDS.register("burn_heal_source",
            () -> new BaseFlowingFluid.Source(ModFluids.BURN_HEAL_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_BURN_HEAL = FLUIDS.register("burn_heal_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.BURN_HEAL_PROPERTIES));
    public static final BaseFlowingFluid.Properties BURN_HEAL_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.BURN_HEAL_FLUID_TYPE, SOURCE_BURN_HEAL, FLOWING_BURN_HEAL)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.BURN_HEAL_BLOCK).bucket(ModItems.BURN_HEAL_BUCKET);

    // Ice Heal
    public static final Supplier<FlowingFluid> SOURCE_ICE_HEAL = FLUIDS.register("ice_heal_source",
            () -> new BaseFlowingFluid.Source(ModFluids.ICE_HEAL_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_ICE_HEAL = FLUIDS.register("ice_heal_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.ICE_HEAL_PROPERTIES));
    public static final BaseFlowingFluid.Properties ICE_HEAL_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.ICE_HEAL_FLUID_TYPE, SOURCE_ICE_HEAL, FLOWING_ICE_HEAL)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.ICE_HEAL_BLOCK).bucket(ModItems.ICE_HEAL_BUCKET);

    // Paralyze Heal
    public static final Supplier<FlowingFluid> SOURCE_PARALYZE_HEAL = FLUIDS.register("paralyze_heal_source",
            () -> new BaseFlowingFluid.Source(ModFluids.PARALYZE_HEAL_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_PARALYZE_HEAL = FLUIDS.register("paralyze_heal_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.PARALYZE_HEAL_PROPERTIES));
    public static final BaseFlowingFluid.Properties PARALYZE_HEAL_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.PARALYZE_HEAL_FLUID_TYPE, SOURCE_PARALYZE_HEAL, FLOWING_PARALYZE_HEAL)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.PARALYZE_HEAL_BLOCK).bucket(ModItems.PARALYZE_HEAL_BUCKET);

    // Full Heal
    public static final Supplier<FlowingFluid> SOURCE_FULL_HEAL = FLUIDS.register("full_heal_source",
            () -> new BaseFlowingFluid.Source(ModFluids.FULL_HEAL_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_FULL_HEAL = FLUIDS.register("full_heal_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.FULL_HEAL_PROPERTIES));
    public static final BaseFlowingFluid.Properties FULL_HEAL_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.FULL_HEAL_FLUID_TYPE, SOURCE_FULL_HEAL, FLOWING_FULL_HEAL)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.FULL_HEAL_BLOCK).bucket(ModItems.FULL_HEAL_BUCKET);

    // Ether
    public static final Supplier<FlowingFluid> SOURCE_ETHER = FLUIDS.register("ether_source",
            () -> new BaseFlowingFluid.Source(ModFluids.ETHER_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_ETHER = FLUIDS.register("ether_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.ETHER_PROPERTIES));
    public static final BaseFlowingFluid.Properties ETHER_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.ETHER_FLUID_TYPE, SOURCE_ETHER, FLOWING_ETHER)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.ETHER_BLOCK).bucket(ModItems.ETHER_BUCKET);

    // Max Ether
    public static final Supplier<FlowingFluid> SOURCE_MAX_ETHER = FLUIDS.register("max_ether_source",
            () -> new BaseFlowingFluid.Source(ModFluids.MAX_ETHER_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_MAX_ETHER = FLUIDS.register("max_ether_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.MAX_ETHER_PROPERTIES));
    public static final BaseFlowingFluid.Properties MAX_ETHER_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.MAX_ETHER_FLUID_TYPE, SOURCE_MAX_ETHER, FLOWING_MAX_ETHER)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.MAX_ETHER_BLOCK).bucket(ModItems.MAX_ETHER_BUCKET);

    // Elixir
    public static final Supplier<FlowingFluid> SOURCE_ELIXIR = FLUIDS.register("elixir_source",
            () -> new BaseFlowingFluid.Source(ModFluids.ELIXIR_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_ELIXIR = FLUIDS.register("elixir_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.ELIXIR_PROPERTIES));
    public static final BaseFlowingFluid.Properties ELIXIR_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.ELIXIR_FLUID_TYPE, SOURCE_ELIXIR, FLOWING_ELIXIR)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.ELIXIR_BLOCK).bucket(ModItems.ELIXIR_BUCKET);

    // Max Elixir
    public static final Supplier<FlowingFluid> SOURCE_MAX_ELIXIR = FLUIDS.register("max_elixir_source",
            () -> new BaseFlowingFluid.Source(ModFluids.MAX_ELIXIR_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_MAX_ELIXIR = FLUIDS.register("max_elixir_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.MAX_ELIXIR_PROPERTIES));
    public static final BaseFlowingFluid.Properties MAX_ELIXIR_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.MAX_ELIXIR_FLUID_TYPE, SOURCE_MAX_ELIXIR, FLOWING_MAX_ELIXIR)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.MAX_ELIXIR_BLOCK).bucket(ModItems.MAX_ELIXIR_BUCKET);

    // HP Up
    public static final Supplier<FlowingFluid> SOURCE_HP_UP = FLUIDS.register("hp_up_source",
            () -> new BaseFlowingFluid.Source(ModFluids.HP_UP_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_HP_UP = FLUIDS.register("hp_up_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.HP_UP_PROPERTIES));
    public static final BaseFlowingFluid.Properties HP_UP_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.HP_UP_FLUID_TYPE, SOURCE_HP_UP, FLOWING_HP_UP)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.HP_UP_BLOCK).bucket(ModItems.HP_UP_BUCKET);

    // Protein
    public static final Supplier<FlowingFluid> SOURCE_PROTEIN = FLUIDS.register("protein_source",
            () -> new BaseFlowingFluid.Source(ModFluids.PROTEIN_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_PROTEIN = FLUIDS.register("protein_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.PROTEIN_PROPERTIES));
    public static final BaseFlowingFluid.Properties PROTEIN_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.PROTEIN_FLUID_TYPE, SOURCE_PROTEIN, FLOWING_PROTEIN)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.PROTEIN_BLOCK).bucket(ModItems.PROTEIN_BUCKET);

    // Iron
    public static final Supplier<FlowingFluid> SOURCE_IRON = FLUIDS.register("iron_source",
            () -> new BaseFlowingFluid.Source(ModFluids.IRON_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_IRON = FLUIDS.register("iron_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.IRON_PROPERTIES));
    public static final BaseFlowingFluid.Properties IRON_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.IRON_FLUID_TYPE, SOURCE_IRON, FLOWING_IRON)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.IRON_BLOCK).bucket(ModItems.IRON_BUCKET);

    // Calcium
    public static final Supplier<FlowingFluid> SOURCE_CALCIUM = FLUIDS.register("calcium_source",
            () -> new BaseFlowingFluid.Source(ModFluids.CALCIUM_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_CALCIUM = FLUIDS.register("calcium_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.CALCIUM_PROPERTIES));
    public static final BaseFlowingFluid.Properties CALCIUM_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.CALCIUM_FLUID_TYPE, SOURCE_CALCIUM, FLOWING_CALCIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.CALCIUM_BLOCK).bucket(ModItems.CALCIUM_BUCKET);

    // Zinc
    public static final Supplier<FlowingFluid> SOURCE_ZINC = FLUIDS.register("zinc_source",
            () -> new BaseFlowingFluid.Source(ModFluids.ZINC_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_ZINC = FLUIDS.register("zinc_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.ZINC_PROPERTIES));
    public static final BaseFlowingFluid.Properties ZINC_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.ZINC_FLUID_TYPE, SOURCE_ZINC, FLOWING_ZINC)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.ZINC_BLOCK).bucket(ModItems.ZINC_BUCKET);

    // Carbos
    public static final Supplier<FlowingFluid> SOURCE_CARBOS = FLUIDS.register("carbos_source",
            () -> new BaseFlowingFluid.Source(ModFluids.CARBOS_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_CARBOS = FLUIDS.register("carbos_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.CARBOS_PROPERTIES));
    public static final BaseFlowingFluid.Properties CARBOS_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.CARBOS_FLUID_TYPE, SOURCE_CARBOS, FLOWING_CARBOS)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.CARBOS_BLOCK).bucket(ModItems.CARBOS_BUCKET);

    // PP Up
    public static final Supplier<FlowingFluid> SOURCE_PP_UP = FLUIDS.register("pp_up_source",
            () -> new BaseFlowingFluid.Source(ModFluids.PP_UP_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_PP_UP = FLUIDS.register("pp_up_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.PP_UP_PROPERTIES));
    public static final BaseFlowingFluid.Properties PP_UP_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.PP_UP_FLUID_TYPE, SOURCE_PP_UP, FLOWING_PP_UP)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.PP_UP_BLOCK).bucket(ModItems.PP_UP_BUCKET);

    // PP MAX
    public static final Supplier<FlowingFluid> SOURCE_PP_MAX = FLUIDS.register("pp_max_source",
            () -> new BaseFlowingFluid.Source(ModFluids.PP_MAX_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_PP_MAX = FLUIDS.register("pp_max_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.PP_MAX_PROPERTIES));
    public static final BaseFlowingFluid.Properties PP_MAX_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.PP_MAX_FLUID_TYPE, SOURCE_PP_MAX, FLOWING_PP_MAX)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.PP_MAX_BLOCK).bucket(ModItems.PP_MAX_BUCKET);

    // Berry Juice
    public static final Supplier<FlowingFluid> SOURCE_BERRY_JUICE = FLUIDS.register("berry_juice_source",
            () -> new BaseFlowingFluid.Source(ModFluids.BERRY_JUICE_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_BERRY_JUICE = FLUIDS.register("berry_juice_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.BERRY_JUICE_PROPERTIES));
    public static final BaseFlowingFluid.Properties BERRY_JUICE_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.BERRY_JUICE_FLUID_TYPE, SOURCE_BERRY_JUICE, FLOWING_BERRY_JUICE)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.BERRY_JUICE_BLOCK).bucket(ModItems.BERRY_JUICE_BUCKET);

    // Echo Matter
    public static final Supplier<FlowingFluid> SOURCE_ECHO_MATTER = FLUIDS.register("echo_matter_source",
            () -> new BaseFlowingFluid.Source(ModFluids.ECHO_MATTER_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_ECHO_MATTER = FLUIDS.register("echo_matter_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.ECHO_MATTER_PROPERTIES));
    public static final BaseFlowingFluid.Properties ECHO_MATTER_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.ECHO_MATTER_FLUID_TYPE, SOURCE_ECHO_MATTER, FLOWING_ECHO_MATTER)
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.ECHO_MATTER_BLOCK).bucket(ModItems.ECHO_MATTER_BUCKET);

    //Ability
    public static final Supplier<FlowingFluid> SOURCE_ABILITY_SOLUTION = FLUIDS.register("ability_solution_source",
            () -> new BaseFlowingFluid.Source(ModFluids.ABILITY_PROPERTIES));
    public static final Supplier<FlowingFluid> FLOWING_ABILITY_SOLUTION = FLUIDS.register("ability_solution_flowing",
            () -> new BaseFlowingFluid.Flowing(ModFluids.ABILITY_PROPERTIES));
    public static final BaseFlowingFluid.Properties ABILITY_PROPERTIES = new BaseFlowingFluid.Properties(
            ModFluidTypes.ABILITY_SOLUTION_FLUID_TYPE, SOURCE_ABILITY_SOLUTION, FLOWING_ABILITY_SOLUTION)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.ABILITY_BLOCK).bucket(ModItems.ABILITY_SOLUTION_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
