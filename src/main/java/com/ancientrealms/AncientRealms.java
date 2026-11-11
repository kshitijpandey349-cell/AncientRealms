package com.ancientrealms;

import com.ancientrealms.content.ModBlocks;
import com.ancientrealms.content.ModItems;
import com.ancientrealms.world.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AncientRealms implements ModInitializer {
    public static final String MOD_ID = "ancientrealms";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override public void onInitialize() {
        ModItems.initialize();
        ModBlocks.initialize();
        ModWorldGeneration.initialize();
        LOGGER.info("Ancient Realms materials, stations, and world generation initialized.");
    }
}
