package net.radi.pruebamod;

import net.fabricmc.api.ModInitializer;
import net.radi.pruebamod.block.PruebaBloques;
import net.radi.pruebamod.item.PruebaItems;
import net.radi.pruebamod.painting.PinturasMod;
import net.radi.pruebamod.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class pruebamod implements ModInitializer {

	public static final String MOD_ID = "pruebamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		PruebaItems.registerModItems();
		PruebaBloques.registerModBlock();

		PinturasMod.registerPainting();

		ModRegistries.registerModStuffs();

		GeckoLib.initialize();
		LOGGER.info("PROBANDO PROBANDO, ESTO FUNCIONA?");
	}

}
