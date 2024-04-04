
package net.donne431.ice_and_fire_delight.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class IceAndFireDelightModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("ice_and_fire_delight:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(IceAndFireDelightModItems.TROLL_INTESTINES.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ice_and_fire_delight.troll_intestines_jei"));
	}
}
