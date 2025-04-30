package net.donne431.ice_and_fire_delight;

import net.donne431.ice_and_fire_delight.potion.IceAspectMobEffect;
import net.donne431.ice_and_fire_delight.potion.WarmingMobEffect;
import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModMobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.github.alexthe666.iceandfire.entity.props.EntityDataProvider;
import net.donne431.ice_and_fire_delight.IceAndFireDelightMod;

@Mod.EventBusSubscriber(modid = IceAndFireDelightMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEventHandler {

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        // Проверяем, есть ли источник урона (атакующий)
        if (event.getSource().getEntity() instanceof LivingEntity attacker) {
            // Проверяем, есть ли у атакующего эффект IceAspect
            if (attacker.hasEffect(IceAndFireDelightModMobEffects.ICE_ASPECT.get())) {
                LivingEntity target = event.getEntity(); // Жертва удара

                // Применяем эффекты к жертве
                // Заморозка применяется только если у жертвы нет эффекта Cold Resistance
                if (!target.hasEffect(IceAndFireDelightModMobEffects.WARMING.get())) {
                    EntityDataProvider.getCapability(target).ifPresent(data -> data.frozenData.setFrozen(target, 300));
                	target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 2));
                }
                target.knockback(1F, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
            }
        }
    }
}