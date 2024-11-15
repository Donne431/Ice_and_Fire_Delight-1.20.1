package net.donne431.ice_and_fire_delight.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModMobEffects;
import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModBlocks;

public class FrostPieWhenEatedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == IceAndFireDelightModBlocks.FROST_PIE.get()) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("farmersdelight:tools/knives")))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(IceAndFireDelightModMobEffects.FIRE_ASPECT.get(), 12000, 0));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(IceAndFireDelightModMobEffects.WARMING.get(), 6000, 0));
			}
		}
	}
}
