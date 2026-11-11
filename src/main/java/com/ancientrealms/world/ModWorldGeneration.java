package com.ancientrealms.world;

import com.ancientrealms.AncientRealms;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public final class ModWorldGeneration {
    private static final String[] ORES={"mythril","orichalcum","cobalt","titanium","silver","ruby","sapphire","topaz","dragonstone","emberite","froststeel","storm_crystal","voidstone","aetherium","ancient_gold"};
    private ModWorldGeneration(){}
    public static void initialize(){
        for(String ore:ORES){
            ResourceKey<PlacedFeature> key=ResourceKey.create(Registries.PLACED_FEATURE,Identifier.fromNamespaceAndPath(AncientRealms.MOD_ID,ore+"_ore_placed"));
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),GenerationStep.Decoration.UNDERGROUND_ORES,key);
        }
        AncientRealms.LOGGER.info("Registered {} Overworld ore features.",ORES.length);
    }
}
