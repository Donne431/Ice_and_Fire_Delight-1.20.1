package net.donne431.ice_and_fire_delight.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.item.ItemStack;
import vectorwing.farmersdelight.common.block.CuttingBoardBlock;
import vectorwing.farmersdelight.common.block.entity.CuttingBoardBlockEntity;

import javax.annotation.Nullable;

public class BlackDragonCuttingBoardBlock extends CuttingBoardBlock {
    public BlackDragonCuttingBoardBlock() {
        super(BlockBehaviour.Properties.of()
                .strength(2.5F)
                .sound(net.minecraft.world.level.block.SoundType.WOOD));
        this.registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, net.minecraft.core.Direction.NORTH)
                .setValue(WATERLOGGED, false));
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CuttingBoardBlockEntity(pos, state);
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        super.setPlacedBy(level, pos, state, placer, stack);
        BlockEntity entity = level.getBlockEntity(pos);
        if (entity != null) {
            entity.setChanged();
        }
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        InteractionResult result = super.use(state, level, pos, player, hand, hit);
        if (result.consumesAction()) {
            BlockEntity entity = level.getBlockEntity(pos);
            if (entity != null) {
                entity.setChanged();
            }
        }
        return result;
    }
}