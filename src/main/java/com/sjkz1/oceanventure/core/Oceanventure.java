package com.sjkz1.oceanventure.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sjkz1.oceanventure.event.OceanventureEvent;
import com.sjkz1.oceanventure.event.OreGen;
import com.sjkz1.oceanventure.init.OceanventureBlocks;
import com.sjkz1.oceanventure.init.OceanventureItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Oceanventure.MOD_ID)
public class Oceanventure
{
	public static final String MOD_ID = "oceanventure"; 
	public static final Logger LOGGER = LogManager.getLogger();

	public Oceanventure()
	{
		final IEventBus Bus = FMLJavaModLoadingContext.get().getModEventBus();
		Bus.addListener(this::setup);
		OceanventureItems.ITEMS.register(Bus);
		OceanventureBlocks.BLOCKS.register(Bus);
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGen::genOres);

		LOGGER.info("Successfully setup mod!");
	}

	private void setup(FMLCommonSetupEvent event) 
	{
		registerEventHandler(new OceanventureEvent());
	}

	public static void registerEventHandler(Object event)
	{
		MinecraftForge.EVENT_BUS.register(event);
	}
	
	public static class OceanventureItemGroup extends ItemGroup {
		public static final ItemGroup instance = new OceanventureItemGroup(ItemGroup.GROUPS.length, "OceanventureItemGroup");

		private OceanventureItemGroup(int index, String label) {
			super(index, label);
		}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(OceanventureItems.OCINIST_CRYSTAL.get());
		}
	}

}
