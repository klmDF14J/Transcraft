package mark123mark.mods.transcraft.Tools;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.helpers.Config;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class PlasticAxe extends ItemAxe {

	public PlasticAxe(int par1, ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack,
			ItemStack par2ItemStack) {
		return par2ItemStack.itemID == Transcraft.Plastic;
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:PlasticAxe");
	}
}
