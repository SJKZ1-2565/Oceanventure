package com.sjkz1.toastkun.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class TestBlock2 extends BaseHorizontal
{

	public TestBlock2(Properties properties) 
	{
		super(properties);
		runCalculation(shape);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
	
		return SHAPES.get(state.get(HORIZONTAL_FACING));
	}
	
}
