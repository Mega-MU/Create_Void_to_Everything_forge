
package net.mcreator.cvte.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.cvte.init.CvteModFluids;
import net.mcreator.cvte.init.CvteModFluidTypes;
import net.mcreator.cvte.init.CvteModBlocks;

public abstract class VitalityFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CvteModFluidTypes.VITALITY_TYPE.get(), () -> CvteModFluids.VITALITY.get(), () -> CvteModFluids.FLOWING_VITALITY.get()).explosionResistance(100f)
			.tickRate(20).levelDecreasePerBlock(2).block(() -> (LiquidBlock) CvteModBlocks.VITALITY.get());

	private VitalityFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.BUBBLE;
	}

	public static class Source extends VitalityFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends VitalityFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
