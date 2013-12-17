package mark123mark.mods.transcraft.Blocks.Quartz;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemEnderQuartzBigBrick extends ItemBlock {

	
	public ItemEnderQuartzBigBrick(int par1) {
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
