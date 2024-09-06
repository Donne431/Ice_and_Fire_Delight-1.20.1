package net.donne431.ice_and_fire_delight.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModMobEffects;

public class HydraVenomSoupWhenDrinkedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.9) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(IceAndFireDelightModMobEffects.POISON_RESISTANCE.get(), 18000, 0));
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 1800, 0));
		}
	}
}
