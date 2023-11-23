package ru.vlade1k.render.item;

import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import ru.vlade1k.tileentity.TileEntityCustomChest;

public class ItemRenderCustomChest implements IItemRenderer {

    private ModelChest chestModel;
    public ItemRenderCustomChest() {
        this.chestModel = new ModelChest();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityCustomChest(), 0.0D,0.0D,0.0D,0.0F);
    }
}
