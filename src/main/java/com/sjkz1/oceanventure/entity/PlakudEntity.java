package com.sjkz1.oceanventure.entity;

import com.sjkz1.oceanventure.init.OceanventureItems;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
public class PlakudEntity extends AbstractGroupFishEntity 
{
	public PlakudEntity(EntityType<? extends PlakudEntity> entity, World world) 
	{
		super(entity, world);
	}
	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new PanicGoal(this, 1.25D));
		this.goalSelector.addGoal(2, new AvoidEntityGoal<>(this, PlayerEntity.class, 8.0F, 1.6D, 1.4D, EntityPredicates.NOT_SPECTATING::test));
		this.goalSelector.addGoal(4, new PlakudEntity.SwimGoal(this));
	}

	static class SwimGoal extends RandomSwimmingGoal {
		public final PlakudEntity fish;

		public SwimGoal(PlakudEntity fish) {
			super(fish, 1.0D, 40);
			this.fish = fish;
		}

		public boolean shouldExecute() {
			return super.shouldExecute();
		}
	}

	@Override
	protected ItemStack getFishBucket() {
		return new ItemStack(Items.COD_BUCKET);
	}

	protected SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_COD_AMBIENT;
	}

	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_COD_DEATH;
	}

	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_COD_HURT;
	}

	protected SoundEvent getFlopSound() {
		return SoundEvents.ENTITY_COD_FLOP;
	}


	@Override
	public ItemStack getPickedResult(RayTraceResult target) {
		return new ItemStack(OceanventureItems.EXAMPLE_SPAWN_EGG.get());
	}
}
