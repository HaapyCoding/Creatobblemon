package net.haapygraphics.creatobblemon.item;

import net.haapygraphics.creatobblemon.Creatobblemon;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CreatobblemonCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Creatobblemon.MODID);

    public static final Supplier<CreativeModeTab> CREATOBBLEMON_CREATIVE_TAB = CREATIVE_MOD_TAB.register("creatobblemon_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.POKE_BALL_BLUEPRINT.get()))
                    .title(Component.translatable("creativetab.creatobblemon.items"))
                    .displayItems(
                            ((parameters, output) -> {
                                output.accept(ModItems.COPPER_HALF_BALL);
                                output.accept(ModItems.IRON_HALF_BALL);
                                output.accept(ModItems.GOLD_HALF_BALL);
                                output.accept(ModItems.DIAMOND_HALF_BALL);
                                output.accept(ModItems.COPPER_BLANK_BALL);
                                output.accept(ModItems.IRON_BLANK_BALL);
                                output.accept(ModItems.GOLD_BLANK_BALL);
                                output.accept(ModItems.DIAMOND_BLANK_BALL);
                                output.accept(ModItems.COPPER_ANCIENT_BLANK_BALL);
                                output.accept(ModItems.IRON_ANCIENT_BLANK_BALL);
                                output.accept(ModItems.GOLD_ANCIENT_BLANK_BALL);
                                output.accept(ModItems.BALL_BUTTON);
                                output.accept(ModItems.BALL_LOCK);

								output.accept(ModItems.MASTER_BALL_UPPER_HALF);
                                output.accept(ModItems.MASTER_BALL_LOWER_HALF);
                                output.accept(ModItems.MASTER_BUTTON);

                                output.accept(ModItems.GOLD_CURVE);
								output.accept(ModItems.ECHO_MATTER_BUCKET);

                                output.accept(ModItems.GLASS_VIAL);
                                output.accept(ModItems.ATTACK_PILLS);
                                output.accept(ModItems.DEFENCE_PILLS);
                                output.accept(ModItems.GUARD_PILLS);
                                output.accept(ModItems.HIT_PILLS);
                                output.accept(ModItems.SPECIAL_DEFENCE_PILLS);
                                output.accept(ModItems.SPECIAL_ATTACK_PILLS);
                                output.accept(ModItems.ACCURACY_PILLS);
                                output.accept(ModItems.SPEED_PILLS);

                                output.accept(ModItems.TUMBLESTONE_POWDER);
                                output.accept(ModItems.SKY_TUMBLESTONE_POWDER);
                                output.accept(ModItems.BLACK_TUMBLESTONE_POWDER);

                                output.accept(ModItems.RED_APRICORN_SHELL);
                                output.accept(ModItems.BLUE_APRICORN_SHELL);
                                output.accept(ModItems.YELLOW_APRICORN_SHELL);
                                output.accept(ModItems.GREEN_APRICORN_SHELL);
                                output.accept(ModItems.PINK_APRICORN_SHELL);
                                output.accept(ModItems.BLACK_APRICORN_SHELL);
                                output.accept(ModItems.WHITE_APRICORN_SHELL);

                                output.accept(ModItems.BLANK_BLUEPRINT);
                                output.accept(ModItems.POKE_BALL_BLUEPRINT);
                                output.accept(ModItems.AZURE_BALL_BLUEPRINT);
                                output.accept(ModItems.CITRINE_BALL_BLUEPRINT);
                                output.accept(ModItems.VERDANT_BALL_BLUEPRINT);
                                output.accept(ModItems.ROSEATE_BALL_BLUEPRINT);
                                output.accept(ModItems.SLATE_BALL_BLUEPRINT);
                                output.accept(ModItems.PREMIER_BALL_BLUEPRINT);

                                // Add all blueprint items to the Ingredients creative tab
                                output.accept(ModItems.HEAL_BALL_BLUEPRINT);
                                output.accept(ModItems.SAFARI_BALL_BLUEPRINT);

                                output.accept(ModItems.GREAT_BALL_BLUEPRINT);
                                output.accept(ModItems.FAST_BALL_BLUEPRINT);
                                output.accept(ModItems.LEVEL_BALL_BLUEPRINT);
                                output.accept(ModItems.LURE_BALL_BLUEPRINT);
                                output.accept(ModItems.FRIEND_BALL_BLUEPRINT);
                                output.accept(ModItems.HEAVY_BALL_BLUEPRINT);
                                output.accept(ModItems.MOON_BALL_BLUEPRINT);
                                output.accept(ModItems.SPORT_BALL_BLUEPRINT);
                                output.accept(ModItems.PARK_BALL_BLUEPRINT);
                                output.accept(ModItems.NET_BALL_BLUEPRINT);
                                output.accept(ModItems.DIVE_BALL_BLUEPRINT);
                                output.accept(ModItems.NEST_BALL_BLUEPRINT);

                                output.accept(ModItems.LOVE_BALL_BLUEPRINT);
                                output.accept(ModItems.ULTRA_BALL_BLUEPRINT);
                                output.accept(ModItems.REPEAT_BALL_BLUEPRINT);
                                output.accept(ModItems.TIMER_BALL_BLUEPRINT);
                                output.accept(ModItems.QUICK_BALL_BLUEPRINT);
                                output.accept(ModItems.DUSK_BALL_BLUEPRINT);
                                output.accept(ModItems.LUXURY_BALL_BLUEPRINT);

                                output.accept(ModItems.CHERISH_BALL_BLUEPRINT);
                                output.accept(ModItems.BEAST_BALL_BLUEPRINT);
                                output.accept(ModItems.DREAM_BALL_BLUEPRINT);
                                output.accept(ModItems.MASTER_BALL_BLUEPRINT);

                                output.accept(ModItems.ANCIENT_POKE_BALL_BLUEPRINT);
                                output.accept(ModItems.ANCIENT_AZURE_BALL_BLUEPRINT);
                                output.accept(ModItems.ANCIENT_CITRINE_BALL_BLUEPRINT);
                                output.accept(ModItems.ANCIENT_VERDANT_BALL_BLUEPRINT);
                                output.accept(ModItems.ANCIENT_ROSEATE_BALL_BLUEPRINT);
                                output.accept(ModItems.ANCIENT_SLATE_BALL_BLUEPRINT);
                                output.accept(ModItems.ANCIENT_IVORY_BALL_BLUEPRINT);

                                output.accept(ModItems.ANCIENT_GREAT_BALL_BLUEPRINT);
                                output.accept(ModItems.ANCIENT_ULTRA_BALL_BLUEPRINT);

                                output.accept(ModItems.ANCIENT_FEATHER_BALL_BLUEPRINT);
                                output.accept(ModItems.ANCIENT_WING_BALL_BLUEPRINT);
                                output.accept(ModItems.ANCIENT_JET_BALL_BLUEPRINT);

                                output.accept(ModItems.ANCIENT_HEAVY_BALL_BLUEPRINT);
                                output.accept(ModItems.ANCIENT_LEADEN_BALL_BLUEPRINT);
                                output.accept(ModItems.ANCIENT_GIGATON_BALL_BLUEPRINT);

                                output.accept(ModItems.ANCIENT_ORIGIN_BALL_BLUEPRINT);

                                // Fluids
                                output.accept(ModItems.MEDICINAL_BREW_BUCKET);
                                output.accept(ModItems.POTION_BUCKET);
                                output.accept(ModItems.SUPER_POTION_BUCKET);
                                output.accept(ModItems.HYPER_POTION_BUCKET);
                                output.accept(ModItems.MAX_POTION_BUCKET);
                                output.accept(ModItems.FULL_RESTORE_BUCKET);
                                output.accept(ModItems.ANTIDOTE_BUCKET);
                                output.accept(ModItems.AWAKENING_BUCKET);
                                output.accept(ModItems.BURN_HEAL_BUCKET);
                                output.accept(ModItems.ICE_HEAL_BUCKET);
                                output.accept(ModItems.PARALYZE_HEAL_BUCKET);
                                output.accept(ModItems.FULL_HEAL_BUCKET);
                                output.accept(ModItems.ETHER_BUCKET);
                                output.accept(ModItems.MAX_ETHER_BUCKET);
                                output.accept(ModItems.ELIXIR_BUCKET);
                                output.accept(ModItems.MAX_ELIXIR_BUCKET);
                                output.accept(ModItems.HP_UP_BUCKET);
                                output.accept(ModItems.PROTEIN_BUCKET);
                                output.accept(ModItems.IRON_BUCKET);
                                output.accept(ModItems.CALCIUM_BUCKET);
                                output.accept(ModItems.ZINC_BUCKET);
                                output.accept(ModItems.CARBOS_BUCKET);
                                output.accept(ModItems.PP_UP_BUCKET);
                                output.accept(ModItems.PP_MAX_BUCKET);
                                output.accept(ModItems.BERRY_JUICE_BUCKET);
                                output.accept(ModItems.ABILITY_SOLUTION_BUCKET);





                            })
                    )

                    .build());
    public static void register(IEventBus eventBus)
    {
        CREATIVE_MOD_TAB.register(eventBus);
    }


}
