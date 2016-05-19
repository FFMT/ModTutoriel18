package fr.minecraftforgefrance.tutorial.items;

import fr.minecraftforgefrance.tutorial.ModTutorial;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TutorialItems
{
    public static final Item TUTORIAL = new ItemTutorial().setUnlocalizedName("tutorial").setCreativeTab(CreativeTabs.tabMisc);
    
    public static void registerItems()
    {
        GameRegistry.registerItem(TUTORIAL, "tutorial_item");
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerItemsModels()
    {
        ModelLoader.setCustomModelResourceLocation(TUTORIAL, 0, new ModelResourceLocation(ModTutorial.MODID + ":tutorial_item", "inventory"));
    }
}