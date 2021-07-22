package com.setsukoshi.requiem.objects.blocks;

import com.setsukoshi.requiem.init.BlockInit;
import com.setsukoshi.requiem.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block
{
	public BlockBase(String name, Material material, float hardness, float resistance, int miningLevel, String tool)
	{
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(tool, miningLevel);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
}
