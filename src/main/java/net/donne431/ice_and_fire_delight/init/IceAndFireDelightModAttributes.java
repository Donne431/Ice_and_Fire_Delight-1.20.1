/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.donne431.ice_and_fire_delight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EntityType;

import net.donne431.ice_and_fire_delight.IceAndFireDelightMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IceAndFireDelightModAttributes {
	public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, IceAndFireDelightMod.MODID);
	public static final RegistryObject<Attribute> NUMBEROFEXPLOSIONS = ATTRIBUTES.register("number_of_explosions", () -> (new RangedAttribute("attribute." + IceAndFireDelightMod.MODID + ".number_of_explosions", 0, 0, 9999)).setSyncable(true));

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ATTRIBUTES.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(EntityType.PLAYER, NUMBEROFEXPLOSIONS.get());
	}

	@Mod.EventBusSubscriber
	private class Utils {
		@SubscribeEvent
		public static void persistAttributes(PlayerEvent.Clone event) {
			Player oldP = event.getOriginal();
			Player newP = (Player) event.getEntity();
			newP.getAttribute(NUMBEROFEXPLOSIONS.get()).setBaseValue(oldP.getAttribute(NUMBEROFEXPLOSIONS.get()).getBaseValue());
		}
	}
}
