package mark123mark.mods.transcraft.Tools;

import mark123mark.mods.transcraft.helpers.Config;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class PlasticShovel extends ItemSpade {

	public PlasticShovel(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack,
			ItemStack par2ItemStack) {
		return par2ItemStack.itemID == Config.PlasticID;
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:PlasticShovel");
	}
}
