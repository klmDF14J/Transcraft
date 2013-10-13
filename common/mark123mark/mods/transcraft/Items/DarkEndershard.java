package mark123mark.mods.transcraft.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class DarkEndershard extends Item {

	public void updateIcons(IconRegister iconRegister)
	{
	         Icon iconIndex = iconRegister.registerIcon("Transcraft:DarkEndershard");
	}
	
	public DarkEndershard(int id) {
        super(id);
     // Constructor Configuration
        maxStackSize = 64;
      //  setCreativeTab(Transcraft.Transtab);
        setUnlocalizedName("DarkEndershard");
}

	
	 @Override
		public void registerIcons(IconRegister par1IconRegister)
		{
			 itemIcon = par1IconRegister.registerIcon("Transcraft:DarkEndershard");
		}
	

}
