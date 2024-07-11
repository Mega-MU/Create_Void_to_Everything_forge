
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cvte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cvte.block.VitalityBlock;
import net.mcreator.cvte.CvteMod;

public class CvteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CvteMod.MODID);
	public static final RegistryObject<Block> VITALITY = REGISTRY.register("vitality", () -> new VitalityBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
