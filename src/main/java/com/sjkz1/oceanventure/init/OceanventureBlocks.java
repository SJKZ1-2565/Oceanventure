package com.sjkz1.oceanventure.init;

import com.sjkz1.oceanventure.core.Oceanventure;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OceanventureBlocks 
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Oceanventure.MOD_ID);
	public static final RegistryObject<Block> OCINIST_CRYSTAL_ORE = BLOCKS.register("ocinist_crystal_ore", () -> new Block(AbstractBlock.Properties.from(Blocks.IRON_ORE)));
}
