package ru.vlade1k.chestmod;

import cpw.mods.fml.common.SidedProxy;
import ru.vlade1k.block.ModBlock;
import ru.vlade1k.config.Config;
import ru.vlade1k.recipes.ModRecipes;
import ru.vlade1k.tileentity.MTIleEntity;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;


@Mod(modid = Config.MODID, name = Config.NAME, version = Config.VERSION)
public class ChestMod {

    @SidedProxy(clientSide = "ru.vlade1k.chestmod.ClientProxy", serverSide = "ru.vlade1k.chestmod.ServerProxy")
    public static ServerProxy proxy;



    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent preEvent){
        proxy.registerRenderThings();
        MTIleEntity.mainRegistry();
        ModBlock.mainRegistry();
        ModRecipes.registerRecipes();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event){

    }
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent postEvent){

    }
}
