package mark123mark.mods.transcraft.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class Oil extends Item {

	public Oil(int id) {
		super(id);
		// Constructor Configuration
		maxStackSize = 64;
		// setCreativeTab(Transcraft.Transtab);
		setUnlocalizedName("Oil");
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:Oil");
	}

}
