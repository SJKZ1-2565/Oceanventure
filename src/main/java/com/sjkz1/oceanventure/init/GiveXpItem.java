package com.sjkz1.oceanventure.init;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class GiveXpItem extends Item
{

	public GiveXpItem(Properties properties) 
	{
		super(properties);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		if(playerIn.experienceLevel >= 10)
		{
			playerIn.addExperienceLevel((int) 3.5);
			playerIn.addStat(Stats.ITEM_USED.get(this));
			if (!playerIn.abilities.isCreativeMode) {
				itemstack.shrink(1);
			}
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
