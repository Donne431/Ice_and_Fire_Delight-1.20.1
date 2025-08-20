package net.donne431.ice_and_fire_delight;

import net.donne431.ice_and_fire_delight.item.PhantomKnifeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "ice_and_fire_delight", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PhantomKnifeEventHandler {
    @SubscribeEvent
    public static void onPlayerInteract(PlayerInteractEvent.RightClickItem event) {
        Player player = event.getEntity();
        ItemStack stack = event.getItemStack();
        if (stack.getItem() instanceof PhantomKnifeItem) {
            PhantomKnifeItem.spawnPhantomKnifeEntity(stack, player);
        }
    }
}