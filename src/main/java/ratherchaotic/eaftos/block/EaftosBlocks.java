package ratherchaotic.eaftos.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import ratherchaotic.eaftos.Eaftos;
import ratherchaotic.eaftos.block.custom.KenosBlock;

public class EaftosBlocks {

    public static final Block KENOS_BLOCK = registerBlock("kenos_block", new KenosBlock(AbstractBlock.Settings.create()
            .strength(-1.0F, 3600000.0F)
            .dropsNothing()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Eaftos.MOD_ID, "kenos_block")))));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Eaftos.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Eaftos.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Eaftos.MOD_ID, name)))));
    }
    public static void registerEaftosBlocks() {
        Eaftos.LOGGER.info("Registering Blocks for " + Eaftos.MOD_ID);
    }
}
