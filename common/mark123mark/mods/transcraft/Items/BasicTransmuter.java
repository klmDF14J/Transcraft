package mark123mark.mods.transcraft.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class BasicTransmuter extends Item {

	
	public BasicTransmuter(int id) {
        super(id);
     // Constructor Configuration
        maxStackSize = 64;
       // setCreativeTab(Transcraft.Transtab);
        setUnlocalizedName("BasicTransmuter");
}

	 @Override
		public void registerIcons(IconRegister par1IconRegister)
		{
			 itemIcon = par1IconRegister.registerIcon("Transcraft:BasicTransmuter");
		}
	  
	 
	  
}
