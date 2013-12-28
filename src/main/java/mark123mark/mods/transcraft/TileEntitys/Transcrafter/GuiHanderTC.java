package mark123mark.mods.transcraft.TileEntitys.Transcrafter;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHanderTC implements IGuiHandler {


	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,int x, int y, int z) {
		TileEntity te = world.getBlockTileEntity(x, y, z);

		if (te instanceof TileTC) {
			return new ContainerTC(player.inventory, world, x, y, z);
		}
	
		else {
			return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,int x, int y, int z) {
		TileEntity te = world.getBlockTileEntity(x, y, z);
		if (te instanceof TileTC) {
			return new GuiTC(player.inventory, world, x, y, z);
		}
		
		else {
			return null;
		}
	}

}
