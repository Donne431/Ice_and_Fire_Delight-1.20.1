
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
				tabData.accept(IceAndFireDelightModItems.SPICY_CHIPS_FROM_SHINY_SCALES.get());
				tabData.accept(IceAndFireDelightModItems.SEA_SERPENT_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.COOKED_SEA_SERPENT_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.TROLL_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.COOKED_TROLL_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.CYCLOPS_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.CYCLOPS_STEAK.get());
				tabData.accept(IceAndFireDelightModItems.HYDRA_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.COOKED_HYDRA_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.FRESH_SOUP_FROM_SEA_SERPENT.get());
				tabData.accept(IceAndFireDelightModItems.HONEY_GLAZED_TROLL_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.FIRE_DRAGON_RAMEN.get());
				tabData.accept(IceAndFireDelightModItems.EYE_CHOWDER.get());
				tabData.accept(IceAndFireDelightModItems.HYDRA_VENOM_SOUP.get());
				tabData.accept(IceAndFireDelightModItems.FIRE_DRAGON_TACO.get());
				tabData.accept(IceAndFireDelightModItems.COOL_SANDWICH.get());
				tabData.accept(IceAndFireDelightModItems.LIGHTNING_DRAGON_HOTDOG.get());
				tabData.accept(IceAndFireDelightModItems.TROLL_INTESTINES.get());
				tabData.accept(IceAndFireDelightModItems.FIRE_MINCED_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.RAW_FIRE_SAUSAGE.get());
				tabData.accept(IceAndFireDelightModItems.FIRE_SAUSAGE.get());
				tabData.accept(IceAndFireDelightModItems.ICE_MINCED_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.RAW_ICE_SAUSAGE.get());
				tabData.accept(IceAndFireDelightModItems.ICE_SAUSAGE.get());
				tabData.accept(IceAndFireDelightModItems.LIGHTNING_MINCED_MEAT.get());
				tabData.accept(IceAndFireDelightModItems.RAW_LIGHTNING_SAUSAGE.get());
				tabData.accept(IceAndFireDelightModItems.LIGHTNING_SAUSAGE.get());
				tabData.accept(IceAndFireDelightModItems.RAW_DRAGON_SPECIAL_SAUSAGE.get());
				tabData.accept(IceAndFireDelightModItems.DRAGON_SPECIAL_SAUSAGE.get());
				tabData.accept(IceAndFireDelightModItems.EMPTY_MEASURING_CYLINDER.get());
				tabData.accept(IceAndFireDelightModItems.FIRE_LILY_EXTRACT.get());
				tabData.accept(IceAndFireDelightModItems.FROST_LILY_EXTRACT.get());
				tabData.accept(IceAndFireDelightModItems.LIGHTNING_LILY_EXTRACT.get());
				tabData.accept(IceAndFireDelightModItems.DRAGON_PIE_CRUST.get());
				tabData.accept(IceAndFireDelightModBlocks.FIERY_HOT_PIE.get().asItem());
				tabData.accept(IceAndFireDelightModItems.FIERY_HOT_PIE_SLICE.get());
				tabData.accept(IceAndFireDelightModBlocks.FROST_PIE.get().asItem());
				tabData.accept(IceAndFireDelightModItems.FROST_PIE_SLICE.get());
				tabData.accept(IceAndFireDelightModBlocks.ELECTRIC_PIE.get().asItem());
				tabData.accept(IceAndFireDelightModItems.ELECTRIC_PIE_SLICE.get());
				tabData.accept(IceAndFireDelightModBlocks.DRAGON_SPECIAL_PIE.get().asItem());
				tabData.accept(IceAndFireDelightModItems.DRAGON_SPECIAL_PIE_SLICE.get());
				tabData.accept(IceAndFireDelightModItems.SPICES_FROM_WITHERBONE.get());
				tabData.accept(IceAndFireDelightModItems.SPICES.get());
				tabData.accept(IceAndFireDelightModItems.FLOUR_FROM_DRAGON_BONES.get());
				tabData.accept(IceAndFireDelightModItems.DOUGH_FROM_DRAGON_BONES.get());
				tabData.accept(IceAndFireDelightModItems.DRAGON_BONE_BUN.get());
				tabData.accept(IceAndFireDelightModItems.MINI_PIZZA.get());
				tabData.accept(IceAndFireDelightModItems.MINI_PIZZA_BLANK.get());
				tabData.accept(IceAndFireDelightModItems.RAW_MINI_PIZZA_BLANK.get());
				tabData.accept(IceAndFireDelightModItems.SEA_SERPENT_SLICE.get());
				tabData.accept(IceAndFireDelightModItems.SEA_SERPENT_ROLL.get());
				tabData.accept(IceAndFireDelightModItems.COOKED_SEA_SERPENT_SLICE.get());
				tabData.accept(IceAndFireDelightModItems.SILVER_KNIFE.get());
				tabData.accept(IceAndFireDelightModItems.HYDRA_FANG_KNIFE.get());
				tabData.accept(IceAndFireDelightModItems.SEA_SERPENT_FANG_KNIFE.get());
			})

			.build());
}
