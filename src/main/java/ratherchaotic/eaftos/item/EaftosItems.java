package ratherchaotic.eaftos.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import ratherchaotic.eaftos.TheEaftos;

public class EaftosItems {
    public static final Item CURSED_BOOK = registerItem("cursed_book", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TheEaftos.MOD_ID, "cursed_book")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheEaftos.MOD_ID, name), item);
    }

    public static void registerEaftosItems() {
        TheEaftos.LOGGER.info("Registering Items for " +TheEaftos.MOD_ID);
    }
}
