
package net.donne431.ice_and_fire_delight.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class WarmingMobEffect extends MobEffect {
	public WarmingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6710785);
	}

	@Override
	public String getDescriptionId() {
		return "effect.ice_and_fire_delight.warming";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
