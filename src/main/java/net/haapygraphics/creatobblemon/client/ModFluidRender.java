package net.haapygraphics.creatobblemon.client;

import net.haapygraphics.creatobblemon.Creatobblemon;
import net.haapygraphics.creatobblemon.fluid.ModFluidTypes;
import net.haapygraphics.creatobblemon.fluid.ModFluids;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;

@EventBusSubscriber(modid = Creatobblemon.MODID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ModFluidRender {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        // Tell Minecraft that our custom fluids should be rendered as translucent
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_MEDICINAL_BREW.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_MEDICINAL_BREW.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_POTION.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_POTION.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_SUPER_POTION.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_SUPER_POTION.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_HYPER_POTION.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_HYPER_POTION.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_MAX_POTION.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_MAX_POTION.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_FULL_RESTORE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_FULL_RESTORE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_ANTIDOTE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_ANTIDOTE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_AWAKENING.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_AWAKENING.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_BURN_HEAL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_BURN_HEAL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_ICE_HEAL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_ICE_HEAL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_PARALYZE_HEAL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_PARALYZE_HEAL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_FULL_HEAL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_FULL_HEAL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_ETHER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_ETHER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_MAX_ETHER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_MAX_ETHER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_ELIXIR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_ELIXIR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_MAX_ELIXIR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_MAX_ELIXIR.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_HP_UP.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_HP_UP.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_PROTEIN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_PROTEIN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_IRON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_IRON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_CALCIUM.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_CALCIUM.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_ZINC.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_ZINC.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_CARBOS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_CARBOS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_PP_UP.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_PP_UP.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_BERRY_JUICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_BERRY_JUICE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_ECHO_MATTER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_ECHO_MATTER.get(), RenderType.translucent());

        });
    }

    @SubscribeEvent
    public static void registerClientExtensions(RegisterClientExtensionsEvent event) {
        registerFluidExtension(event, ModFluidTypes.MEDICINAL_BREW_FLUID_TYPE.get(), 0xFF2EBCA2);
        registerFluidExtension(event, ModFluidTypes.POTION_FLUID_TYPE.get(), 0xFF916DB8);
        registerFluidExtension(event, ModFluidTypes.SUPER_POTION_FLUID_TYPE.get(), 0xFFCE7B6B);
        registerFluidExtension(event, ModFluidTypes.HYPER_POTION_FLUID_TYPE.get(), 0xFFEE9DD9);
        registerFluidExtension(event, ModFluidTypes.MAX_POTION_FLUID_TYPE.get(), 0xFF2078C0);
        registerFluidExtension(event, ModFluidTypes.FULL_RESTORE_FLUID_TYPE.get(), 0xFF62AA36);
        registerFluidExtension(event, ModFluidTypes.ANTIDOTE_FLUID_TYPE.get(), 0xFFFAD951);
        registerFluidExtension(event, ModFluidTypes.AWAKENING_FLUID_TYPE.get(), 0xFF71D9E9);
        registerFluidExtension(event, ModFluidTypes.BURN_HEAL_FLUID_TYPE.get(), 0xFF68E08C);
        registerFluidExtension(event, ModFluidTypes.ICE_HEAL_FLUID_TYPE.get(), 0xFFFA9F96);
        registerFluidExtension(event, ModFluidTypes.PARALYZE_HEAL_FLUID_TYPE.get(), 0xFFD2EA42);
        registerFluidExtension(event, ModFluidTypes.FULL_HEAL_FLUID_TYPE.get(), 0xFFDAD21E);
        registerFluidExtension(event, ModFluidTypes.ETHER_FLUID_TYPE.get(), 0xFFD8A8E0);
        registerFluidExtension(event, ModFluidTypes.MAX_ETHER_FLUID_TYPE.get(), 0xFFB9F197);
        registerFluidExtension(event, ModFluidTypes.ELIXIR_FLUID_TYPE.get(), 0xFFF1B097);
        registerFluidExtension(event, ModFluidTypes.MAX_ELIXIR_FLUID_TYPE.get(), 0xFF97F1E4);
        registerFluidExtension(event, ModFluidTypes.HP_UP_FLUID_TYPE.get(), 0xFF508DEF);
        registerFluidExtension(event, ModFluidTypes.PROTEIN_FLUID_TYPE.get(), 0xFFE48F0B);
        registerFluidExtension(event, ModFluidTypes.IRON_FLUID_TYPE.get(), 0xFF269B27);
        registerFluidExtension(event, ModFluidTypes.CALCIUM_FLUID_TYPE.get(), 0xFFDF432A);
        registerFluidExtension(event, ModFluidTypes.ZINC_FLUID_TYPE.get(), 0xFF72CA2A);
        registerFluidExtension(event, ModFluidTypes.CARBOS_FLUID_TYPE.get(), 0xFF1D90DF);
        registerFluidExtension(event, ModFluidTypes.PP_UP_FLUID_TYPE.get(), 0xFF3EA3A1);
        registerFluidExtension(event, ModFluidTypes.PP_MAX_FLUID_TYPE.get(), 0xFFB26CB8);
        registerFluidExtension(event, ModFluidTypes.BERRY_JUICE_FLUID_TYPE.get(), 0xFFE8B870);
        registerLavaLikeFluidExtension(event, ModFluidTypes.ECHO_MATTER_FLUID_TYPE.get(), 0xFFA0E2FE);
        registerAbilityLikeFluidExtension(event, ModFluidTypes.ABILITY_SOLUTION_FLUID_TYPE.get(), 0xFFA0E2FE);
    }

    private static void registerFluidExtension(RegisterClientExtensionsEvent event, FluidType fluidType, int tintColor) {
        event.registerFluidType(new IClientFluidTypeExtensions() {
            private static final ResourceLocation STILL = ResourceLocation.withDefaultNamespace("block/water_still");
            private static final ResourceLocation FLOWING = ResourceLocation.withDefaultNamespace("block/water_flow");
            private static final ResourceLocation OVERLAY = ResourceLocation.withDefaultNamespace("block/water_overlay");

            @Override
            public ResourceLocation getStillTexture() {
                return STILL;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return FLOWING;
            }

            @Override
            public ResourceLocation getOverlayTexture() {
                return OVERLAY;
            }

            @Override
            public int getTintColor() {
                return tintColor;
            }
        }, fluidType);
    }

    private static void registerLavaLikeFluidExtension(RegisterClientExtensionsEvent event, FluidType fluidType, int tintColor) {
        event.registerFluidType(new IClientFluidTypeExtensions() {
            private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath(Creatobblemon.MODID, "block/echo_matter_still");
            private static final ResourceLocation FLOWING = ResourceLocation.fromNamespaceAndPath(Creatobblemon.MODID, "block/echo_matter_flow");

            @Override
            public ResourceLocation getStillTexture() {
                return STILL;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return FLOWING;
            }

            @Override
            public int getTintColor() {
                return tintColor;
            }
        }, fluidType);
    }

    private static void registerAbilityLikeFluidExtension(RegisterClientExtensionsEvent event, FluidType fluidType, int tintColor) {
        event.registerFluidType(new IClientFluidTypeExtensions() {
            private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath(Creatobblemon.MODID, "block/ability_still");
            private static final ResourceLocation FLOWING = ResourceLocation.fromNamespaceAndPath(Creatobblemon.MODID, "block/ability_flow");

            @Override
            public ResourceLocation getStillTexture() {
                return STILL;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return FLOWING;
            }

            @Override
            public int getTintColor() {
                return tintColor;
            }
        }, fluidType);
    }
}
