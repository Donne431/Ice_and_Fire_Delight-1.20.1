
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.donne431.ice_and_fire_delight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.donne431.ice_and_fire_delight.potion.WarmingMobEffect;
import net.donne431.ice_and_fire_delight.potion.PoisonResistanceMobEffect;
import net.donne431.ice_and_fire_delight.potion.LightningStrikeMobEffect;
import net.donne431.ice_and_fire_delight.potion.IceAspectMobEffect;
import net.donne431.ice_and_fire_delight.potion.FireAspectMobEffect;
import net.donne431.ice_and_fire_delight.IceAndFireDelightMod;

public class IceAndFireDelightModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, IceAndFireDelightMod.MODID);
	public static final RegistryObject<MobEffect> FIRE_ASPECT = REGISTRY.register("fire_aspect", () -> new FireAspectMobEffect());
	public static final RegistryObject<MobEffect> ICE_ASPECT = REGISTRY.register("ice_aspect", () -> new IceAspectMobEffect());
	public static final RegistryObject<MobEffect> LIGHTNING_STRIKE = REGISTRY.register("lightning_strike", () -> new LightningStrikeMobEffect());
	public static final RegistryObject<MobEffect> POISON_RESISTANCE = REGISTRY.register("poison_resistance", () -> new PoisonResistanceMobEffect());
	public static final RegistryObject<MobEffect> WARMING = REGISTRY.register("warming", () -> new WarmingMobEffect());
}
