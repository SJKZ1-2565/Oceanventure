package com.sjkz1.toastkun.init;

import com.sjkz1.toastkun.core.ToastKun;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TKBlocks 
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ToastKun.MOD_ID);
	public static final RegistryObject<Block> TOASTY_ORE = BLOCKS.register("toasty_ore", () -> new Block(AbstractBlock.Properties.from(Blocks.IRON_ORE)));
	public static final RegistryObject<Block> NETHER_TOASTY_ORE = BLOCKS.register("nether_toasty_ore", () -> new Block(AbstractBlock.Properties.from(Blocks.NETHER_GOLD_ORE)));
}
