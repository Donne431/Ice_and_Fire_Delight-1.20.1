package net.donne431.ice_and_fire_delight.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import vectorwing.farmersdelight.common.registry.ModBlockEntityTypes;
import net.donne431.ice_and_fire_delight.client.renderer.CustomCuttingBoardRenderer;

@Mod.EventBusSubscriber(modid = "ice_and_fire_delight", value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(
                ModBlockEntityTypes.CUTTING_BOARD.get(),
                CustomCuttingBoardRenderer::new
        );
    }
}