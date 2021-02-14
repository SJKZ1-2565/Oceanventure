package com.sjkz1.toastkun.init;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class TestItem extends Item
{

	public TestItem(Properties properties) 
	{
		super(properties);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		playerIn.addExperienceLevel(10);
		playerIn.addStat(Stats.ITEM_USED.get(this));
	      if (!playerIn.abilities.isCreativeMode) {
	         itemstack.shrink(1);
	      }
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
}
