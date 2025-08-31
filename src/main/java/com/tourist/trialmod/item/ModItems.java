package com.tourist.trialmod.item;
import com.tourist.trialmod.TrialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
//import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //添加的物品
    public static final Item NETHER_ASH = registerItems("nether_ash",new Item(new Item.Settings()));
    public static final Item LEAD_INGOT = registerItems("lead_ingot",new Item(new Item.Settings()));
    //物品注册方法
    private static Item registerItems(String id, Item item) {
        // return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(TrialMod.MOD_ID,id)), item);
        return Registry.register(Registries.ITEM,  Identifier.of(TrialMod.MOD_ID,id), item);

    }
    //添加物品至原版物品栏
    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(NETHER_ASH);
        fabricItemGroupEntries.add(LEAD_INGOT);
    }

    //初始化模组物品
    public static void registerModItems() {
        //添加进原材料分类中
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);
        TrialMod.LOGGER.info("Registering Mod Items");
    }
}
