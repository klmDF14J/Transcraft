package mark123mark.mods.transcraft.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class EnderQuartz extends Item
{

	public EnderQuartz(int id)
	{
		super(id);
		// Constructor Configuration
		maxStackSize = 16;
		// setCreativeTab(Transcraft.Transtab);
		setUnlocalizedName("EnderQuartz");
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon("Transcraft:EnderQuartz");
	}

}
