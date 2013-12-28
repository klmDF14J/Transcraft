package mark123mark.mods.transcraft.Items;

import javax.swing.Icon;

import net.minecraft.item.Item;

public class EnderGem extends Item {

	public void updateIcons(IconRegister iconRegister) {
		Icon iconIndex = iconRegister.registerIcon("Transcraft:EnderGem");
	}

	public EnderGem(int id) {
		super(id);
		// Constructor Configuration
		maxStackSize = 16;
		// setCreativeTab(Transcraft.Transtab);
		setUnlocalizedName("EnderGem");
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:EnderGem");
	}

}
