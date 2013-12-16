package mark123mark.mods.transcraft.Blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemCrystalGlass extends ItemBlock {

	
	public ItemCrystalGlass(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return  "_" + stack.getItemDamage();
	}

}
