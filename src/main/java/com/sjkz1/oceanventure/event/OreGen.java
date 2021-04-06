package com.sjkz1.oceanventure.event;

import com.sjkz1.oceanventure.init.OceanventureBlocks;

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
		if(event.getCategory().equals(Biome.Category.OCEAN))
		{
			GenerateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, OceanventureBlocks.OCINIST_CRYSTAL_ORE.get().getDefaultState(), 7, 3, 45, 20);
		}
	}

	private static void GenerateOre(BiomeGenerationSettingsBuilder biomeGenSettingsBuilder, RuleTest fillerType, BlockState block, int veinSize, int minHeigh , int maxHeigh , int count)
	{
		biomeGenSettingsBuilder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType , block , veinSize)).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeigh, 0, maxHeigh))).square().count(count));
	}

}
