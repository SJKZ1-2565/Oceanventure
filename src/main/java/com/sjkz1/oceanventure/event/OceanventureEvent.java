package com.sjkz1.oceanventure.event;

import com.sjkz1.oceanventure.init.OceanventureItems;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class OceanventureEvent 
{
	public Minecraft mc;
	public OceanventureEvent()
	{
		this.mc = Minecraft.getInstance();
	}
	
	@SubscribeEvent
	public void onAttackEntity(AttackEntityEvent event)
	{
		Entity target = event.getTarget();
		PlayerEntity player = event.getPlayer();
		ItemStack itemStack = player.getHeldItemMainhand();
		if(itemStack != null && target != null)
		{
			if(itemStack.getItem() ==  OceanventureItems.OCINIST_CRYSTAL_SWORD.get() || itemStack.getItem() ==  OceanventureItems.OCINIST_CRYSTAL_AXE.get())
			{
				target.setPosition(target.getPosX(), target.getPosY() + 1.25, target.getPosZ());
			}
		}
	}
	
	@SubscribeEvent
	public void onAttackEntity(ClientTickEvent event)
	{
		if(event.phase == Phase.START)
		{
			if(this.mc.player != null && this.mc.world != null)
			{
				if(this.isWearingOcinistCrystalArmor() && this.mc.player.isInWater())
				{
					this.mc.player.addPotionEffect(new EffectInstance(Effects.CONDUIT_POWER,200));
					this.mc.player.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE,200));
				}
			}
		}
	}
	
	public boolean isWearingOcinistCrystalArmor()
	{
		return this.mc.player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem().equals(OceanventureItems.OCINIST_CRYSTAL_CHESTPLATE.get()) && this.mc.player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(OceanventureItems.OCINIST_CRYSTAL_HELMET.get()) && this.mc.player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem().equals(OceanventureItems.OCINIST_CRYSTAL_LEGGINGS.get()) && this.mc.player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(OceanventureItems.OCINIST_CRYSTAL_BOOTS.get());
	}
}
