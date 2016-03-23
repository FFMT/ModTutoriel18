package fr.minecraftforgefrance.tutorial;

import java.io.File;

public class TutorialServer extends TutorialCommon
{
    @Override
    public void preInit(File configFile)
    {
        super.preInit(configFile);
        System.out.println("pre init côté serveur");
    }

    @Override
    public void init()
    {
        super.init();
    }

}