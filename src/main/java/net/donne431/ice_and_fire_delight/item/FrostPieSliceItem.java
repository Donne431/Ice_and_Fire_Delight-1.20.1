
package net.donne431.ice_and_fire_delight.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.Component;

import net.minecraft.world.entity.LivingEntity;

import net.donne431.ice_and_fire_delight.procedures.FrostPieSliceWhenEatedProcedure;

import java.util.List;

public class FrostPieSliceItem extends Item {
	public FrostPieSliceItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.4f).fast().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		FrostPieSliceWhenEatedProcedure.execute(entity);
		return retval;
	}

}
