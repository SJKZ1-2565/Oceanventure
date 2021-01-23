package com.sjkz1.toastkun.init;


import com.sjkz1.toastkun.core.ToastKun;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public class TKItems 
{
	 public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ToastKun.MOD_ID);
		
	 public static final RegistryObject<Item> TOAST = ITEMS.register("toast", () -> new Item(new Item.Properties().group(ItemGroup.MISC).food(Foods.BREAD)));
	 
	 public static final RegistryObject<BlockItem> TOASTY_ORE = ITEMS.register("toasty_ore", 
			 () -> new BlockItem(TKBlocks.TOASTY_ORE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

	    
	    
}