
package net.donne431.ice_and_fire_delight.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.donne431.ice_and_fire_delight.procedures.DragonSpecialSausageWhenEatedProcedure;

import java.util.List;

public class DragonSpecialSausageItem extends Item {
	public DragonSpecialSausageItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(11).saturationMod(0.8f).alwaysEat().meat().build()));
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
		DragonSpecialSausageWhenEatedProcedure.execute(world, x, y, z, entity);
		return retval;
	}
}
