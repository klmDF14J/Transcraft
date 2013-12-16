package mark123mark.mods.transcraft.Blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class TransBlocks extends Block {

	public static String[] types = {"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "light_blue", "magenta", "orange", "white"};
	
	public TransBlocks(int par1) {
		super(par1, Material.rock);
	}
	
	private int nextNum;
	
	@Override
	public int damageDropped (int metadata) {
		return metadata;
	}
	

	private static Icon[] tex = new Icon[types.length];
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		for(int i = 0; i < types.length; i++) {
			String type = types[i].toLowerCase();
//			tex[i] = icon.registerIcon("transcraft:ColourTest_" + type);
			tex[i] = icon.registerIcon("transcraft:ColourTest");
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
			return tex[meta];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int id, CreativeTabs tab, List list) {
		for(int i = 0; i < types.length; i++) {
			list.add(new ItemStack(id, 1, i));
		}
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)

	    /**
	     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
	     * when first determining what to render.
	     */
	    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	    {
		int meta = par1IBlockAccess.getBlockMetadata(par2, par3, par4);

		if (meta == 0)
		{
			return 0x000000; //black
		}
		if (meta == 1)
		{
			return 0xff0000; //red
		}
		if (meta == 2)
		{
			return 0x00ff06; //green
		}
		if (meta == 3)
		{
			return 0x631111; //brown
		}
		if (meta == 4)
		{
			return 0x0000ff; //blue
		}
		
	        return 0xffffff;
	    }
	
	
}
