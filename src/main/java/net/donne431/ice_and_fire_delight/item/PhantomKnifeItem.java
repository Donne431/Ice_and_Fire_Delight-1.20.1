package net.donne431.ice_and_fire_delight.item;

import com.github.alexthe666.iceandfire.entity.EntityGhostSword;
import com.github.alexthe666.iceandfire.entity.IafEntityRegistry;
import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.TooltipFlag;
import com.google.common.collect.Multimap;
import net.minecraft.ChatFormatting;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class PhantomKnifeItem extends SwordItem {

    public PhantomKnifeItem() {
        super(new Tier() {
            @Override
            public int getUses() {
                return IafItemRegistry.GHOST_SWORD_TOOL_MATERIAL.getUses();
            }

            @Override
            public float getSpeed() {
                return IafItemRegistry.GHOST_SWORD_TOOL_MATERIAL.getSpeed();
            }

            @Override
            public float getAttackDamageBonus() {
                return IafItemRegistry.GHOST_SWORD_TOOL_MATERIAL.getAttackDamageBonus();
            }

            @Override
            public int getLevel() {
                return IafItemRegistry.GHOST_SWORD_TOOL_MATERIAL.getLevel();
            }

            @Override
            public int getEnchantmentValue() {
                return IafItemRegistry.GHOST_SWORD_TOOL_MATERIAL.getEnchantmentValue();
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(IafItemRegistry.GHOST_INGOT.get()));
            }
        }, 5, -1.0F, new Item.Properties());
    }

    public static void spawnPhantomKnifeEntity(ItemStack stack, Player playerEntity) {
        if (playerEntity.getCooldowns().isOnCooldown(stack.getItem()))
            return;
        if (playerEntity.getItemInHand(InteractionHand.MAIN_HAND) != stack)
            return;
        final Multimap<Attribute, AttributeModifier> dmg = stack.getAttributeModifiers(EquipmentSlot.MAINHAND);
        double totalDmg = 0D;
        for (AttributeModifier modifier : dmg.get(Attributes.ATTACK_DAMAGE)) {
            totalDmg += modifier.getAmount();
        }
        playerEntity.playSound(SoundEvents.ZOMBIE_INFECT, 1, 1);
        EntityGhostSword shot = new EntityGhostSword(IafEntityRegistry.GHOST_SWORD.get(), playerEntity.level(), playerEntity, totalDmg * 0.5F);
        shot.shootFromRotation(playerEntity, playerEntity.getXRot(), playerEntity.getYRot(), 0.0F, 1, 0.5f);
        playerEntity.level().addFreshEntity(shot);
        stack.hurtAndBreak(1, playerEntity, entity -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        playerEntity.getCooldowns().addCooldown(stack.getItem(), 10);
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack stack, @NotNull LivingEntity targetEntity, @NotNull LivingEntity attacker) {
        return super.hurtEnemy(stack, targetEntity, attacker);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, @NotNull TooltipFlag flagIn) {
        tooltip.add(Component.translatable("item.iceandfire.legendary_weapon.desc").withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.translatable("item.ice_and_fire_delight.tooltip.phantom_knife_line1").withStyle(ChatFormatting.GRAY));
    }
}