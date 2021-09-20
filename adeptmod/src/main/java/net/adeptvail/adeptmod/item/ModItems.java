package net.adeptvail.adeptmod.item;

import net.adeptvail.adeptmod.AdeptMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item GEM = registerItem("gem", new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AdeptMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

        System.out.println("registering mod items for " + AdeptMod.MOD_ID);

    }

}
