package net.donne431.ice_and_fire_delight;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.resources.ResourceLocation;

public class EffectRegistry {
    public static final String MODID = "ice_and_fire_delight";
    
    public static final MobEffect FLIGHT_EFFECT = ForgeRegistries.MOB_EFFECTS.getValue(new ResourceLocation(MODID, "dragon_flight"));

    public static void init() {
        MinecraftForge.EVENT_BUS.addListener(EffectRegistry::onPlayerLogin);
    }

    private static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        Player player = event.getEntity();
        CompoundTag tag = player.getPersistentData();
        
        if (player.hasEffect(FLIGHT_EFFECT)) {
            player.getAbilities().mayfly = true;
            if (!player.isCreative() && !player.isSpectator()) {
                player.getAbilities().flying = tag.getBoolean("WasFlying"); // Восстанавливаем актуальное состояние
            }
            player.onUpdateAbilities();
        } else if (tag.getBoolean("HasFlightEffect")) {
            if (!player.isCreative() && !player.isSpectator()) {
                player.getAbilities().mayfly = true;
                player.onUpdateAbilities();
            }
        }
    }
}