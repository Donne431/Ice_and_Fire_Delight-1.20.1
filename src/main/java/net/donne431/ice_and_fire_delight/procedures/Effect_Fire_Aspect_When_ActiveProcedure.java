package net.donne431.ice_and_fire_delight.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Effect_Fire_Aspect_When_ActiveProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		Entity victim = null;
		if (sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(IceAndFireDelightModMobEffects.FIRE_ASPECT.get())) {
			entity.setSecondsOnFire(15);
		}
	}
}
