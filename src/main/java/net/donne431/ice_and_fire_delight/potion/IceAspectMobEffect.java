package net.donne431.ice_and_fire_delight.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class IceAspectMobEffect extends MobEffect {
    public IceAspectMobEffect() {
        super(MobEffectCategory.BENEFICIAL, -13474841); // Цвет эффекта: голубоватый оттенок
    }

    @Override
    public String getDescriptionId() {
        return "effect.ice_and_fire_delight.ice_aspect";
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return false; // Эффект не требует тикового обновления
    }
}