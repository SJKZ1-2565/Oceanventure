package com.sjkz1.oceanventure.init;


import com.sjkz1.oceanventure.core.Oceanventure;

import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Foods;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public class OceanventureItems 
{
	 public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Oceanventure.MOD_ID);
		
	 public static final RegistryObject<Item> TOAST = ITEMS.register("toast", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.BREAD)));
	 
	 public static final RegistryObject<Item> CRISPY_OMLET = ITEMS.register("crispy_omlet", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.BREAD)));
	 
	 public static final RegistryObject<GiveXpItem> OCINIST_CRYSTAL = ITEMS.register("ocinist_crystal", () -> new GiveXpItem(new Item.Properties().group(ItemGroup.MISC)));
	 
	 public static final RegistryObject<AxeItem> OCINIST_CRYSTAL_AXE = ITEMS.register("ocinist_crystal_axe", () -> new AxeItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(ItemGroup.TOOLS)));
	 
	 public static final RegistryObject<HoeItem> OCINIST_CRYSTAL_HOE = ITEMS.register("ocinist_crystal_hoe", () -> new HoeItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(ItemGroup.TOOLS)));
	 
	 public static final RegistryObject<PickaxeItem> OCINIST_CRYSTAL_PICKAXE = ITEMS.register("ocinist_crystal_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(ItemGroup.TOOLS)));
	 
	 public static final RegistryObject<ShovelItem> OCINIST_CRYSTAL_SHOVEL = ITEMS.register("ocinist_crystal_shovel", () -> new ShovelItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(ItemGroup.TOOLS)));
	 
	 public static final RegistryObject<SwordItem> OCINIST_CRYSTAL_SWORD = ITEMS.register("ocinist_crystal_sword", () -> new SwordItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(ItemGroup.COMBAT)));
	 
	 public static final RegistryObject<BlockItem> OCINIST_CRYSTAL_ORE = ITEMS.register("ocinist_crystal_ore", 
			 () -> new BlockItem(OceanventureBlocks.OCINIST_CRYSTAL_ORE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	 

	    
	    
}