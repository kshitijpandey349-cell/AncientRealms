package com.ancientrealms.content;

import com.ancientrealms.AncientRealms;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ModItems {
    private static final Map<String, Item> MATERIALS = new LinkedHashMap<>();
    public static final Item MYTHRIL_INGOT = material("mythril_ingot");
    public static final Item ORICHALCUM_INGOT = material("orichalcum_ingot");
    public static final Item ADAMANTITE_INGOT = material("adamantite_ingot");
    public static final Item COBALT_INGOT = material("cobalt_ingot");
    public static final Item TITANIUM_INGOT = material("titanium_ingot");
    public static final Item SILVER_INGOT = material("silver_ingot");
    public static final Item RUBY = material("ruby");
    public static final Item SAPPHIRE = material("sapphire");
    public static final Item TOPAZ = material("topaz");
    public static final Item DRAGONSTONE = material("dragonstone");
    public static final Item FROSTSTEEL_INGOT = material("froststeel_ingot");
    public static final Item EMBERITE_INGOT = material("emberite_ingot");
    public static final Item STORM_CRYSTAL = material("storm_crystal");
    public static final Item VOID_SHARD = material("void_shard");
    public static final Item AETHERIUM_INGOT = material("aetherium_ingot");
    public static final Item ANCIENT_GOLD_INGOT = material("ancient_gold_ingot");
    public static final Item MOONSTONE = material("moonstone");
    private ModItems() {}
    private static Item material(String name) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AncientRealms.MOD_ID, name));
        Item item = new Item(new Item.Properties().setId(key));
        Registry.register(BuiltInRegistries.ITEM, key, item);
        MATERIALS.put(name, item);
        return item;
    }
    public static Map<String, Item> materials() { return Map.copyOf(MATERIALS); }
    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(entries -> MATERIALS.values().forEach(entries::accept));
        AncientRealms.LOGGER.info("Registered {} progression materials.", MATERIALS.size());
    }
}
