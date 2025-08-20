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

public class CenterOfWeaknessMobEffect extends MobEffect {
    public CenterOfWeaknessMobEffect() {
        super(MobEffectCategory.BENEFICIAL, -3355444); // Полезный эффект, цвет тёмно-серый
    }

    @Override
    public String getDescriptionId() {
        return "effect.ice_and_fire_delight.center_of_weakness"; // ID описания для локализации
    }

    // Вызывается каждый тик, пока эффект активен на сущности
    @Override
    public void applyEffectTick(@NotNull LivingEntity entity, int amplifier) {
        Level world = entity.level(); // Получаем мир, в котором находится сущность
        double maxRange = 10.0D; // Максимальный радиус действия — 10 блоков
        double innerRange = 4.0D; // Внутренний радиус для слабости 2 уровня — 4 блока

        // Создаём область поиска (AABB) для максимального радиуса
        AABB aabb = new AABB(
            entity.getX() - maxRange, entity.getY() - maxRange, entity.getZ() - maxRange,
            entity.getX() + maxRange, entity.getY() + maxRange, entity.getZ() + maxRange
        );

        // Перебираем всех мобов в радиусе 10 блоков
        for (Mob mob : world.getEntitiesOfClass(Mob.class, aabb)) {
            // Проверяем, является ли моб врагом
            if (!mob.is(entity) && !mob.isAlliedTo(entity) &&
                (mob.getTarget() == entity || mob.getLastHurtByMob() == entity || mob instanceof Enemy)) {
                // Вычисляем расстояние до моба
                double distance = entity.distanceTo(mob);
                
                // Накладываем эффект в зависимости от расстояния
                if (distance <= innerRange) {
                    // В радиусе 4 блоков — слабость 2 уровня
                    mob.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 10, 1, false, false));
                } else if (distance <= maxRange) {
                    // В радиусе от 4 до 10 блоков — слабость 1 уровня
                    mob.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 10, 0, false, false));
                }
            }
        }
    }

    // Указывает, что эффект должен срабатывать каждый тик
    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true; // Эффект активен каждый тик
    }
}