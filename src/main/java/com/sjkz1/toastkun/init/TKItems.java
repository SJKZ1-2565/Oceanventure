package com.sjkz1.toastkun.init;


import com.sjkz1.toastkun.core.ToastKun;

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
public class TKItems 
{
	 public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ToastKun.MOD_ID);
		
	 public static final RegistryObject<Item> TOAST = ITEMS.register("toast", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.BREAD)));
	 
	 public static final RegistryObject<Item> CRISPY_OMLET = ITEMS.register("crispy_omlet", () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.BREAD)));
	 
	 public static final RegistryObject<GiveXpItem> TOASTY_CRYSTAL = ITEMS.register("toasty_crystal", () -> new GiveXpItem(new Item.Properties().group(ItemGroup.MISC)));
	 
	 public static final RegistryObject<AxeItem> TOASTY_CRYSTAL_AXE = ITEMS.register("toasty_crystal_axe", () -> new AxeItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(ItemGroup.TOOLS)));
	 
	 public static final RegistryObject<HoeItem> TOASTY_CRYSTAL_HOE = ITEMS.register("toasty_crystal_hoe", () -> new HoeItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(ItemGroup.TOOLS)));
	 
	 public static final RegistryObject<PickaxeItem> TOASTY_CRYSTAL_PICKAXE = ITEMS.register("toasty_crystal_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(ItemGroup.TOOLS)));
	 
	 public static final RegistryObject<ShovelItem> TOASTY_CRYSTAL_SHOVEL = ITEMS.register("toasty_crystal_shovel", () -> new ShovelItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(ItemGroup.TOOLS)));
	 
	 public static final RegistryObject<SwordItem> TOASTY_CRYSTAL_SWORD = ITEMS.register("toasty_crystal_sword", () -> new SwordItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(ItemGroup.COMBAT)));
	 
	 public static final RegistryObject<BlockItem> TOASTY_CRYSTAL_ORE = ITEMS.register("toasty_crystal_ore", 
			 () -> new BlockItem(TKBlocks.TOASTY_CRYSTAL_ORE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	 
	 public static final RegistryObject<BlockItem> NETHER_TOASTY_CRYSTAL_ORE = ITEMS.register("nether_toasty_crystal_ore", 
			 () -> new BlockItem(TKBlocks.NETHER_TOASTY_CRYSTAL_ORE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

	    
	    
}