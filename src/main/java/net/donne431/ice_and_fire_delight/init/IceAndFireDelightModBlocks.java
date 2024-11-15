
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.donne431.ice_and_fire_delight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.donne431.ice_and_fire_delight.block.FrostPieBlock;
import net.donne431.ice_and_fire_delight.block.ElectricPieBlock;
import net.donne431.ice_and_fire_delight.IceAndFireDelightMod;

public class IceAndFireDelightModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IceAndFireDelightMod.MODID);
	public static final RegistryObject<Block> ELECTRIC_PIE = REGISTRY.register("electric_pie", () -> new ElectricPieBlock());
	public static final RegistryObject<Block> FROST_PIE = REGISTRY.register("frost_pie", () -> new FrostPieBlock());
}