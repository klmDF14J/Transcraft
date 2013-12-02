package mark123mark.mods.transcraft.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorPlasticLegs extends ItemArmor
{

	private String LocationFile;
	private String textureFile;
	public String IconName;
	private int repairItemID = 0;

	public ArmorPlasticLegs(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
		maxStackSize = 1;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
	{
		return "Transcraft:textures/armor/PlasticArmor_2.png";
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon("Transcraft:PlasticLegs");
	}

}
