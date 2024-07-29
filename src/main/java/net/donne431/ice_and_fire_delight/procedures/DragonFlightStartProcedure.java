package net.donne431.ice_and_fire_delight.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModMobEffects;

public class DragonFlightStartProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(IceAndFireDelightModMobEffects.DRAGON_FLIGHT.get())) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = true;
				_player.onUpdateAbilities();
			}
		}
	}
}
