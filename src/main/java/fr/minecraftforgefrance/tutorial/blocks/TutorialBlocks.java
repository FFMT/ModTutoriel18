package fr.minecraftforgefrance.tutorial.blocks;

import fr.minecraftforgefrance.tutorial.ModTutorial;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TutorialBlocks
{
    public static final Block TUTORIAL = new BlockTutorial(Material.rock).setCreativeTab(CreativeTabs.tabBlock).setHardness(5.0F).setResistance(20.0F).setUnlocalizedName("tutorial");
    
    public static void registerBlocks()
    {
        GameRegistry.registerBlock(TUTORIAL, "tutorial_block");
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerBlocksModels()
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TUTORIAL), 0, new ModelResourceLocation(ModTutorial.MODID + ":tutorial_block", "inventory"));
    }
}