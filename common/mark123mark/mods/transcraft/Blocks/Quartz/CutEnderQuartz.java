package mark123mark.mods.transcraft.Blocks.Quartz;

import java.util.List;

import org.zaet.api.IColoredBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class CutEnderQuartz extends IColoredBlock {

	public static String texName;
	
	public CutEnderQuartz(int par1 , String texture) {
		super(par1);
		texName = texture;
	
	}

}
