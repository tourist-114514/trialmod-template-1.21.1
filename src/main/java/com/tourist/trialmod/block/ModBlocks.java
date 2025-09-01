package com.tourist.trialmod.block;

import com.tourist.trialmod.TrialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks{
    public static final Block LEAD_BLOCK=register("lead_block",new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    //注册方块物品
    public static void registerBlockItems(String id,Block block){
        //Item item=
        Registry.register(Registries.ITEM,Identifier.of(TrialMod.MOD_ID,id),new BlockItem(block,new Item.Settings()));
        //if (item instanceof BlockItem) {
        //    ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        //}
    }
    //注册方块
    public static Block register(String id, Block block) {
        registerBlockItems(id,block);
        return Registry.register(Registries.BLOCK, Identifier.of(TrialMod.MOD_ID,id), block);
    }
    public static void registerModBlocks(){
        TrialMod.LOGGER.info("Registering Mod Blocks");
    }
}