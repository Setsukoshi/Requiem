package com.setsukoshi.requiem;

import com.setsukoshi.requiem.proxy.CommonProxy;
import com.setsukoshi.requiem.util.Reference;
import com.setsukoshi.requiem.util.handlers.RegistryHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.MOD_NAME)
public class Requiem 
{
	@Instance
	public static Requiem instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistries();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		RegistryHandler.postInitRegistries();
	}
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries();
	}
	
}
