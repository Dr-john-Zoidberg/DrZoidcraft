package com.drjohnzoidberg.drzoidcraft.init;


import com.drjohnzoidberg.drzoidcraft.item.ItemDiamondBlockHoe;
import com.drjohnzoidberg.drzoidcraft.item.ItemDrZoidCraft;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemDrZoidCraft diamondBlockHoe = new ItemDiamondBlockHoe();

    public static void init()
    {
        GameRegistry.registerItem(diamondBlockHoe, "diamondBlockHoe");
    }
}
