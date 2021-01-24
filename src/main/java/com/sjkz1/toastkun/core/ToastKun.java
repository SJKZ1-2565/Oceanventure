package com.sjkz1.toastkun.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sjkz1.toastkun.event.ClientEventsBus;
import com.sjkz1.toastkun.event.OreGen;
import com.sjkz1.toastkun.init.TKBlocks;
import com.sjkz1.toastkun.init.TKItems;
import com.stevekung.stevekungslib.utils.CommonUtils;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ToastKun.MOD_ID)
public class ToastKun
{
	public static final String MOD_ID = "toastkun"; 
	public static final Logger LOGGER = LogManager.getLogger();

	public ToastKun()
	{
		final IEventBus Bus = FMLJavaModLoadingContext.get().getModEventBus();
		Bus.addListener(this::setup);
		TKItems.ITEMS.register(Bus);
		TKBlocks.BLOCKS.register(Bus);
		CommonUtils.registerEventHandler(new ClientEventsBus());
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGen::genOres);
		LOGGER.info("Successfully setup mod!");
	}

	private void setup(FMLCommonSetupEvent event) 
	{
	
	}

}
