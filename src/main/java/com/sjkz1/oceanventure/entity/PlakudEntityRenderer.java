package com.sjkz1.oceanventure.entity;

import com.sjkz1.oceanventure.core.Oceanventure;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;


public class PlakudEntityRenderer extends MobRenderer<PlakudEntity, PlakudEntityModel<PlakudEntity>>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Oceanventure.MOD_ID, "textures/entity/plakud.png");

    public PlakudEntityRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PlakudEntityModel<>(), 0.3F);
    }

    @Override
	public ResourceLocation getEntityTexture(PlakudEntity entity) {
        return TEXTURE;
    }
}
