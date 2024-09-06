package net.donne431.ice_and_fire_delight.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class SpicyChipsFromShinyScalesTooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.getItem() == IceAndFireDelightModItems.SPICY_CHIPS_FROM_SHINY_SCALES.get()) {
			tooltip.add(1, Component.literal((Component.translatable("item.ice_and_fire_delight.tooltip.spicy_chips_from_shiny_scales.line1").getString())));
			tooltip.add(2, Component.literal((Component.translatable("item.ice_and_fire_delight.tooltip.spicy_chips_from_shiny_scales.line2").getString())));
		}
	}
}
