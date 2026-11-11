package com.ancientrealms.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ancientrealms.AncientRealms;

/**
 * Client-only initialization. Keep client rendering classes out of common code.
 */
public final class AncientRealmsClient implements ClientModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger(AncientRealms.MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Ancient Realms client initialized.");
    }
}
