package com.sjkz1.oceanventure.entity;

import com.google.common.collect.ImmutableList;

import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class PlakudEntityModel  <T extends Entity> extends SegmentedModel<T> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer finTop;
	private final ModelRenderer finDown;
	private final ModelRenderer tail;

	public PlakudEntityModel() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.setTextureOffset(28, 1).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(26, 4).addBox(-1.0F, -2.25F, 1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		finTop = new ModelRenderer(this);
		finTop.setRotationPoint(0.0F, 24.0F, 0.0F);
		finTop.setTextureOffset(28, 8).addBox(-0.5F, -3.0F, 1.25F, 0.0F, 1.0F, 2.0F, 0.0F, false);

		finDown = new ModelRenderer(this);
		finDown.setRotationPoint(0.0F, 24.0F, 0.0F);
		finDown.setTextureOffset(28, 11).addBox(-0.5F, -0.5F, 1.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 22.75F, 1.0F);
		tail.setTextureOffset(9, 1).addBox(-0.5F, -1.0F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tail.setTextureOffset(6, 1).addBox(-0.5F, -1.25F, 2.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tail.setTextureOffset(6, 4).addBox(-0.5F, -0.25F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tail.setTextureOffset(9, 4).addBox(-0.5F, 0.0F, 2.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public Iterable<ModelRenderer> getParts() {
		return ImmutableList.of(this.head,this.tail, this.finTop , this.finDown,this.body);
	}

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	      float f = 1.0F;
	      if (!entityIn.isInWater()) {
	         f = 1.5F;
	      }

	      this.tail.rotateAngleY = f * 0.45F * MathHelper.sin(0.6F * ageInTicks);
	      this.finDown.rotateAngleY = f * 0.45F * MathHelper.sin(0.6F * ageInTicks);
	      this.finTop.rotateAngleY = f * 0.45F * MathHelper.sin(0.6F * ageInTicks);
	      this.body.rotateAngleY = f * 0.45F * MathHelper.sin(0.6F * ageInTicks);
	      this.head.rotateAngleY = this.body.rotateAngleY * MathHelper.sin(0.55F * ageInTicks);
	}
}
