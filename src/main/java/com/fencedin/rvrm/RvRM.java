package com.fencedin.rvrm;

import com.fencedin.rvrm.proxy.IProxy;
import com.fencedin.rvrm.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class RvRM
{
    @Mod.Instance(Reference.MOD_ID)
    public static RvRM instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //load network handling, mod config, items, blocks
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //register GUI, recipes, tile entities, general handlers
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //other, stuff after other mods
    }
}
