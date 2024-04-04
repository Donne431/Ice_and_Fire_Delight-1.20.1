
package net.donne431.ice_and_fire_delight.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LightningStrikeMobEffect extends MobEffect {
	public LightningStrikeMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1708222);
	}

	@Override
	public String getDescriptionId() {
		return "effect.ice_and_fire_delight.lightning_strike";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
