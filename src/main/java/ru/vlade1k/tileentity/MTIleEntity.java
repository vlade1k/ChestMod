package ru.vlade1k.tileentity;


import cpw.mods.fml.common.registry.GameRegistry;
import ru.vlade1k.config.Config;

public class MTIleEntity {

    public static void mainRegistry(){
        registerTileEntity();
    }

    private static void registerTileEntity(){
        GameRegistry.registerTileEntity(TileEntityCustomChest.class, Config.MODID);
    }

}
