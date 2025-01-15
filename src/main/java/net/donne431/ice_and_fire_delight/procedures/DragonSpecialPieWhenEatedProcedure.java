package net.donne431.ice_and_fire_delight.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModMobEffects;
import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModBlocks;
import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModAttributes;
import net.donne431.ice_and_fire_delight.configuration.CommonConfigConfiguration;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DragonSpecialPieWhenEatedProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == IceAndFireDelightModBlocks.DRAGON_SPECIAL_PIE.get()) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("farmersdelight:tools/knives")))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(IceAndFireDelightModMobEffects.DRAGON_FLIGHT.get(), 24000, 0));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(IceAndFireDelightModMobEffects.DRAGONS_MIGHT.get(), 18000, 0));
				if (CommonConfigConfiguration.ENABLE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE.get() == true) {
					if (Math.random() < (double) CommonConfigConfiguration.CHANCE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE.get()) {
						if (((LivingEntity) entity).getAttribute(IceAndFireDelightModAttributes.NUMBEROFEXPLOSIONS.get()).getValue() <= (double) CommonConfigConfiguration.NUMBER_DEATH_BEFORE_EXPLOSIONS_STOP_WHEN_EATING_SPECIAL_PIE.get() - 1) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ice_and_fire_delight:too_much_power"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
							((LivingEntity) entity).getAttribute(IceAndFireDelightModAttributes.NUMBEROFEXPLOSIONS.get()).setBaseValue((((LivingEntity) entity).getAttribute(IceAndFireDelightModAttributes.NUMBEROFEXPLOSIONS.get()).getValue() + 1));
							if (world instanceof Level _level && !_level.isClientSide())
								_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.BLOCK);
						}
					}
				}
			}
		}
	}
}
