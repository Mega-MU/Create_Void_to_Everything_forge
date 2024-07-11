
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cvte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.cvte.fluid.VitalityFluid;
import net.mcreator.cvte.CvteMod;

public class CvteModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CvteMod.MODID);
	public static final RegistryObject<FlowingFluid> VITALITY = REGISTRY.register("vitality", () -> new VitalityFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_VITALITY = REGISTRY.register("flowing_vitality", () -> new VitalityFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(VITALITY.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_VITALITY.get(), RenderType.translucent());
		}
	}
}
