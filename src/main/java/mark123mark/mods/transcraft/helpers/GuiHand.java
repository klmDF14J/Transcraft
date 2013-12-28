package mark123mark.mods.transcraft.helpers;

import mark123mark.mods.transcraft.Items.gui.TranspediaGui;
import mark123mark.mods.transcraft.TileEntitys.Transcrafter.ContainerTC;
import mark123mark.mods.transcraft.TileEntitys.Transcrafter.GuiTC;
import mark123mark.mods.transcraft.TileEntitys.Transcrafter.TileTC;
import mark123mark.mods.transcraft.ixp.Tiles.ContainerIXP;
import mark123mark.mods.transcraft.ixp.Tiles.GuiIxp;
import mark123mark.mods.transcraft.ixp.Tiles.TileIXP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHand implements IGuiHandler {


	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,int x, int y, int z) {
		TileEntity te = world.getBlockTileEntity(x, y, z);
		
		
		if(te instanceof TileIXP)
        {
        	return new ContainerIXP(player.inventory, (TileIXP) te);
        }
		else if (te instanceof TileTC) {
			return new ContainerTC(player.inventory, world, x, y, z);
		}
		else {
			return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,int x, int y, int z) {
		TileEntity te = world.getBlockTileEntity(x, y, z);
		
		 switch (ID) 
		 {

         case 3:
        	 return new TranspediaGui(player, world);

        	 
         }

		if (te instanceof TileIXP) {
			return new GuiIxp(player.inventory, (TileIXP) te);
		}
		else if (te instanceof TileTC) {
			return new GuiTC(player.inventory, world, x, y, z);
		}
		else {
			return null;
		}
	}

}
