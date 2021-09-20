package net.adeptvail.adeptmod;

import net.adeptvail.adeptmod.block.ModBlocks;
import net.adeptvail.adeptmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class AdeptMod implements ModInitializer {

	public static final String MOD_ID = "adeptmod";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		System.out.println("Hello Fabric world!");
	}
}
