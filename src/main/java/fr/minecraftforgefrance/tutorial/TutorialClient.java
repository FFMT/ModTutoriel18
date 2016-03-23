package fr.minecraftforgefrance.tutorial;

import java.io.File;

public class TutorialClient extends TutorialCommon
{
    @Override
    public void preInit(File configFile)
    {
        super.preInit(configFile);
        System.out.println("pre init côté client");
    }

    @Override
    public void init()
    {
        super.init();
    }
}