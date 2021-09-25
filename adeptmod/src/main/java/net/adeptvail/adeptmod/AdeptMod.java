package net.adeptvail.adeptmod;

import net.adeptvail.adeptmod.block.ModBlocks;
import net.adeptvail.adeptmod.entity.CubeEntity;
import net.adeptvail.adeptmod.item.ModItems;
import net.adeptvail.adeptmod.registries.ModRegistries;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdeptMod implements ModInitializer {

	public static final String MOD_ID = "adeptmod";

	public static final EntityType<CubeEntity> CUBE = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier("adeptmod", "cube"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CubeEntity::new).dimensions(EntityDimensions.fixed(1f, 2f)).build()
	);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		FabricDefaultAttributeRegistry.register(CUBE, CubeEntity.createMobAttributes());

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModFuels();

		System.out.println("Hello Fabric world!");
	}
}
