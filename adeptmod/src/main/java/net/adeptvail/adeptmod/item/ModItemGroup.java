package net.adeptvail.adeptmod.item;

import net.adeptvail.adeptmod.AdeptMod;
import net.adeptvail.adeptmod.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup ADEPT = FabricItemGroupBuilder.build(new Identifier(AdeptMod.MOD_ID, "adept"),
            () -> new ItemStack(ModBlocks.ADINGOT_ORE));

}
