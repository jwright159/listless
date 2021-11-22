package com.github.jwright159.listless.commands;

import com.github.jwright159.listless.Listless;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class ListlessCommand extends CommandBase
{
	@Override
	public String getName()
	{
		return "listless";
	}

	@Override
	public String getUsage(ICommandSender sender)
	{
		return "commands.listless.usage";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
	{
		Listless.list();
	}

	@Override
	public int getRequiredPermissionLevel()
	{
		return 0;
	}
}
