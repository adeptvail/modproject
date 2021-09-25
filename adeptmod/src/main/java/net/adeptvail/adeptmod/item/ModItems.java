package net.adeptvail.adeptmod.item;

import net.adeptvail.adeptmod.AdeptMod;
import net.adeptvail.adeptmod.item.custom.DowsingRod;
import net.adeptvail.adeptmod.item.custom.Pepper;
import net.adeptvail.adeptmod.registries.ModRegistries;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ADINGOT = registerItem("adingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ADEPT).fireproof()));

    public static final Item PEPPER = registerItem("pepper", new Pepper(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())
            .group(ModItemGroup.ADEPT).fireproof()));

    public static final Item DOWSING_COMPASS = registerItem("dowsing_compass",
            new DowsingRod(new FabricItemSettings().group(ModItemGroup.ADEPT).fireproof().maxDamage(1000).maxCount(1)));

    public static final Item ADEPT_FUEL = registerItem("adept_fuel",
            new Item(new FabricItemSettings().group(ModItemGroup.ADEPT).fireproof().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AdeptMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

        System.out.println("registering mod items for " + AdeptMod.MOD_ID);

    }

}
