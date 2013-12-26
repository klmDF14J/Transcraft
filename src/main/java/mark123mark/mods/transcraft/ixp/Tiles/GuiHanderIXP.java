package mark123mark.mods.transcraft.ixp.Tiles;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHanderIXP implements IGuiHandler {


	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,int x, int y, int z) {
		TileEntity te = world.getBlockTileEntity(x, y, z);


		if(te instanceof TileIXP)
        {
        	return new ContainerIXP(player.inventory, (TileIXP) te);
        }
		
		else {
			return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,int x, int y, int z) {
		TileEntity te = world.getBlockTileEntity(x, y, z);
		if (te instanceof TileIXP) {
			return new GuiIxp(player.inventory, (TileIXP) te);
		}
		
		else {
			return null;
		}
	}

}
