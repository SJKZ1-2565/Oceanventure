package com.sjkz1.oceanventure.init;


import com.sjkz1.oceanventure.core.Oceanventure;
import com.sjkz1.oceanventure.core.Oceanventure.OceanventureItemGroup;
import com.sjkz1.oceanventure.utils.armor.OcinistCrystalArmor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Foods;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
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
		
	 public static final RegistryObject<Item> TOAST = ITEMS.register("toast", () -> new Item(new Item.Properties().group(OceanventureItemGroup.instance).food(Foods.BREAD)));
	 
	 public static final RegistryObject<Item> CRISPY_OMLET = ITEMS.register("crispy_omlet", () -> new Item(new Item.Properties().group(OceanventureItemGroup.instance).food(Foods.BREAD)));
	 
	 public static final RegistryObject<GiveXpItem> OCINIST_CRYSTAL = ITEMS.register("ocinist_crystal", () -> new GiveXpItem(new Item.Properties().group(OceanventureItemGroup.instance)));
	 
	 public static final RegistryObject<AxeItem> OCINIST_CRYSTAL_AXE = ITEMS.register("ocinist_crystal_axe", () -> new AxeItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(OceanventureItemGroup.instance)));
	 
	 public static final RegistryObject<HoeItem> OCINIST_CRYSTAL_HOE = ITEMS.register("ocinist_crystal_hoe", () -> new HoeItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(OceanventureItemGroup.instance)));
	 
	 public static final RegistryObject<PickaxeItem> OCINIST_CRYSTAL_PICKAXE = ITEMS.register("ocinist_crystal_pickaxe", () -> new PickaxeItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(OceanventureItemGroup.instance)));
	 
	 public static final RegistryObject<ShovelItem> OCINIST_CRYSTAL_SHOVEL = ITEMS.register("ocinist_crystal_shovel", () -> new ShovelItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(OceanventureItemGroup.instance)));
	 
	 public static final RegistryObject<SwordItem> OCINIST_CRYSTAL_SWORD = ITEMS.register("ocinist_crystal_sword", () -> new SwordItem(ItemTier.DIAMOND, 3, 2, new Item.Properties().group(OceanventureItemGroup.instance)));
	 
	 public static final RegistryObject<SpawnEgg> PLAKUD_SPAWN_EGG = ITEMS.register("plakud_spawn_egg",
				() -> new SpawnEgg(OceanventureEntityTypes.PLAKUD, 0x3a9e55, 0x41d1a8,
						new Item.Properties().group(OceanventureItemGroup.instance).maxStackSize(64)));
	 
	 public static final RegistryObject<BlockItem> OCINIST_CRYSTAL_ORE = ITEMS.register("ocinist_crystal_ore", 
			 () -> new BlockItem(OceanventureBlocks.OCINIST_CRYSTAL_ORE.get(),new Item.Properties().group(OceanventureItemGroup.instance)));
	 
	 
	 //Armor
	 public static final RegistryObject<ArmorItem> OCINIST_CRYSTAL_HELMET = ITEMS.register("ocinist_crystal_helmet",
			 () -> new ArmorItem(OcinistCrystalArmor.OCINIST, EquipmentSlotType.HEAD,
					 new Item.Properties().group(OceanventureItemGroup.instance)));
	 
	 public static final RegistryObject<ArmorItem> OCINIST_CRYSTAL_CHESTPLATE = ITEMS.register("ocinist_crystal_chestplate",
			 () -> new ArmorItem(OcinistCrystalArmor.OCINIST, EquipmentSlotType.CHEST,
					 new Item.Properties().group(OceanventureItemGroup.instance)));
	 
	 public static final RegistryObject<ArmorItem> OCINIST_CRYSTAL_LEGGINGS = ITEMS.register("ocinist_crystal_leggings",
			 () -> new ArmorItem(OcinistCrystalArmor.OCINIST, EquipmentSlotType.LEGS,
					 
					 new Item.Properties().group(OceanventureItemGroup.instance)));
	 
	 public static final RegistryObject<ArmorItem> OCINIST_CRYSTAL_BOOTS = ITEMS.register("ocinist_crystal_boots",
				() -> new ArmorItem(OcinistCrystalArmor.OCINIST, EquipmentSlotType.FEET,
						new Item.Properties().group(OceanventureItemGroup.instance)));
	 
	 
	 
}