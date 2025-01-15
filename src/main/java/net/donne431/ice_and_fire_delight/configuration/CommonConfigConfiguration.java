package net.donne431.ice_and_fire_delight.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> GIVE_BOOK_ON_STARTUP;
	public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE;
	public static final ForgeConfigSpec.ConfigValue<Double> CHANCE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE;
	public static final ForgeConfigSpec.ConfigValue<Double> NUMBER_DEATH_BEFORE_EXPLOSIONS_STOP_WHEN_EATING_SPECIAL_PIE;
	static {
		BUILDER.push("General");
		GIVE_BOOK_ON_STARTUP = BUILDER.comment("This variable is responsible for give book on startup or not. Default: true  ").define("give_book_on_startup", true);
		BUILDER.pop();
		BUILDER.push("Special pie");
		ENABLE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE = BUILDER.comment("Will there be an explosion when eating a special pie. Default: true").define("enable_explosions_when_eat_special_pie", true);
		CHANCE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE = BUILDER.comment("This variable is responsible for the chance of an explosion when eating a special pie. 0.0 - 0%, 1.0 - 100%. Default: 0.2; Range: [0.0 ~ 1.0]")
				.define("chance_explosions_when_eat_special_pie", (double) 0.2);
		NUMBER_DEATH_BEFORE_EXPLOSIONS_STOP_WHEN_EATING_SPECIAL_PIE = BUILDER.comment("Number of deaths before explosions stop after eating pie. Default: 1; Range: [1 ~ 9999]").define("number_death_before_explosions_stop_when_eating_special_pie",
				(double) 1);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
