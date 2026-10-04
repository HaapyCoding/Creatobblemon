package net.haapygraphics.creatobblemon;

import net.haapygraphics.creatobblemon.block.ModBlocks;
import net.haapygraphics.creatobblemon.fluid.ModFluidTypes;
import net.haapygraphics.creatobblemon.fluid.ModFluids;
import net.haapygraphics.creatobblemon.item.CreatobblemonCreativeModeTabs;
import net.haapygraphics.creatobblemon.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(Creatobblemon.MODID)
public class Creatobblemon {
    public static final String MODID = "creatobblemon";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Creatobblemon(IEventBus modEventBus, ModContainer modContainer) {

        CreatobblemonCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

}
