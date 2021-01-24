package com.sjkz1.toastkun.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

public class TestBlock extends Block
{

	public TestBlock(Properties properties) 
	{
		super(properties);
	}
	
	@Override
	public void onPlayerDestroy(IWorld worldIn, BlockPos pos, BlockState state) 
	{
		worldIn.addParticle(ParticleTypes.EXPLOSION, pos.getX(), pos.getY() + 1.15, pos.getZ(), 0, 0, 0);
		super.onPlayerDestroy(worldIn, pos, state);
	}
}
