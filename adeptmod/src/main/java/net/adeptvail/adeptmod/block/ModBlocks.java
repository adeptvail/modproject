package net.adeptvail.adeptmod.block;

import net.adeptvail.adeptmod.AdeptMod;
import net.adeptvail.adeptmod.block.custom.StatusBlock;
import net.adeptvail.adeptmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block ADINGOT_ORE = registerBlock("adingot_ore", new
            Block(FabricBlockSettings.of(Material.STONE).strength(4.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block STATUS_BLOCK = registerBlock("status_block", new
            StatusBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block ADINGOT_BLOCK = registerBlock("adingot_block", new
            Block(FabricBlockSettings.of(Material.STONE).strength(7.0f)
            .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(AdeptMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(AdeptMod.MOD_ID, name), new
                BlockItem(block, new FabricItemSettings().group(ModItemGroup.ADEPT)));
    }

    public static void registerModBlocks() {
        System.out.println("registering mod blocks for " + AdeptMod.MOD_ID);
    }

}
