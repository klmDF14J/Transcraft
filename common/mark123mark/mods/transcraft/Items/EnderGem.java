package mark123mark.mods.transcraft.Items;



import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class EnderGem extends Item {

	public void updateIcons(IconRegister iconRegister)
	{
	         Icon iconIndex = iconRegister.registerIcon("Transcraft:EnderGem");
	}
	
	public EnderGem(int id) {
        super(id);
     // Constructor Configuration
        maxStackSize = 16;
      //  setCreativeTab(Transcraft.Transtab);
        setUnlocalizedName("EnderGem");
}

	
	 @Override
		public void registerIcons(IconRegister par1IconRegister)
		{
			 itemIcon = par1IconRegister.registerIcon("Transcraft:EnderGem");
		}
	
	
  
	
}
