package net.donne431.ice_and_fire_delight.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.MobEffectEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GetFeelLikeADragonAdvProcedure {
	@SubscribeEvent
	public static void onMobEffectEvent(MobEffectEvent.Added event) {
		if (event != null && event.getEntity() != null && event.getEffectInstance() != null) {
			String effect = event.getEffectInstance().toString();
			int level = new Object() {
				int convert(String s) {
					try {
						return (int) Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(effect.substring(effect.indexOf("x ") + "x ".length(), effect.indexOf(",")));
			level = Math.max(1, level);
			int duration = new Object() {
				int convert(String s) {
					try {
						return (int) Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(effect.substring(effect.indexOf("Duration: ") + 10, effect.length()));
			effect = effect.replace("effect.", "").replace(".", ":").replace(",", "");
			effect = effect.substring(0, effect.indexOf(" "));
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(IceAndFireDelightModMobEffects.DRAGON_FLIGHT.get())) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ice_and_fire_delight:feel_like_a_dragon_adv"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}
}
