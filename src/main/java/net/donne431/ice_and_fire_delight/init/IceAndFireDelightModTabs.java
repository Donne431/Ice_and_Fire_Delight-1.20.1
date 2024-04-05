
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.donne431.ice_and_fire_delight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.donne431.ice_and_fire_delight.IceAndFireDelightMod;

public class IceAndFireDelightModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IceAndFireDelightMod.MODID);
	public static final RegistryObject<CreativeModeTab> ICE_AND_FIRE_DELIGHT_CREATIVE_TAB = REGISTRY.register("ice_and_fire_delight_creative_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.ice_and_fire_delight.ice_and_fire_delight_creative_tab")).icon(() -> new ItemStack(IceAndFireDelightModItems.FRESH_SOUP_FROM_SEA_SERPENT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(IceAndFireDelightModItems.ECTOPLASM_JELLY.get());
				tabData.accept(IceAndFireDelightModItems.FRIED_DRAGON_EGG.get());
				tabData.accept(IceAndFireDelightModItems.MYRMEX_RESIN_COOKIE_JUNGLE.get());
				tabData.accept(IceAndFireDelightModItems.MYRMEX_RESIN_COOKIE_DESERT.get());
				tabData.accept(IceAndFireDelightModItems.CHIPS_FROM_SHINY_SCALES.get());
				tabData.accept(IceAndFireDelightModItems.SEA_SERPENT_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.COOKED_SEA_SERPENT_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.TROLL_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.COOKED_TROLL_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.FRESH_SOUP_FROM_SEA_SERPENT.get());
				tabData.accept(IceAndFireDelightModItems.HONEY_GLAZED_TROLL_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.TROLL_INTESTINES.get());
				tabData.accept(IceAndFireDelightModItems.FIRE_MINCED_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.RAW_FIRE_SAUSAGE.get());
				tabData.accept(IceAndFireDelightModItems.FIRE_SAUSAGE.get());
				tabData.accept(IceAndFireDelightModItems.ICE_MINCED_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.RAW_ICE_SAUSAGE.get());
				tabData.accept(IceAndFireDelightModItems.ICE_SAUSAGE.get());
				tabData.accept(IceAndFireDelightModItems.SPICES_FROM_WITHERBONE.get());
				tabData.accept(IceAndFireDelightModItems.SPICY_CHIPS_FROM_SHINY_SCALES.get());
				tabData.accept(IceAndFireDelightModItems.CYCLOPS_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.CYCLOPS_STEAK.get());
			})

			.build());
}
