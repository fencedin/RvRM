package com.fencedin.rvrm.init;


import com.fencedin.rvrm.item.ItemCore;
import com.fencedin.rvrm.item.ItemRvRM;
import com.fencedin.rvrm.reference.Names;
import com.fencedin.rvrm.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemRvRM core = new ItemCore();

    public static void init()
    {
        GameRegistry.registerItem(core, Names.Items.CORE);
    }
}
