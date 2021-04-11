package com.sjkz1.oceanventure.entity;

import com.sjkz1.oceanventure.init.OceanventureEntityTypes;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class EntityRendering 
{
	@OnlyIn(Dist.CLIENT)
	public static void init()
    { 
		RenderingRegistry.registerEntityRenderingHandler(OceanventureEntityTypes.PLAKUD.get(), PlakudEntityRenderer::new);
    }
}
