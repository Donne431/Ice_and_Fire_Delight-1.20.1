
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.donne431.ice_and_fire_delight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.donne431.ice_and_fire_delight.item.TrollMeatItem;
import net.donne431.ice_and_fire_delight.item.TrollIntestinesItem;
import net.donne431.ice_and_fire_delight.item.SpicyChipsFromShinyScalesItem;
import net.donne431.ice_and_fire_delight.item.SpicesFromWitherboneItem;
import net.donne431.ice_and_fire_delight.item.SeaSerpentMeatItem;
import net.donne431.ice_and_fire_delight.item.RawIceSausageItem;
import net.donne431.ice_and_fire_delight.item.RawFireSausageItem;
import net.donne431.ice_and_fire_delight.item.MyrmexResinCookieJungleItem;
import net.donne431.ice_and_fire_delight.item.MyrmexResinCookieDesertItem;
import net.donne431.ice_and_fire_delight.item.IceSausageItem;
import net.donne431.ice_and_fire_delight.item.IceMincedMeatItem;
import net.donne431.ice_and_fire_delight.item.HoneyGlazedTrollMeatItem;
import net.donne431.ice_and_fire_delight.item.FriedDragonEggItem;
import net.donne431.ice_and_fire_delight.item.FreshSoupFromSeaSerpentItem;
import net.donne431.ice_and_fire_delight.item.FireSausageItem;
import net.donne431.ice_and_fire_delight.item.FireMincedMeatItem;
import net.donne431.ice_and_fire_delight.item.EctoplasmJellyItem;
import net.donne431.ice_and_fire_delight.item.CyclopsMeatItem;
import net.donne431.ice_and_fire_delight.item.CookedTrollMeatItem;
import net.donne431.ice_and_fire_delight.item.CookedSeaSerpentMeatItem;
import net.donne431.ice_and_fire_delight.item.CookedCyclopsMeatItem;
import net.donne431.ice_and_fire_delight.item.ChipsFromShinyScalesItem;
import net.donne431.ice_and_fire_delight.IceAndFireDelightMod;

public class IceAndFireDelightModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IceAndFireDelightMod.MODID);
	public static final RegistryObject<Item> ECTOPLASM_JELLY = REGISTRY.register("ectoplasm_jelly", () -> new EctoplasmJellyItem());
	public static final RegistryObject<Item> FRIED_DRAGON_EGG = REGISTRY.register("fried_dragon_egg", () -> new FriedDragonEggItem());
	public static final RegistryObject<Item> MYRMEX_RESIN_COOKIE_JUNGLE = REGISTRY.register("myrmex_resin_cookie_jungle", () -> new MyrmexResinCookieJungleItem());
	public static final RegistryObject<Item> MYRMEX_RESIN_COOKIE_DESERT = REGISTRY.register("myrmex_resin_cookie_desert", () -> new MyrmexResinCookieDesertItem());
	public static final RegistryObject<Item> CHIPS_FROM_SHINY_SCALES = REGISTRY.register("chips_from_shiny_scales", () -> new ChipsFromShinyScalesItem());
	public static final RegistryObject<Item> SEA_SERPENT_MEAT = REGISTRY.register("sea_serpent_meat", () -> new SeaSerpentMeatItem());
	public static final RegistryObject<Item> COOKED_SEA_SERPENT_MEAT = REGISTRY.register("cooked_sea_serpent_meat", () -> new CookedSeaSerpentMeatItem());
	public static final RegistryObject<Item> TROLL_MEAT = REGISTRY.register("troll_meat", () -> new TrollMeatItem());
	public static final RegistryObject<Item> COOKED_TROLL_MEAT = REGISTRY.register("cooked_troll_meat", () -> new CookedTrollMeatItem());
	public static final RegistryObject<Item> FRESH_SOUP_FROM_SEA_SERPENT = REGISTRY.register("fresh_soup_from_sea_serpent", () -> new FreshSoupFromSeaSerpentItem());
	public static final RegistryObject<Item> HONEY_GLAZED_TROLL_MEAT = REGISTRY.register("honey_glazed_troll_meat", () -> new HoneyGlazedTrollMeatItem());
	public static final RegistryObject<Item> TROLL_INTESTINES = REGISTRY.register("troll_intestines", () -> new TrollIntestinesItem());
	public static final RegistryObject<Item> FIRE_MINCED_MEAT = REGISTRY.register("fire_minced_meat", () -> new FireMincedMeatItem());
	public static final RegistryObject<Item> RAW_FIRE_SAUSAGE = REGISTRY.register("raw_fire_sausage", () -> new RawFireSausageItem());
	public static final RegistryObject<Item> FIRE_SAUSAGE = REGISTRY.register("fire_sausage", () -> new FireSausageItem());
	public static final RegistryObject<Item> ICE_MINCED_MEAT = REGISTRY.register("ice_minced_meat", () -> new IceMincedMeatItem());
	public static final RegistryObject<Item> RAW_ICE_SAUSAGE = REGISTRY.register("raw_ice_sausage", () -> new RawIceSausageItem());
	public static final RegistryObject<Item> ICE_SAUSAGE = REGISTRY.register("ice_sausage", () -> new IceSausageItem());
	public static final RegistryObject<Item> SPICES_FROM_WITHERBONE = REGISTRY.register("spices_from_witherbone", () -> new SpicesFromWitherboneItem());
	public static final RegistryObject<Item> SPICY_CHIPS_FROM_SHINY_SCALES = REGISTRY.register("spicy_chips_from_shiny_scales", () -> new SpicyChipsFromShinyScalesItem());
	public static final RegistryObject<Item> CYCLOPS_MEAT = REGISTRY.register("cyclops_meat", () -> new CyclopsMeatItem());
	public static final RegistryObject<Item> CYCLOPS_STEAK = REGISTRY.register("cyclops_steak", () -> new CookedCyclopsMeatItem());
}
