package mark123mark.mods.transcraft;

import java.util.Comparator;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemHelper
{
	private static double rand;

	/**
	 * Compares two ItemStacks for equality, testing itemID, metaData,
	 * stackSize, and their NBTTagCompounds (if they are present)
	 * 
	 * @param first
	 *            The first ItemStack being tested for equality
	 * @param second
	 *            The second ItemStack being tested for equality
	 * @return true if the two ItemStacks are equivalent, false otherwise
	 */
	public static boolean compare(ItemStack first, ItemStack second)
	{

		return (ItemStackComparator.compare(first, second) == 0);
	}

	public static void droparrow(EntityPlayer player, EntityLivingBase entity)
	{

		if (GeneralHelper.isHostileEntity(entity))
		{
			rand = Math.random();

			if (rand < 0.15d)
			{
				entity.dropItem(Item.arrow.itemID, 1);
			}
		}
	}

	public static Comparator<ItemStack> ItemStackComparator = new Comparator<ItemStack>()
	{

		public int compare(ItemStack itemStack1, ItemStack itemStack2)
		{

			if (itemStack1 != null && itemStack2 != null)
			{
				// Sort on itemID
				if (itemStack1.itemID == itemStack2.itemID)
				{

					// Then sort on meta
					if (itemStack1.getItemDamage() == itemStack2.getItemDamage())
					{

						// Then sort on NBT
						if (itemStack1.hasTagCompound() && itemStack2.hasTagCompound())
						{

							// Then sort on stack size
							if (itemStack1.getTagCompound().equals(itemStack2.getTagCompound()))
							{
								return (itemStack1.stackSize - itemStack2.stackSize);
							}
							else
							{
								return (itemStack1.getTagCompound().hashCode() - itemStack2.getTagCompound().hashCode());
							}
						}
						else if (!(itemStack1.hasTagCompound()) && itemStack2.hasTagCompound())
						{
							return -1;
						}
						else if (itemStack1.hasTagCompound() && !(itemStack2.hasTagCompound()))
						{
							return 1;
						}
						else
						{
							return (itemStack1.stackSize - itemStack2.stackSize);
						}
					}
					else
					{
						return (itemStack1.getItemDamage() - itemStack2.getItemDamage());
					}
				}
				else
				{
					return (itemStack1.itemID - itemStack2.itemID);
				}
			}
			else if (itemStack1 != null && itemStack2 == null)
			{
				return -1;
			}
			else if (itemStack1 == null && itemStack2 != null)
			{
				return 1;
			}
			else
			{
				return 0;
			}

		}

	};
}
