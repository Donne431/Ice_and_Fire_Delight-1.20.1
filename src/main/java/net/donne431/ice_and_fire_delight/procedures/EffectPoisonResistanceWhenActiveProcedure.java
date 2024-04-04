package net.donne431.ice_and_fire_delight.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EffectPoisonResistanceWhenActiveProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		Entity victim = null;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(IceAndFireDelightModMobEffects.POISON_RESISTANCE.get())) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
		}
	}
}
