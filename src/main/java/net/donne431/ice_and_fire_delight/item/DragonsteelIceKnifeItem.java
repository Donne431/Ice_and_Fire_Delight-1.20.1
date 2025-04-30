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
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import java.util.List;
import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import vectorwing.farmersdelight.common.item.KnifeItem;
import com.github.alexthe666.iceandfire.IafConfig;
import com.github.alexthe666.iceandfire.entity.EntityDeathWorm;
import com.github.alexthe666.iceandfire.entity.props.EntityDataProvider;
import com.github.alexthe666.iceandfire.entity.props.CapabilityHandler;
import com.github.alexthe666.iceandfire.event.ServerEvents;
import com.google.common.collect.Multimap;
import net.minecraft.ChatFormatting;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import javax.annotation.Nullable;

import net.donne431.ice_and_fire_delight.potion.WarmingMobEffect;

import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModMobEffects;

public class DragonsteelIceKnifeItem extends KnifeItem {
    public DragonsteelIceKnifeItem() {
        super(new Tier() {
            public int getUses() {
                return 2000;
            }

            public float getSpeed() {
                return 4f; // скорость атаки - 2
            }

            public float getAttackDamageBonus() {
                return 6f; // урон - 10
            }

            public int getLevel() {
                return 1;
            }

            public int getEnchantmentValue() {
                return 2;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(IafItemRegistry.DRAGONSTEEL_ICE_INGOT.get())); // Нож можно починить с помощью ледяного драконосталевого слитка
            }
        }, 3, -2f, new Item.Properties());
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        // Получаем capability
        if (!entity.hasEffect(IceAndFireDelightModMobEffects.WARMING.get())) { // Если у жертвы нет эффекта "Устойчивость к холоду", тогда применяем на неё эффекты
       		EntityDataProvider.getCapability(entity).ifPresent(data -> data.frozenData.setFrozen(entity, 300)); // Заморозка жертвы
        	entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 2)); // Замедление жертвы
        }
        entity.knockback(1F, sourceentity.getX() - entity.getX(), sourceentity.getZ() - entity.getZ()); // Откидывание на 1 блок жертвы
        return retval;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
    }
}