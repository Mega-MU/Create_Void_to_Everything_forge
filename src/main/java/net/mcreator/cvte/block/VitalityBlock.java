
package net.mcreator.cvte.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.cvte.init.CvteModFluids;

public class VitalityBlock extends LiquidBlock {
	public VitalityBlock() {
		super(() -> CvteModFluids.VITALITY.get(), BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).noCollission().noLootTable().liquid()
				.pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
