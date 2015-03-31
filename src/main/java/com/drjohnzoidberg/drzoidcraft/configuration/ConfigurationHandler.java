package com.drjohnzoidberg.drzoidcraft.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {

        Configuration configuration = new Configuration(configFile);

        try
        {
            configuration.load();

            boolean configValue = configuration.get("Simple", "configValue", true, "This is an example config value" ).getBoolean(true);

        }
        catch (Exception e)
        {
            //log the error
        }
        finally
        {
            configuration.save();
        }
    }
}
