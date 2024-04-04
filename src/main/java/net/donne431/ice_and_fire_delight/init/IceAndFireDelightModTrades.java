
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.donne431.ice_and_fire_delight.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class IceAndFireDelightModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 6),

				new ItemStack(IceAndFireDelightModItems.CHIPS_FROM_SHINY_SCALES.get(), 5), 15, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 13),

				new ItemStack(IceAndFireDelightModItems.FRESH_SOUP_FROM_SEA_SERPENT.get()), 3, 5, 0.8f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4),

					new ItemStack(IceAndFireDelightModItems.SEA_SERPENT_MEAT.get()), 7, 5, 0.1f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6),

					new ItemStack(IceAndFireDelightModItems.SEA_SERPENT_MEAT.get()), 11, 5, 0.1f));
		}
		if (event.getType() == VillagerProfession.BUTCHER) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(IceAndFireDelightModItems.TROLL_MEAT.get()), 10, 5, 0.1f));
		}
	}
}
