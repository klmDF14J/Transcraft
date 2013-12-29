package mark123mark.mods.transcraft.Tools;

import mark123mark.mods.transcraft.helpers.Config;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class PlasticPickaxe extends ItemPickaxe {

	public PlasticPickaxe(int par1, ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
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
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:PlasticPickaxe");
	}
}
