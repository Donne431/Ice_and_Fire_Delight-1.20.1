
package net.donne431.ice_and_fire_delight.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.player.Player;
import net.minecraft.nbt.CompoundTag;

import net.donne431.ice_and_fire_delight.procedures.GetFeelLikeADragonAdvProcedure;

public class DragonFlightMobEffect extends MobEffect {
	public DragonFlightMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -39322);
	}

	@Override
	public String getDescriptionId() {
		return "effect.ice_and_fire_delight.dragon_flight";
	}

	@Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity instanceof Player player) {
            player.getAbilities().mayfly = true;
            CompoundTag tag = player.getPersistentData();
            tag.putBoolean("HasFlightEffect", true);
            tag.putBoolean("WasFlying", player.getAbilities().flying); // Обновляется в реальном времени
        }
    }

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		GetFeelLikeADragonAdvProcedure.execute(entity);
	}
	
    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }

    @Override
    public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        if (entity instanceof Player player) {
            boolean wasFlying = player.getAbilities().flying;
            player.getAbilities().mayfly = player.isCreative() || player.isSpectator();
            if (!player.isCreative() && !player.isSpectator()) {
                player.getAbilities().flying = false;
            } else {
                player.getAbilities().flying = wasFlying;
            }
            CompoundTag tag = player.getPersistentData();
            tag.remove("HasFlightEffect");
            tag.remove("WasFlying");
            player.onUpdateAbilities();
        }
        super.removeAttributeModifiers(entity, attributeMap, amplifier);
    }
}