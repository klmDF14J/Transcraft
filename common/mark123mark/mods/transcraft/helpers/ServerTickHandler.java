package mark123mark.mods.transcraft.helpers;

import java.util.EnumSet;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler
{
	private boolean raining;

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData)
	{

	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public EnumSet<TickType> ticks()
	{
		// TODO Auto-generated method stub
		return EnumSet.of(TickType.PLAYER);
	}

	@Override
	public String getLabel()
	{
		return "Transcraft.TickHandler.Player";
	}
}