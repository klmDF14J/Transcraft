package mark123mark.mods.transcraft.Items;

import net.minecraft.item.Item;

public class BasicTransmuter extends Item {

	public BasicTransmuter(int id) {
		super(id);
		// Constructor Configuration
		maxStackSize = 64;
		// setCreativeTab(Transcraft.Transtab);
		setUnlocalizedName("BasicTransmuter");
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:BasicTransmuter");
	}

}
