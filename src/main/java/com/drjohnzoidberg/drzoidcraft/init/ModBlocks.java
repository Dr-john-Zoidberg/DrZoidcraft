package com.drjohnzoidberg.drzoidcraft.init;

import com.drjohnzoidberg.drzoidcraft.block.BlockDrZoidCraft;
import com.drjohnzoidberg.drzoidcraft.block.Blocktest;
import com.drjohnzoidberg.drzoidcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockDrZoidCraft test = new Blocktest();

    public static void init()
    {
        GameRegistry.registerBlock(test, "testblock");
    }
}
