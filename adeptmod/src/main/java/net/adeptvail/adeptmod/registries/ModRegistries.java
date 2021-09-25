package net.adeptvail.adeptmod.registries;

import net.adeptvail.adeptmod.AdeptMod;
import net.adeptvail.adeptmod.block.ModBlocks;
import net.adeptvail.adeptmod.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {

    public static void registerModFuels() {
        System.out.println("registering fuels for" + AdeptMod.MOD_ID);
        FuelRegistry reg = FuelRegistry.INSTANCE;

        reg.add(ModItems.ADEPT_FUEL, 300);
        reg.add(ModItems.PEPPER, 10);
        reg.add(ModBlocks.ADINGOT_BLOCK, 30000);
    }

}
