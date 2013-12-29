package mark123mark.mods.transcraft.Tools;

import mark123mark.mods.transcraft.helpers.Config;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class PlasticSword extends ItemSword {

	public PlasticSword(int par1, ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack,
			ItemStack par2ItemStack) {
		return par2ItemStack.getItem() == Config.PlasticID;
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:PlasticSword");
	}
}
