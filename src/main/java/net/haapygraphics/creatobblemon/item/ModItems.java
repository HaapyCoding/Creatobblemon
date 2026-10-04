package net.haapygraphics.creatobblemon.item;

import net.haapygraphics.creatobblemon.Creatobblemon;
import net.haapygraphics.creatobblemon.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.ItemStack;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Creatobblemon.MODID);


    public static class SelfReturningItem extends Item {
        public SelfReturningItem() {
            super(new Item.Properties());
        }

        @Override
        public ItemStack getCraftingRemainingItem(ItemStack stack) {
            return stack.copy();
        }

        @Override
        public boolean hasCraftingRemainingItem(ItemStack stack) {
            return true;
        }
    }

    /* ********** Declaring all half & blank balls ********** */

    public static final DeferredItem<Item> IRON_HALF_BALL = ITEMS.register("iron_half_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_HALF_BALL = ITEMS.register("copper_half_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_HALF_BALL = ITEMS.register("gold_half_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_HALF_BALL = ITEMS.register("diamond_half_ball",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPER_BLANK_BALL = ITEMS.register("copper_blank_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_BLANK_BALL = ITEMS.register("iron_blank_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_BLANK_BALL = ITEMS.register("gold_blank_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_BLANK_BALL = ITEMS.register("diamond_blank_ball",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPER_ANCIENT_BLANK_BALL = ITEMS.register("copper_ancient_blank_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_ANCIENT_BLANK_BALL = ITEMS.register("iron_ancient_blank_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_ANCIENT_BLANK_BALL = ITEMS.register("gold_ancient_blank_ball",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TUMBLESTONE_POWDER = ITEMS.register("tumblestone_powder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SKY_TUMBLESTONE_POWDER = ITEMS.register("sky_tumblestone_powder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLACK_TUMBLESTONE_POWDER = ITEMS.register("black_tumblestone_powder",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BALL_BUTTON = ITEMS.register("ball_button",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BALL_LOCK = ITEMS.register("ball_lock",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UNPROCESSED_BALL_LOCK = ITEMS.register("unprocessed_ball_lock",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GLASS_VIAL = ITEMS.register("glass_vial",
            () -> new Item(new Item.Properties()));



    /* ********** Declaring all apricorn shells ********** */

    public static final DeferredItem<Item> BLACK_APRICORN_SHELL = ITEMS.register("black_apricorn_shell",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLUE_APRICORN_SHELL = ITEMS.register("blue_apricorn_shell",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREEN_APRICORN_SHELL = ITEMS.register("green_apricorn_shell",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PINK_APRICORN_SHELL = ITEMS.register("pink_apricorn_shell",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RED_APRICORN_SHELL = ITEMS.register("red_apricorn_shell",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_APRICORN_SHELL = ITEMS.register("white_apricorn_shell",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YELLOW_APRICORN_SHELL = ITEMS.register("yellow_apricorn_shell",
            () -> new Item(new Item.Properties()));

    /* ********** Declaring all unprocessed half & blank balls ********** */

    public static final DeferredItem<Item> UNPROCESSED_IRON_HALF_BALL = ITEMS.register("unprocessed_iron_half_ball",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UNPROCESSED_BALL = ITEMS.register("unprocessed_ball",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UNPROCESSED_COPPER_HALF_BALL = ITEMS.register("unprocessed_copper_half_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_GOLD_HALF_BALL = ITEMS.register("unprocessed_gold_half_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_DIAMOND_HALF_BALL = ITEMS.register("unprocessed_diamond_half_ball",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UNPROCESSED_COPPER_BLANK_BALL = ITEMS.register("unprocessed_copper_blank_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_IRON_BLANK_BALL = ITEMS.register("unprocessed_iron_blank_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_GOLD_BLANK_BALL = ITEMS.register("unprocessed_gold_blank_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_DIAMOND_BLANK_BALL = ITEMS.register("unprocessed_diamond_blank_ball",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UNPROCESSED_COPPER_ANCIENT_BLANK_BALL = ITEMS.register("unprocessed_copper_ancient_blank_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_IRON_ANCIENT_BLANK_BALL = ITEMS.register("unprocessed_iron_ancient_blank_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_GOLD_ANCIENT_BLANK_BALL = ITEMS.register("unprocessed_gold_ancient_blank_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_DIAMOND_ANCIENT_BLANK_BALL = ITEMS.register("unprocessed_diamond_ancient_blank_ball",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> UNPROCESSED_ball_buttonS = ITEMS.register("unprocessed_ball_button",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BLANK_BLUEPRINT = ITEMS.register("blank_blueprint", SelfReturningItem::new);


    /* ********** Basic balls ********** */

    public static final DeferredItem<Item> UNPROCESSED_POKE_BALL = ITEMS.register("unprocessed_poke_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_AZURE_BALL = ITEMS.register("unprocessed_azure_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_CITRINE_BALL = ITEMS.register("unprocessed_citrine_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ROSEATE_BALL = ITEMS.register("unprocessed_roseate_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_SLATE_BALL = ITEMS.register("unprocessed_slate_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_VERDANT_BALL = ITEMS.register("unprocessed_verdant_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_PREMIER_BALL = ITEMS.register("unprocessed_premier_ball",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> POKE_BALL_BLUEPRINT = ITEMS.register("poke_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> AZURE_BALL_BLUEPRINT = ITEMS.register("azure_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> CITRINE_BALL_BLUEPRINT = ITEMS.register("citrine_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> ROSEATE_BALL_BLUEPRINT = ITEMS.register("roseate_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> SLATE_BALL_BLUEPRINT = ITEMS.register("slate_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> VERDANT_BALL_BLUEPRINT = ITEMS.register("verdant_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> PREMIER_BALL_BLUEPRINT = ITEMS.register("premier_ball_blueprint", SelfReturningItem::new);

            /* ********** TIER 1 balls ********** */


    public static final DeferredItem<Item> UNPROCESSED_HEAL_BALL = ITEMS.register("unprocessed_heal_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_SAFARI_BALL = ITEMS.register("unprocessed_safari_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEAL_BALL_BLUEPRINT =
            ITEMS.register("heal_ball_blueprint", SelfReturningItem::new);

        public static final DeferredItem<Item> SAFARI_BALL_BLUEPRINT = ITEMS.register("safari_ball_blueprint", SelfReturningItem::new);

            /* ********** TIER 2 balls ********** */

    public static final DeferredItem<Item> UNPROCESSED_GREAT_BALL = ITEMS.register("unprocessed_great_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_FAST_BALL = ITEMS.register("unprocessed_fast_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_LEVEL_BALL = ITEMS.register("unprocessed_level_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_LURE_BALL = ITEMS.register("unprocessed_lure_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_FRIEND_BALL = ITEMS.register("unprocessed_friend_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_HEAVY_BALL = ITEMS.register("unprocessed_heavy_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_MOON_BALL = ITEMS.register("unprocessed_moon_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_SPORT_BALL = ITEMS.register("unprocessed_sport_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_PARK_BALL = ITEMS.register("unprocessed_park_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_NET_BALL = ITEMS.register("unprocessed_net_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_DIVE_BALL = ITEMS.register("unprocessed_dive_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_NEST_BALL = ITEMS.register("unprocessed_nest_ball",
            () -> new Item(new Item.Properties()));
	

    public static final DeferredItem<Item> GREAT_BALL_BLUEPRINT =
            ITEMS.register("great_ball_blueprint", SelfReturningItem::new);

    public static final DeferredItem<Item> FAST_BALL_BLUEPRINT = ITEMS.register("fast_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> LEVEL_BALL_BLUEPRINT = ITEMS.register("level_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> LURE_BALL_BLUEPRINT = ITEMS.register("lure_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> FRIEND_BALL_BLUEPRINT = ITEMS.register("friend_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> HEAVY_BALL_BLUEPRINT = ITEMS.register("heavy_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> MOON_BALL_BLUEPRINT = ITEMS.register("moon_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> SPORT_BALL_BLUEPRINT = ITEMS.register("sport_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> PARK_BALL_BLUEPRINT = ITEMS.register("park_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> NET_BALL_BLUEPRINT = ITEMS.register("net_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> DIVE_BALL_BLUEPRINT = ITEMS.register("dive_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> NEST_BALL_BLUEPRINT = ITEMS.register("nest_ball_blueprint", SelfReturningItem::new);


            /* ********** TIER 3 balls ********** */


    public static final DeferredItem<Item> UNPROCESSED_LOVE_BALL = ITEMS.register("unprocessed_love_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ULTRA_BALL = ITEMS.register("unprocessed_ultra_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_REPEAT_BALL = ITEMS.register("unprocessed_repeat_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_TIMER_BALL = ITEMS.register("unprocessed_timer_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_QUICK_BALL = ITEMS.register("unprocessed_quick_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_DUSK_BALL = ITEMS.register("unprocessed_dusk_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_LUXURY_BALL = ITEMS.register("unprocessed_luxury_ball",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LOVE_BALL_BLUEPRINT = ITEMS.register("love_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> ULTRA_BALL_BLUEPRINT = ITEMS.register("ultra_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> REPEAT_BALL_BLUEPRINT = ITEMS.register("repeat_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> TIMER_BALL_BLUEPRINT = ITEMS.register("timer_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> QUICK_BALL_BLUEPRINT = ITEMS.register("quick_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> DUSK_BALL_BLUEPRINT = ITEMS.register("dusk_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> LUXURY_BALL_BLUEPRINT = ITEMS.register("luxury_ball_blueprint", SelfReturningItem::new);
    
    // Special balls
    public static final DeferredItem<Item> UNPROCESSED_CHERISH_BALL = ITEMS.register("unprocessed_cherish_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_BEAST_BALL = ITEMS.register("unprocessed_beast_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_DREAM_BALL = ITEMS.register("unprocessed_dream_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_MASTER_BALL = ITEMS.register("unprocessed_master_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_MASTER_BUTTON = ITEMS.register("unprocessed_master_button",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MASTER_BALL_UPPER_HALF = ITEMS.register("master_ball_upper_half",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MASTER_BALL_LOWER_HALF = ITEMS.register("master_ball_lower_half",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MASTER_BUTTON = ITEMS.register("master_button",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GOLD_CURVE = ITEMS.register("gold_curve",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CHERISH_BALL_BLUEPRINT = ITEMS.register("cherish_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> BEAST_BALL_BLUEPRINT = ITEMS.register("beast_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> DREAM_BALL_BLUEPRINT = ITEMS.register("dream_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> MASTER_BALL_BLUEPRINT = ITEMS.register("master_ball_blueprint", SelfReturningItem::new);

    // Ancient Ball


    /* ********** Basic balls ********** */

    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_POKE_BALL = ITEMS.register("unprocessed_ancient_poke_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_AZURE_BALL = ITEMS.register("unprocessed_ancient_azure_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_CITRINE_BALL = ITEMS.register("unprocessed_ancient_citrine_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_ROSEATE_BALL = ITEMS.register("unprocessed_ancient_roseate_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_SLATE_BALL = ITEMS.register("unprocessed_ancient_slate_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_VERDANT_BALL = ITEMS.register("unprocessed_ancient_verdant_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_IVORY_BALL = ITEMS.register("unprocessed_ancient_ivory_ball", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_GREAT_BALL = ITEMS.register("unprocessed_ancient_great_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_ULTRA_BALL = ITEMS.register("unprocessed_ancient_ultra_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_FEATHER_BALL = ITEMS.register("unprocessed_ancient_feather_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_WING_BALL = ITEMS.register("unprocessed_ancient_wing_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_JET_BALL = ITEMS.register("unprocessed_ancient_jet_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_HEAVY_BALL = ITEMS.register("unprocessed_ancient_heavy_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_LEADEN_BALL = ITEMS.register("unprocessed_ancient_leaden_ball", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_GIGATON_BALL = ITEMS.register("unprocessed_ancient_gigaton_ball", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_ORIGIN_BALL = ITEMS.register("unprocessed_ancient_origin_ball", () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> ANCIENT_POKE_BALL_BLUEPRINT = ITEMS.register("ancient_poke_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> ANCIENT_AZURE_BALL_BLUEPRINT = ITEMS.register("ancient_azure_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> ANCIENT_CITRINE_BALL_BLUEPRINT = ITEMS.register("ancient_citrine_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> ANCIENT_ROSEATE_BALL_BLUEPRINT = ITEMS.register("ancient_roseate_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> ANCIENT_SLATE_BALL_BLUEPRINT = ITEMS.register("ancient_slate_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> ANCIENT_VERDANT_BALL_BLUEPRINT = ITEMS.register("ancient_verdant_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> ANCIENT_IVORY_BALL_BLUEPRINT = ITEMS.register("ancient_ivory_ball_blueprint", SelfReturningItem::new);

    public static final DeferredItem<Item> ANCIENT_GREAT_BALL_BLUEPRINT = ITEMS.register("ancient_great_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> ANCIENT_ULTRA_BALL_BLUEPRINT = ITEMS.register("ancient_ultra_ball_blueprint", SelfReturningItem::new);

    public static final DeferredItem<Item> ANCIENT_FEATHER_BALL_BLUEPRINT = ITEMS.register("ancient_feather_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> ANCIENT_WING_BALL_BLUEPRINT = ITEMS.register("ancient_wing_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> ANCIENT_JET_BALL_BLUEPRINT = ITEMS.register("ancient_jet_ball_blueprint", SelfReturningItem::new);

    public static final DeferredItem<Item> ANCIENT_HEAVY_BALL_BLUEPRINT = ITEMS.register("ancient_heavy_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> ANCIENT_LEADEN_BALL_BLUEPRINT = ITEMS.register("ancient_leaden_ball_blueprint", SelfReturningItem::new);
    public static final DeferredItem<Item> ANCIENT_GIGATON_BALL_BLUEPRINT = ITEMS.register("ancient_gigaton_ball_blueprint", SelfReturningItem::new);

    public static final DeferredItem<Item> ANCIENT_ORIGIN_BALL_BLUEPRINT = ITEMS.register("ancient_origin_ball_blueprint", SelfReturningItem::new);

    // Fluid Buckets
    public static final DeferredItem<BucketItem> MEDICINAL_BREW_BUCKET = ITEMS.register("medicinal_brew_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MEDICINAL_BREW.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final DeferredItem<BucketItem> POTION_BUCKET = ITEMS.register("potion_bucket",
            () -> new BucketItem(ModFluids.SOURCE_POTION.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> SUPER_POTION_BUCKET = ITEMS.register("super_potion_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SUPER_POTION.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> HYPER_POTION_BUCKET = ITEMS.register("hyper_potion_bucket",
            () -> new BucketItem(ModFluids.SOURCE_HYPER_POTION.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> MAX_POTION_BUCKET = ITEMS.register("max_potion_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MAX_POTION.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> FULL_RESTORE_BUCKET = ITEMS.register("full_restore_bucket",
            () -> new BucketItem(ModFluids.SOURCE_FULL_RESTORE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> ANTIDOTE_BUCKET = ITEMS.register("antidote_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ANTIDOTE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> AWAKENING_BUCKET = ITEMS.register("awakening_bucket",
            () -> new BucketItem(ModFluids.SOURCE_AWAKENING.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> BURN_HEAL_BUCKET = ITEMS.register("burn_heal_bucket",
            () -> new BucketItem(ModFluids.SOURCE_BURN_HEAL.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> ICE_HEAL_BUCKET = ITEMS.register("ice_heal_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ICE_HEAL.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> PARALYZE_HEAL_BUCKET = ITEMS.register("paralyze_heal_bucket",
            () -> new BucketItem(ModFluids.SOURCE_PARALYZE_HEAL.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> FULL_HEAL_BUCKET = ITEMS.register("full_heal_bucket",
            () -> new BucketItem(ModFluids.SOURCE_FULL_HEAL.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> ETHER_BUCKET = ITEMS.register("ether_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ETHER.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> MAX_ETHER_BUCKET = ITEMS.register("max_ether_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MAX_ETHER.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> ELIXIR_BUCKET = ITEMS.register("elixir_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ELIXIR.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> MAX_ELIXIR_BUCKET = ITEMS.register("max_elixir_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MAX_ELIXIR.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> HP_UP_BUCKET = ITEMS.register("hp_up_bucket",
            () -> new BucketItem(ModFluids.SOURCE_HP_UP.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> PROTEIN_BUCKET = ITEMS.register("protein_bucket",
            () -> new BucketItem(ModFluids.SOURCE_PROTEIN.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> IRON_BUCKET = ITEMS.register("iron_bucket",
            () -> new BucketItem(ModFluids.SOURCE_IRON.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> CALCIUM_BUCKET = ITEMS.register("calcium_bucket",
            () -> new BucketItem(ModFluids.SOURCE_CALCIUM.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> ZINC_BUCKET = ITEMS.register("zinc_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ZINC.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> CARBOS_BUCKET = ITEMS.register("carbos_bucket",
            () -> new BucketItem(ModFluids.SOURCE_CARBOS.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> PP_UP_BUCKET = ITEMS.register("pp_up_bucket",
            () -> new BucketItem(ModFluids.SOURCE_PP_UP.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> PP_MAX_BUCKET = ITEMS.register("pp_max_bucket",
            () -> new BucketItem(ModFluids.SOURCE_PP_MAX.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> BERRY_JUICE_BUCKET = ITEMS.register("berry_juice_bucket",
            () -> new BucketItem(ModFluids.SOURCE_BERRY_JUICE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> ECHO_MATTER_BUCKET = ITEMS.register("echo_matter_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ECHO_MATTER.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<BucketItem> ABILITY_SOLUTION_BUCKET = ITEMS.register("ability_solution_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ABILITY_SOLUTION.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final DeferredItem<Item> ATTACK_PILLS = ITEMS.register("attack_pills",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEFENCE_PILLS = ITEMS.register("defence_pills",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPECIAL_ATTACK_PILLS = ITEMS.register("special_attack_pills",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPECIAL_DEFENCE_PILLS = ITEMS.register("special_defence_pills",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ACCURACY_PILLS = ITEMS.register("accuracy_pills",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPEED_PILLS = ITEMS.register("speed_pills",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GUARD_PILLS = ITEMS.register("guard_pills",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HIT_PILLS = ITEMS.register("hit_pills",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
