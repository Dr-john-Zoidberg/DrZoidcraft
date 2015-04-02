package com.drjohnzoidberg.drzoidcraft.init;


import com.drjohnzoidberg.drzoidcraft.item.ItemCreativeLogo;
import com.drjohnzoidberg.drzoidcraft.item.ItemDiamondBlockHoe;
import com.drjohnzoidberg.drzoidcraft.item.ItemDrZoidCraft;
import com.drjohnzoidberg.drzoidcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemDrZoidCraft diamondBlockHoe = new ItemDiamondBlockHoe();
    public static final ItemDrZoidCraft creativeLogo = new ItemCreativeLogo();

    public static void init()
    {
        GameRegistry.registerItem(diamondBlockHoe, "diamondBlockHoe");
        GameRegistry.registerItem(creativeLogo, "creativeLogo");

    }
}
