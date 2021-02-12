package com.sjkz1.toastkun.event;

import com.sjkz1.toastkun.init.TKItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class TKEventHandler 
{
	@SubscribeEvent
	public void onAttackEntity(AttackEntityEvent event)
	{
		Entity target = event.getTarget();
		PlayerEntity player = event.getPlayer();
		ItemStack itemStack = player.getHeldItemMainhand();
		if(itemStack != null && target != null)
		{
			if(itemStack.getItem() ==  TKItems.TOASTY_CRYSTAL_SWORD.get() || itemStack.getItem() ==  TKItems.TOASTY_CRYSTAL_AXE.get())
			{
				target.setPosition(target.getPosX(), target.getPosY() + 1.25, target.getPosZ());
			}
		}
	}
}
