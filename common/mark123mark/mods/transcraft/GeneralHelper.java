package mark123mark.mods.transcraft;

import java.util.ArrayList;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.IMob;
import net.minecraft.item.ItemStack;

public class GeneralHelper
{

	public static Object[] convertSingleStackToPluralStacks(ItemStack stack)
	{

		ArrayList<ItemStack> list = new ArrayList<ItemStack>();
		ItemStack currentStack;

		for (int i = 0; i < stack.stackSize; i++)
		{
			currentStack = new ItemStack(stack.itemID, 1, stack.getItemDamage());
			list.add(currentStack);
		}

		return list.toArray();
	}

	public static boolean isHostileEntity(EntityLivingBase entity)
	{

		if (entity instanceof IMob)
			return true;
		else
			return false;
	}
}
