package com.drjohnzoidberg.drzoidcraft.creativetab;


import com.drjohnzoidberg.drzoidcraft.init.ModItems;
import com.drjohnzoidberg.drzoidcraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabDrZoidCraft
{
    public static final CreativeTabs DRZOIDCRAFT_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.creativeLogo;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "DrZoidCraft";
        }

    };
}
