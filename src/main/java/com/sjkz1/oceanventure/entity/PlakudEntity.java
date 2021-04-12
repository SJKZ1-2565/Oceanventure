package com.sjkz1.oceanventure.entity;

import com.sjkz1.oceanventure.init.OceanventureItems;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
public class PlakudEntity extends AbstractGroupFishEntity 
{
	public int timeUntilNextEmerald = this.rand.nextInt(6000) + 6000;
	public PlakudEntity(EntityType<? extends PlakudEntity> entity, World world) 
	{
		super(entity, world);
	}

	@Override
	public void livingTick() {
		super.livingTick();
		if (!this.world.isRemote && this.isAlive() && --this.timeUntilNextEmerald <= 0) 
		{
			this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			this.entityDropItem(Items.EMERALD);
			this.timeUntilNextEmerald = this.rand.nextInt(6000) + 6000;
		}
	}

	@Override
	protected ItemStack getFishBucket() {
		return new ItemStack(Items.COD_BUCKET);
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_COD_AMBIENT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_COD_DEATH;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_COD_HURT;
	}

	@Override
	protected SoundEvent getFlopSound() {
		return SoundEvents.ENTITY_COD_FLOP;
	}


	@Override
	public ItemStack getPickedResult(RayTraceResult target) {
		return new ItemStack(OceanventureItems.PLAKUD_SPAWN_EGG.get());
	}
}
