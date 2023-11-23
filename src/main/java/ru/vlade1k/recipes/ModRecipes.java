package ru.vlade1k.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import ru.vlade1k.block.ModBlock;

public class ModRecipes {

    public static void registerRecipes(){
        GameRegistry.addShapedRecipe(new ItemStack(ModBlock.customChest),
                "WWW", "WSW", "WWW",
                'W', new ItemStack(Blocks.planks, 1, 1),
                'S', new ItemStack(Blocks.wool, 1, 6));
    }
}
