package mark123mark.mods.transcraft.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorEnderHelmet extends ItemArmor // implements
// IArmorTextureProvider
{

	private String LocationFile;
	private String textureFile;
	public String IconName;
	private int repairItemID = 0;

	public ArmorEnderHelmet(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			int layer) {
		return "Transcraft:textures/armor/EnderArmor_1.png";
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:EnderHelmet");
	}

}
