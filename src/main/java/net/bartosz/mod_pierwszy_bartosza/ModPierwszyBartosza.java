package net.bartosz.mod_pierwszy_bartosza;

import net.bartosz.mod_pierwszy_bartosza.item.ModItemGroups;
import net.bartosz.mod_pierwszy_bartosza.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModPierwszyBartosza implements ModInitializer {
	public static final String MOD_ID = "mod-pierwszy-bartosza";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}