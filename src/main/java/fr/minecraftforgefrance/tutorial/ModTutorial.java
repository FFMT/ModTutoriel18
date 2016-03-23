package fr.minecraftforgefrance.tutorial;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModTutorial.MODID, name = "Mod Tutorial", version = "0.1", acceptedMinecraftVersions = "[1.8.9]")
public class ModTutorial
{
    public static final String MODID = "tutorial";
    
    @Instance(ModTutorial.MODID)
    public static ModTutorial instance;
    
    @SidedProxy(clientSide = "fr.minecraftforgefrance.tutorial.TutorialClient", serverSide = "fr.minecraftforgefrance.tutorial.TutorialServer")
    public static TutorialCommon proxy;
    
    public static Logger logger;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event.getSuggestedConfigurationFile());
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }
}