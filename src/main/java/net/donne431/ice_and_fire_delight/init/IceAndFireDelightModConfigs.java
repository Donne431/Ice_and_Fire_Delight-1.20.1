package net.donne431.ice_and_fire_delight.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.donne431.ice_and_fire_delight.configuration.ConfigurationConfiguration;
import net.donne431.ice_and_fire_delight.IceAndFireDelightMod;

@Mod.EventBusSubscriber(modid = IceAndFireDelightMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class IceAndFireDelightModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigurationConfiguration.SPEC, "ice_and_fire_delight-common.toml");
		});
	}
}
