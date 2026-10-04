package net.haapygraphics.creatobblemon.fluid;

import net.haapygraphics.creatobblemon.Creatobblemon;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, Creatobblemon.MODID);

    public static final Supplier<FluidType> MEDICINAL_BREW_FLUID_TYPE = FLUID_TYPES.register("medicinal_brew_fluid",
            () -> new FluidType(FluidType.Properties.create()
                    .descriptionId("fluid.creatobblemon.medicinal_brew")
                    .canExtinguish(true)
                    .supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
                    .sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH)));

    // Healing Potions
    public static final Supplier<FluidType> POTION_FLUID_TYPE = FLUID_TYPES.register("potion_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.potion")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> SUPER_POTION_FLUID_TYPE = FLUID_TYPES.register("super_potion_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.super_potion")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> HYPER_POTION_FLUID_TYPE = FLUID_TYPES.register("hyper_potion_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.hyper_potion")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> MAX_POTION_FLUID_TYPE = FLUID_TYPES.register("max_potion_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.max_potion")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> FULL_RESTORE_FLUID_TYPE = FLUID_TYPES.register("full_restore_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.full_restore")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    // Status Healers
    public static final Supplier<FluidType> ANTIDOTE_FLUID_TYPE = FLUID_TYPES.register("antidote_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.antidote")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> AWAKENING_FLUID_TYPE = FLUID_TYPES.register("awakening_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.awakening")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> BURN_HEAL_FLUID_TYPE = FLUID_TYPES.register("burn_heal_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.burn_heal")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> ICE_HEAL_FLUID_TYPE = FLUID_TYPES.register("ice_heal_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.ice_heal")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> PARALYZE_HEAL_FLUID_TYPE = FLUID_TYPES.register("paralyze_heal_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.paralyze_heal")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> FULL_HEAL_FLUID_TYPE = FLUID_TYPES.register("full_heal_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.full_heal")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    // PP Restorers
    public static final Supplier<FluidType> ETHER_FLUID_TYPE = FLUID_TYPES.register("ether_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.ether")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> MAX_ETHER_FLUID_TYPE = FLUID_TYPES.register("max_ether_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.max_ether")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> ELIXIR_FLUID_TYPE = FLUID_TYPES.register("elixir_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.elixir")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> MAX_ELIXIR_FLUID_TYPE = FLUID_TYPES.register("max_elixir_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.max_elixir")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    // Vitamins
    public static final Supplier<FluidType> HP_UP_FLUID_TYPE = FLUID_TYPES.register("hp_up_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.hp_up")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> PROTEIN_FLUID_TYPE = FLUID_TYPES.register("protein_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.protein")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> IRON_FLUID_TYPE = FLUID_TYPES.register("iron_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.iron")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> CALCIUM_FLUID_TYPE = FLUID_TYPES.register("calcium_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.calcium")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> ZINC_FLUID_TYPE = FLUID_TYPES.register("zinc_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.zinc")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> CARBOS_FLUID_TYPE = FLUID_TYPES.register("carbos_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.carbos")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> PP_UP_FLUID_TYPE = FLUID_TYPES.register("pp_up_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.pp_up")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> PP_MAX_FLUID_TYPE = FLUID_TYPES.register("pp_max_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.pp_max")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static final Supplier<FluidType> ECHO_MATTER_FLUID_TYPE = FLUID_TYPES.register("echo_matter_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.echo_matter")
                    .canExtinguish(false)
                    .supportsBoating(false)
                    .canDrown(false)
                    .canPushEntity(false)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
                    .sound(SoundActions.FLUID_VAPORIZE, SoundEvents.LAVA_EXTINGUISH)
                    .lightLevel(1)
                    .density(3000)
                    .viscosity(6000)
                    .temperature(1300)));

    public static final Supplier<FluidType> ABILITY_SOLUTION_FLUID_TYPE = FLUID_TYPES.register("ability_solution_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.ability_solution")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));




    // Berry Juice
    public static final Supplier<FluidType> BERRY_JUICE_FLUID_TYPE = FLUID_TYPES.register("berry_juice_fluid",
            () -> new FluidType(FluidType.Properties.create().descriptionId("fluid.creatobblemon.berry_juice")
                    .canExtinguish(true).supportsBoating(true)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
