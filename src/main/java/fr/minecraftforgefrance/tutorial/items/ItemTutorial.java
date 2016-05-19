package fr.minecraftforgefrance.tutorial.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class ItemTutorial extends Item
{
    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        if(!world.isRemote)
        {
            player.addChatMessage(new ChatComponentTranslation("item.tutorial.click.message", world.provider.getDimensionId()));
        }
        return stack;
    }
}