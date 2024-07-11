
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cvte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.cvte.fluid.types.VitalityFluidType;
import net.mcreator.cvte.CvteMod;

public class CvteModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CvteMod.MODID);
	public static final RegistryObject<FluidType> VITALITY_TYPE = REGISTRY.register("vitality", () -> new VitalityFluidType());
}
