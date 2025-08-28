package com.tourist.trialmod.item;
import com.tourist.trialmod.TrialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    //添加的物品
    public static final Item NETHER_ASH = registerItems("nether_ash",new Item(new Item.Settings()));
    //物品注册方法
    private static Item registerItems(String id, Item item) {
        // return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(TrialMod.MOD_ID,id)), item);
        return Registry.register(Registries.ITEM,  Identifier.of(TrialMod.MOD_ID,id), item);

    }

    public static void registerModItems() {
        TrialMod.LOGGER.info("Registering Mod Items");
    }
}
