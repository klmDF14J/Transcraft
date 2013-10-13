package mark123mark.mods.transcraft.Items;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class QuadTransmuter extends Item {

	
	
	public QuadTransmuter(int id) {
        super(id);
     // Constructor Configuration
        maxStackSize = 64;
      //  setCreativeTab(Transcraft.Transtab);
        setUnlocalizedName("QuadTransmuter");
}

	
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		 itemIcon = par1IconRegister.registerIcon("Transcraft:QuadTransmuter");
	}
	
	
}
