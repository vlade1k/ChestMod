package ru.vlade1k.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import ru.vlade1k.config.Config;
import ru.vlade1k.tileentity.TileEntityCustomChest;

public class ModBlock {

    public static Block customChest;

    public static void mainRegistry(){
        initializeBlock();
        registerBlock();
    }

    private static void initializeBlock(){
        customChest = new CustomChest(0, "CustomChest");
    }

    private static void registerBlock(){
        GameRegistry.registerBlock(customChest, customChest.getUnlocalizedName());
    }
}
