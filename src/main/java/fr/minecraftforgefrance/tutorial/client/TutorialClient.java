package fr.minecraftforgefrance.tutorial.client;

import java.io.File;

import fr.minecraftforgefrance.tutorial.TutorialCommon;
import fr.minecraftforgefrance.tutorial.blocks.TutorialBlocks;
import fr.minecraftforgefrance.tutorial.items.TutorialItems;
import net.minecraftforge.client.model.ModelLoader;

public class TutorialClient extends TutorialCommon
{
    @Override
    public void preInit(File configFile)
    {
        super.preInit(configFile);
        TutorialBlocks.registerBlocksModels();
        TutorialItems.registerItemsModels();
    }

    @Override
    public void init()
    {
        super.init();
    }
}