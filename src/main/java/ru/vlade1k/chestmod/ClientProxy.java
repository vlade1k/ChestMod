package ru.vlade1k.chestmod;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import ru.vlade1k.block.ModBlock;
import ru.vlade1k.render.item.ItemRenderCustomChest;
import ru.vlade1k.render.tileentity.CustomChestRenderer;
import ru.vlade1k.tileentity.TileEntityCustomChest;

public class ClientProxy extends ServerProxy{

    @Override
    public void registerRenderThings(){
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCustomChest.class, new CustomChestRenderer());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlock.customChest), new ItemRenderCustomChest());
    }
}
