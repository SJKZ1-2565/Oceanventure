package com.sjkz1.oceanventure.init;

import com.sjkz1.oceanventure.core.Oceanventure;
import com.sjkz1.oceanventure.entity.PlakudEntity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OceanventureEntityTypes 
{
    public static final DeferredRegister<EntityType<?>> REGISTER = DeferredRegister.create(ForgeRegistries.ENTITIES, Oceanventure.MOD_ID);

    public static final RegistryObject<EntityType<PlakudEntity>> PLAKUD = create("plakud", EntityType.Builder.create(PlakudEntity::new, EntityClassification.WATER_AMBIENT).size(0.3f, 0.2f));

    private static <T extends Entity> RegistryObject<EntityType<T>> create(String name, EntityType.Builder<T> builder) {
        return REGISTER.register(name, () -> builder.build(Oceanventure.MOD_ID + "." + name));
    }
}
