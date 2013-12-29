package mark123mark.mods.transcraft.Tools;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;

public class BunkerPick extends ItemPickaxe {

	public BunkerPick(int par1, ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:EnderPick");
	}

}
