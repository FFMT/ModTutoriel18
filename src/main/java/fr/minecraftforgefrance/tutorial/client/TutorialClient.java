package fr.minecraftforgefrance.tutorial.client;

import java.io.File;

import fr.minecraftforgefrance.tutorial.TutorialCommon;
import fr.minecraftforgefrance.tutorial.items.TutorialItems;

public class TutorialClient extends TutorialCommon
{
    @Override
    public void preInit(File configFile)
    {
        super.preInit(configFile);
        TutorialItems.registerItemsModels();
    }

    @Override
    public void init()
    {
        super.init();
    }
}