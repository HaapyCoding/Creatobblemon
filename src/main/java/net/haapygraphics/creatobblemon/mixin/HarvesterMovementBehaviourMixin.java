package net.haapygraphics.creatobblemon.mixin;

import org.apache.commons.lang3.mutable.MutableBoolean;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.haapygraphics.creatobblemon.compat.TumblestoneHarvesting;
import com.simibubi.create.api.behaviour.movement.MovementBehaviour;
import com.simibubi.create.content.contraptions.actors.harvester.HarvesterMovementBehaviour;
import com.simibubi.create.content.contraptions.behaviour.MovementContext;
import com.simibubi.create.foundation.utility.BlockHelper;
import com.simibubi.create.infrastructure.config.AllConfigs;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

@Mixin(HarvesterMovementBehaviour.class)
public abstract class HarvesterMovementBehaviourMixin {

    @Inject(method = "visitNewPosition", at = @At("HEAD"), cancellable = true)
    private void creatobblemon$harvestTumblestone(MovementContext context, BlockPos pos, CallbackInfo ci) {
        Level level = context.world;
        if (level.isClientSide)
            return;

        BlockState grown = level.getBlockState(pos);
        BlockState replant = TumblestoneHarvesting.getReplantState(grown);
        if (replant == null)
            return;

        ci.cancel();

        boolean replants = AllConfigs.server().kinetics.harvesterReplants.get();
        Item seed = replant.getBlock().asItem();
        MutableBoolean seedTaken = new MutableBoolean(!replants || seed == Items.AIR);
        MovementBehaviour self = (MovementBehaviour) (Object) this;

        BlockHelper.destroyBlockAs(level, pos, null, new ItemStack(Items.IRON_PICKAXE), 1, stack -> {
            if (!seedTaken.booleanValue() && stack.is(seed)) {
                stack.shrink(1);
                seedTaken.setTrue();
            }
            if (!stack.isEmpty())
                self.collectOrDropItem(context, stack);
        });

        if (replants && replant.canSurvive(level, pos))
            level.setBlockAndUpdate(pos, replant);
        else
            level.setBlockAndUpdate(pos, level.getFluidState(pos).createLegacyBlock());
    }
}