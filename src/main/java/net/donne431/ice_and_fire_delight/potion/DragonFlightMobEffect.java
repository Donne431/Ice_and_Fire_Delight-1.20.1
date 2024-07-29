
package net.donne431.ice_and_fire_delight.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.donne431.ice_and_fire_delight.procedures.DragonFlightStartProcedure;
import net.donne431.ice_and_fire_delight.procedures.DragonFlightEndProcedure;

public class DragonFlightMobEffect extends MobEffect {
	public DragonFlightMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -39322);
	}

	@Override
	public String getDescriptionId() {
		return "effect.ice_and_fire_delight.dragon_flight";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		DragonFlightStartProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		DragonFlightEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
