package mark123mark.mods.transcraft.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mark123mark.mods.transcraft.Items.ItemTexturedArmor;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorPlasticChestplate extends ItemArmor //implements IArmorTextureProvider
{

	private String LocationFile;
	private String textureFile;
	public String IconName;
	private int repairItemID = 0;

	public ArmorPlasticChestplate(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
	}

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {
		return "Transcraft:armor/PlasticArmor_1.png";
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		 itemIcon = par1IconRegister.registerIcon("Transcraft:PlasticChest");
	}

}
