package com.github.jwright159.listless;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Listless.MODID, name = Listless.NAME, version = Listless.VERSION)
public class Listless
{
	public static final String MODID = "listless";
	public static final String NAME = "Listless";
	public static final String VERSION = "@VERSION@";

	@Mod.Instance(MODID)
	public static Listless instance;

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		Logger logger = LogManager.getLogger(MODID);
		logger.info("Logging items");
		for (Item item : Item.REGISTRY)
			logger.info(Item.REGISTRY.getIDForObject(item) + " " + item.getRegistryName());
	}
}
