package fr.minecraftforgefrance.tutorial;

import java.io.File;

import fr.minecraftforgefrance.tutorial.items.TutorialItems;

public class TutorialCommon
{
    public void preInit(File configFile)
    {
        TutorialItems.registerItems();
    }

    public void init()
    {
        
    }
}