package com.ancientrealms;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entrypoint for Ancient Realms.
 */
public final class AncientRealms implements ModInitializer {
    public static final String MOD_ID = "ancientrealms";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Ancient Realms foundation is initializing.");
        // Feature registries are added in their own development phases.
    }
}
