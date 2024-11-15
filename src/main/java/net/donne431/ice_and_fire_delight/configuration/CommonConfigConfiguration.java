package net.donne431.ice_and_fire_delight.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> GIVE_BOOK_ON_STARTUP;
	static {
		BUILDER.push("General");
		GIVE_BOOK_ON_STARTUP = BUILDER.comment("This variable is responsible for give book on startup or not. Default: true  ").define("give_book_on_startup", true);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
