
package net.donne431.ice_and_fire_delight.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class IceAspectMobEffect extends MobEffect {
	public IceAspectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13474841);
	}

	@Override
	public String getDescriptionId() {
		return "effect.ice_and_fire_delight.ice_aspect";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
