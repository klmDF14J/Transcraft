package mark123mark.mods.transcraft.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorEnderBoots extends ItemArmor // implements
// IArmorTextureProvider
{

	private String LocationFile;
	private String textureFile;
	public String IconName;
	private int repairItemID = 0;

	public ArmorEnderBoots(int id, EnumArmorMaterial enumarmormaterial,
			int renderIndex, int armorType) {
		super(id, enumarmormaterial, renderIndex, armorType);

	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			int layer) {
		return "Transcraft:textures/armor/EnderArmor_1.png";
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:EnderBoots");
	}

}
