package net.donne431.ice_and_fire_delight.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.player.Player;
import net.minecraft.nbt.CompoundTag;

import net.donne431.ice_and_fire_delight.procedures.GetCenterOfWeaknessAdvProcedure;

public class CenterOfWeaknessMobEffect extends MobEffect {
    public CenterOfWeaknessMobEffect() {
        super(MobEffectCategory.BENEFICIAL, -3355444); // Полезный эффект, цвет тёмно-серый
    }

    @Override
    public String getDescriptionId() {
        return "effect.ice_and_fire_delight.center_of_weakness"; // ID описания для локализации
    }
    
    @Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		GetCenterOfWeaknessAdvProcedure.execute(entity);
	}

    // Вызывается каждый тик, пока эффект активен на сущности
    @Override
    public void applyEffectTick(@NotNull LivingEntity entity, int amplifier) {
        Level world = entity.level(); // Получаем мир, в котором находится сущность
        double range = 10.0D; // Радиус действия — 10 блоков

        // Создаём область поиска (AABB) вокруг сущности
        AABB aabb = new AABB(
            entity.getX() - range, entity.getY() - range, entity.getZ() - range,
            entity.getX() + range, entity.getY() + range, entity.getZ() + range
        );

        // Перебираем всех мобов в радиусе 10 блоков
        for (Mob mob : world.getEntitiesOfClass(Mob.class, aabb)) {
            // Проверяем, является ли моб врагом
            if (!mob.is(entity) && !mob.isAlliedTo(entity) &&
                (mob.getTarget() == entity || mob.getLastHurtByMob() == entity || mob instanceof Enemy)) {
                // Накладываем слабость 2 уровня на 10 тиков
                mob.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 10, 1, false, false));
            }
        }
    }

    // Указывает, что эффект должен срабатывать каждый тик
    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true; // Эффект активен каждый тик
    }
}