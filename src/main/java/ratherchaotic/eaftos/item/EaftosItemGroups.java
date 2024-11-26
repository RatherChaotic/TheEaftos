package ratherchaotic.eaftos.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import ratherchaotic.eaftos.Eaftos;
import ratherchaotic.eaftos.block.EaftosBlocks;

public class EaftosItemGroups {
    public static final ItemGroup EAFTOS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Eaftos.MOD_ID, "eaftos_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(EaftosItems.CURSED_BOOK))
                    .displayName(Text.translatable("itemgroup.eaftos.eaftos_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(EaftosItems.CURSED_BOOK);
                        entries.add(EaftosBlocks.KENOS_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        Eaftos.LOGGER.info("Registering Eaftos Item Groups");
    }
}
