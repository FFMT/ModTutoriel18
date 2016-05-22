package fr.minecraftforgefrance.tutorial.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockTutorial extends Block
{
    public BlockTutorial(Material materialIn)
    {
        super(materialIn);
        this.setHarvestLevel("pickaxe", 3);
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(Blocks.diamond_block);
    }
}