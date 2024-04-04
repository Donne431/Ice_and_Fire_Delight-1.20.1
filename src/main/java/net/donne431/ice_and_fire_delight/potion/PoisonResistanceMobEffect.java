
package net.donne431.ice_and_fire_delight.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.donne431.ice_and_fire_delight.procedures.EffectPoisonResistanceWhenActiveProcedure;

public class PoisonResistanceMobEffect extends MobEffect {
	public PoisonResistanceMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10053376);
	}

	@Override
	public String getDescriptionId() {
		return "effect.ice_and_fire_delight.poison_resistance";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EffectPoisonResistanceWhenActiveProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
