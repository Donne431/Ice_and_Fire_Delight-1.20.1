package net.donne431.ice_and_fire_delight.procedures;

import net.minecraft.world.entity.Entity;

public class DragonsteelFireKnifeAttackProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
