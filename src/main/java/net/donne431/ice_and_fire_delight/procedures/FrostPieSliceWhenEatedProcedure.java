package net.donne431.ice_and_fire_delight.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModMobEffects;

public class FrostPieSliceWhenEatedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(IceAndFireDelightModMobEffects.ICE_ASPECT.get(), 12000, 0));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(IceAndFireDelightModMobEffects.WARMING.get(), 6000, 0));
	}
}
