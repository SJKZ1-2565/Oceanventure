package com.sjkz1.toastkun.event;

import com.sjkz1.toastkun.init.TKBlocks;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGen 
{
	public static void genOres(final BiomeLoadingEvent event)
	{
		if(!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND)))
				{
					genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, TKBlocks.TOASTY_CRYSTAL_ORE.get().getDefaultState(), 7, 3, 45, 20);
				}
		else if(event.getCategory().equals(Biome.Category.NETHER))
		{
			genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, TKBlocks.NETHER_TOASTY_CRYSTAL_ORE.get().getDefaultState(), 7, 3, 70, 20);
		}
	}

	public static void genOre(BiomeGenerationSettingsBuilder builder, RuleTest fillerType, BlockState block, int veinSize, int minHeigh , int maxHeigh , int count)
	{
		builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType , block , veinSize)).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeigh, 0, maxHeigh))).square().func_242731_b(count));
	}
	
}
