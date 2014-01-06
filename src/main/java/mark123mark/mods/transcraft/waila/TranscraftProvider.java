package mark123mark.mods.transcraft.waila;

import java.util.List;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.ixp.Tiles.TileIXP;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import mcp.mobius.waila.api.IWailaDataProvider;
import mcp.mobius.waila.api.IWailaRegistrar;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TranscraftProvider implements IWailaDataProvider {

	@Override
	public ItemStack getWailaStack(IWailaDataAccessor accessor, IWailaConfigHandler config) {
		return null;
	}

	@Override
	public List<String> getWailaHead(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
		return currenttip;
	}

	@Override
	public List<String> getWailaBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
		if(accessor.getBlock() == Transcraft.ixpGrinder) {
			TileIXP te = (TileIXP) accessor.getTileEntity();
			currenttip.add("Amount Of IXP: " + te.CurrentIXPValue);
		}
		if(accessor.getBlock() == Transcraft.ObsidianLever) {
			currenttip.add("State: " + (accessor.getMetadata() < 8 ? "Off" : "On"));
		}
		return currenttip;
	}

	@Override
	public List<String> getWailaTail(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
		return currenttip;
	}
	
	public static void callbackRegister(IWailaRegistrar registrar) {
		registrar.registerBodyProvider(new TranscraftProvider(), Transcraft.ixpGrinder.blockID);
		registrar.registerBodyProvider(new TranscraftProvider(), Transcraft.ObsidianLever.blockID);
	}
}
