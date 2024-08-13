package dev.joelkkusi.extra_mod;

import dev.joelkkusi.extra_mod.block.ModBlocks;
import dev.joelkkusi.extra_mod.item.ModItemGroups;
import dev.joelkkusi.extra_mod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraMod implements ModInitializer {

	public static final String MOD_ID = "extra_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Extra Mod...");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		LOGGER.info("Extra Mod loaded!");
	}
}