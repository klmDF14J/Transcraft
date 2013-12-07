package mark123mark.mods.transcraft.TileEntitys.LiquidTranscrafter;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHanderLTC implements IGuiHandler
{

	// @Override
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity te = world.getBlockTileEntity(x, y, z);

		if (te instanceof TileLTC)
		{
			return new ContainerLTC(player.inventory, world, x, y, z);
		}
		else
		{
			return null;
		}
	}

	// @Override
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity te = world.getBlockTileEntity(x, y, z);
		if (te instanceof TileLTC)
		{
			return new GuiLTC(player.inventory, world, x, y, z);
		}

		else
		{
			return null;
		}
	}

}
