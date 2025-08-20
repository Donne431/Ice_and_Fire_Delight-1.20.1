
package net.donne431.ice_and_fire_delight.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.donne431.ice_and_fire_delight.procedures.DragonsteelFireKnifeAttackProcedure;

import java.util.List;

import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class DragonsteelFireKnifeItem extends KnifeItem {
	public DragonsteelFireKnifeItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(IafItemRegistry.DRAGONSTEEL_FIRE_INGOT.get())); // Нож можно починить с помощью огненного драконосталевого слитка
			}
		}, 3, -2f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		DragonsteelFireKnifeAttackProcedure.execute(entity); // Выполняется процедура
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
