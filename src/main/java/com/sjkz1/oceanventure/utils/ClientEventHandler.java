package com.sjkz1.oceanventure.utils;

import com.sjkz1.oceanventure.entity.PlakudEntityRenderer;
import com.sjkz1.oceanventure.init.OceanventureEntityTypes;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientEventHandler 
{
	@OnlyIn(Dist.CLIENT)
	public static void init() 
	{
		RenderingRegistry.registerEntityRenderingHandler(OceanventureEntityTypes.PLAKUD.get(), PlakudEntityRenderer::new);
	}
}
