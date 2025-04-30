package net.donne431.ice_and_fire_delight;

import net.donne431.ice_and_fire_delight.EffectRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = EffectRegistry.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EffectInitializer {
    @SubscribeEvent
    public static void onSetup(FMLCommonSetupEvent event) {
        EffectRegistry.init();
    }
}