package com.tourist.trialmod.item;

import com.tourist.trialmod.TrialMod;
import com.tourist.trialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> TRIAL_GROUP = register("trial_group");
    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(TrialMod.MOD_ID,id));
    }
    public static void registerModItemGroups() {
        Registry.register(Registries.ITEM_GROUP, TRIAL_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP,7)
                        .displayName(Text.translatable("itemGroup.trialmod.trial_group"))
                        .icon(() ->new ItemStack(ModItems.NETHER_ASH))
                        .entries((displayContext, entries) ->{
                            //普通物品
                            entries.add(ModItems.NETHER_ASH);
                            entries.add(ModItems.LEAD_INGOT);
                            //方块
                            entries.add(ModBlocks.LEAD_BLOCK);
                            entries.add(ModBlocks.NETHER_ASH_BLOCK);
                        } )
                        .build());

        TrialMod.LOGGER.info("Registering Mod Item Groups");
    }
}
