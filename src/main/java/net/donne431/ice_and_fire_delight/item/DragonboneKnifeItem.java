
package net.donne431.ice_and_fire_delight.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class DragonboneKnifeItem extends KnifeItem {
	public DragonboneKnifeItem() {
		super(new Tier() {
			public int getUses() {
				return 1660;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(IafItemRegistry.DRAGON_BONE.get()));
			}
		}, 3, -2f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
