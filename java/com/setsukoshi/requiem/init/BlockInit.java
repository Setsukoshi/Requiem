package com.setsukoshi.requiem.init;

import java.util.ArrayList;
import java.util.List;

import com.setsukoshi.requiem.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON, 6.0f, 30.0f, 3, "pickaxe");
}
