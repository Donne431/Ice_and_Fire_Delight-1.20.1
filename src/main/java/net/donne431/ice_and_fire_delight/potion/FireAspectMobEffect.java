
package net.donne431.ice_and_fire_delight.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FireAspectMobEffect extends MobEffect {
	public FireAspectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -52686);
	}

	@Override
	public String getDescriptionId() {
		return "effect.ice_and_fire_delight.fire_aspect";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
