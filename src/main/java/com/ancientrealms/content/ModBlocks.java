package com.ancientrealms.content;

import com.ancientrealms.AncientRealms;
import com.ancientrealms.content.block.AncientWorkbenchBlock;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

public final class ModBlocks {
    private static final Map<String, Block> ORES = new LinkedHashMap<>();
    private static final Map<String, Block> STATIONS = new LinkedHashMap<>();
    public static final Block MYTHRIL_ORE = ore("mythril_ore",3.5f);
    public static final Block ORICHALCUM_ORE = ore("orichalcum_ore",4f);
    public static final Block COBALT_ORE = ore("cobalt_ore",3f);
    public static final Block TITANIUM_ORE = ore("titanium_ore",4.5f);
    public static final Block SILVER_ORE = ore("silver_ore",3f);
    public static final Block RUBY_ORE = ore("ruby_ore",3.5f);
    public static final Block SAPPHIRE_ORE = ore("sapphire_ore",3.5f);
    public static final Block TOPAZ_ORE = ore("topaz_ore",3.5f);
    public static final Block DRAGONSTONE_ORE = ore("dragonstone_ore",5f);
    public static final Block EMBERITE_ORE = ore("emberite_ore",4f);
    public static final Block FROSTSTEEL_ORE = ore("froststeel_ore",4f);
    public static final Block STORM_CRYSTAL_ORE = ore("storm_crystal_ore",4f);
    public static final Block VOIDSTONE_ORE = ore("voidstone_ore",5f);
    public static final Block AETHERIUM_ORE = ore("aetherium_ore",5f);
    public static final Block ANCIENT_GOLD_ORE = ore("ancient_gold_ore",4f);
    public static final Block RUNIC_ASSEMBLER = station("runic_assembler",Blocks.CRAFTING_TABLE);
    public static final Block CRYSTAL_REFINERY = station("crystal_refinery",Blocks.FURNACE);
    public static final Block DRAGONFORGE = station("dragonforge",Blocks.BLAST_FURNACE);
    public static final Block ALCHEMY_TABLE = station("alchemy_table",Blocks.BREWING_STAND);
    public static final Block GEMCUTTER = station("gemcutter",Blocks.STONECUTTER);
    public static final Block RUNE_INSCRIBER = station("rune_inscriber",Blocks.ENCHANTING_TABLE);
    public static final Block RELIC_WORKBENCH = station("relic_workbench",Blocks.SMITHING_TABLE);
    public static final Block ARCANE_LOOM = station("arcane_loom",Blocks.LOOM);
    private ModBlocks() {}
    private static Identifier id(String name) { return Identifier.fromNamespaceAndPath(AncientRealms.MOD_ID,name); }
    private static Block ore(String name,float hardness) {
        Block block=register(BlockItemId.create(id(name),id(name)),Block::new,
                BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).strength(hardness,6f).requiresCorrectToolForDrops());
        ORES.put(name,block); return block;
    }
    private static Block station(String name,Block copy) {
        Block block=register(BlockItemId.create(id(name),id(name)),AncientWorkbenchBlock::new,
                BlockBehaviour.Properties.ofFullCopy(copy).strength(3f,6f));
        STATIONS.put(name,block); return block;
    }
    private static Block register(BlockItemId id,Function<BlockBehaviour.Properties,Block> factory,BlockBehaviour.Properties properties) {
        Block block=factory.apply(properties.setId(id.block()));
        Registry.register(BuiltInRegistries.BLOCK,id.block(),block);
        BlockItem item=new BlockItem(block,new Item.Properties().useBlockDescriptionPrefix().setId(id.item()));
        Registry.register(BuiltInRegistries.ITEM,id.item(),item); return block;
    }
    public static Map<String,Block> ores(){return Map.copyOf(ORES);}
    public static Map<String,Block> stations(){return Map.copyOf(STATIONS);}
    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
            ORES.values().forEach(block -> entries.accept(block.asItem()));
            STATIONS.values().forEach(block -> entries.accept(block.asItem()));
        });
        AncientRealms.LOGGER.info("Registered {} ores and {} workstations.",ORES.size(),STATIONS.size());
    }
}
