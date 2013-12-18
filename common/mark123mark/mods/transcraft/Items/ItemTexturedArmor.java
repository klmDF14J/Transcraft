package mark123mark.mods.transcraft.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemTexturedArmor extends ItemArmor // implements
// IArmorTextureProvider
{

	private String LocationFile;
	private String textureFile;
	public String IconName;
	private int repairItemID = 0;

	public ItemTexturedArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}

	public ItemTexturedArmor setRepairItem(int id) {
		repairItemID = id;
		return this;
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack,
			ItemStack par2ItemStack) {
		return par2ItemStack.itemID == repairItemID;
	}

	public ItemTexturedArmor setTextureFile(String filename) {
		textureFile = filename;
		return this;
	}

	public ItemTexturedArmor setLocationFile(String filename) {
		LocationFile = filename;
		return this;
	}

	public String getArmorTextureFile(ItemStack itemstack) {
		return "/assets/transcraft/armor/" + textureFile + ".png";
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:" + IconName);
	}

}
