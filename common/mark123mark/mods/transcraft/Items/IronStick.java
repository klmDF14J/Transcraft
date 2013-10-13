package mark123mark.mods.transcraft.Items;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class IronStick extends Item {

	
	
	public IronStick(int id) {
        super(id);
     // Constructor Configuration
        maxStackSize = 64;
      //  setCreativeTab(Transcraft.Transtab);
        setUnlocalizedName("IronStick");
}

	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		 itemIcon = par1IconRegister.registerIcon("Transcraft:IronStick");
	}
	
	
}
