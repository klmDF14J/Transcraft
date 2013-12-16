package mark123mark.mods.transcraft.Blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemTransBlocks extends ItemBlock {

	public ItemTransBlocks(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "Block_" + stack.getItemDamage();
	}

}
