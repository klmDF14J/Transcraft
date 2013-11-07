package mark123mark.mods.transcraft.Items.Food;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class HotDog extends ItemFood {

	
	public HotDog(int id) {
        super(id, 3, 1, false);
     // Constructor Configuration
        maxStackSize = 64;
       // setCreativeTab(Transcraft.Transtab);
        setUnlocalizedName("BasicTransmuter");
}

	 @Override
		public void registerIcons(IconRegister par1IconRegister)
		{
			 itemIcon = par1IconRegister.registerIcon("Transcraft:HotDog");
		}

}
