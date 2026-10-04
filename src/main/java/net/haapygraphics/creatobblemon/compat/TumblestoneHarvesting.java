package net.haapygraphics.creatobblemon.compat;

import java.util.HashMap;
import java.util.Map;

import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public final class TumblestoneHarvesting {

    private static final Logger LOGGER = LogUtils.getLogger();

    private static final Map<String, String> CLUSTER_TO_BUD = Map.of(
            "cobblemon:tumblestone_cluster",       "cobblemon:small_budding_tumblestone",
            "cobblemon:sky_tumblestone_cluster",   "cobblemon:small_budding_sky_tumblestone",
            "cobblemon:black_tumblestone_cluster", "cobblemon:small_budding_black_tumblestone"
    );

    private static Map<Block, Block> resolved;

    private TumblestoneHarvesting() {}

    private static Map<Block, Block> map() {
        if (resolved != null)
            return resolved;
        Map<Block, Block> result = new HashMap<>();
        CLUSTER_TO_BUD.forEach((clusterId, budId) -> {
            Block cluster = BuiltInRegistries.BLOCK.get(ResourceLocation.parse(clusterId));
            Block bud = BuiltInRegistries.BLOCK.get(ResourceLocation.parse(budId));
            result.put(cluster, bud);
        });
        resolved = result;
        return resolved;
    }

    @Nullable
    public static BlockState getReplantState(BlockState grown) {
        Block bud = map().get(grown.getBlock());
        if (bud == null)
            return null;
        BlockState out = bud.defaultBlockState();
        for (Property<?> property : out.getProperties())
            if (grown.hasProperty(property))
                out = copy(grown, out, property);
        return out;
    }

    private static <T extends Comparable<T>> BlockState copy(BlockState from, BlockState to, Property<T> property) {
        return to.setValue(property, from.getValue(property));
    }
}