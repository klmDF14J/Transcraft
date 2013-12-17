package mark123mark.mods.transcraft.Blocks.Quartz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import mark123mark.mods.transcraft.Transcraft;
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


public class EnderQuartz extends Block {

	public static String[] types = {
		  "White", "Orange",  "Magenta", "Light Blue", "Yellow", "Light Green",
		  "Pink", "Dark Grey", "Light Grey", "Cyan", "Purple", "Blue", "Brown",
		  "Green", "Red", "Black"
		 };
	
	public static String texName;
	
	public EnderQuartz(int par1 , String texture) {
		super(par1, Material.rock);
		texName = texture;
	}
	
/*
 3
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c) 
	{		
		if (world.getBlockMetadata(x, y, z) == 0) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 1);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 1) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 2);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 2) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 3);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 3) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 4);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 4) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 5);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 5) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 6);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 6) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 7);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 7) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 8);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 8) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 9);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 9) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 10);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 10) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 11);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 11) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 12);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 12) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 13);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 13) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 14);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 14) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 15);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		if (world.getBlockMetadata(x, y, z) == 15) {
			world.setBlockMetadataWithNotify(x, y, z, Transcraft.enderQuartz.blockID, 0);
			world.markBlockForRenderUpdate(x, y, z);
			return true;
		}
		return false;
	}
	
	
	 */
	
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
			tex[i] = icon.registerIcon("transcraft:" + texName);
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
		switch(par1IBlockAccess.getBlockMetadata(par2, par3, par4))
		  {
		  case 0: return 0xFFFFFF;
		  case 1: return 0xFF9900;
		  case 2: return 0xCC00CC;
		  case 3: return 0x6699FF;
		  case 4: return 0xFFFF00;
		  case 5: return 0x99CC00; 
		  case 6: return 0xFF66FF;
		  case 7: return 0x585858;
		  case 8: return 0xA8A8A8;
		  case 9: return 0x00CC99;
		  case 10: return 0x990066;
		  case 11: return 0x3333CC;
		  case 12: return 0x663300;
		  case 13: return 0x336600;
		  case 14: return 0xCC0000;
		  case 15: return 0x0f0f0f;
		  default: return 0xFFFFFF;
		  }
	    }
	
	@Override
	 public int getRenderColor(int i)
	 {
	  switch(i)
	  {
	  case 0: return 0xFFFFFF;
	  case 1: return 0xFF9900;
	  case 2: return 0xCC00CC;
	  case 3: return 0x6699FF;
	  case 4: return 0xFFFF00;
	  case 5: return 0x99CC00; 
	  case 6: return 0xFF66FF;
	  case 7: return 0x585858;
	  case 8: return 0xA8A8A8;
	  case 9: return 0x00CC99;
	  case 10: return 0x990066;
	  case 11: return 0x3333CC;
	  case 12: return 0x663300;
	  case 13: return 0x336600;
	  case 14: return 0xCC0000;
	  case 15: return 0x0f0f0f;
	  default: return 0xFFFFFF;
	  }
	 }
}
