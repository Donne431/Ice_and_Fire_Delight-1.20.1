
package net.donne431.ice_and_fire_delight.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DragonsMightMobEffect extends MobEffect {
	public DragonsMightMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16737895);
	}

	@Override
	public String getDescriptionId() {
		return "effect.ice_and_fire_delight.dragons_might";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
