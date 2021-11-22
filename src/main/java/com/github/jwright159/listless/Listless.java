package com.github.jwright159.listless;

import com.github.jwright159.listless.commands.ListlessCommand;
import net.minecraft.item.Item;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
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
	public void init(FMLInitializationEvent event)
	{
		ClientCommandHandler.instance.registerCommand(new ListlessCommand());
	}

	public static void list()
	{
		Logger logger = LogManager.getLogger(MODID);
		logger.info("Logging items");
		for (Item item : Item.REGISTRY)
			logger.info(
					String.format("%16s", Integer.toBinaryString(Item.REGISTRY.getIDForObject(item))).replace(" ", "0") + " " +
					String.format("%4d", Item.REGISTRY.getIDForObject(item)) + " " +
					item.getRegistryName());
	}
}
