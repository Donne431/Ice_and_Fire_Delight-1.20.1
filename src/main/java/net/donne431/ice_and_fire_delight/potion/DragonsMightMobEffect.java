
package net.donne431.ice_and_fire_delight.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.donne431.ice_and_fire_delight.procedures.GetPowerOfThreeDragonsAdvProcedure;

public class DragonsMightMobEffect extends MobEffect {
	public DragonsMightMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16737895);
	}

	@Override
	public String getDescriptionId() {
		return "effect.ice_and_fire_delight.dragons_might";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		GetPowerOfThreeDragonsAdvProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
