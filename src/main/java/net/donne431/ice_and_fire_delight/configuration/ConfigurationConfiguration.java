package net.donne431.ice_and_fire_delight.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigurationConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_IAFD_TRADES;
	static {
		BUILDER.push("Other");
		ENABLE_IAFD_TRADES = BUILDER.comment("[NOT WORKING] This variable is responsible for enabling/disabling trades with villagers added by the mod").define("enable_iafd_trades", true);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
