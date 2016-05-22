package fr.minecraftforgefrance.tutorial;

import java.io.File;

import fr.minecraftforgefrance.tutorial.blocks.TutorialBlocks;
import fr.minecraftforgefrance.tutorial.items.TutorialItems;

public class TutorialCommon
{
    public void preInit(File configFile)
    {
        TutorialBlocks.registerBlocks();
        TutorialItems.registerItems();
    }

    public void init()
    {
        
    }
}