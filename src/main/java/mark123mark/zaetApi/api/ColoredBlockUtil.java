package mark123mark.zaetApi.api;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ColoredBlockUtil
{
	/***
	 * 
	 * @param itemBlock The ItemBlock
	 * @param suffix Red $SUFFIX$
	 * 
	 * The method to add localizations to IColoredItemBlocks
	 */
	public static void addLocalizationsForBlock(ItemBlock itemBlock, String suffix)
	{
		for(int i = 15; i >= 0; i--)
		{
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock.itemID, 1, i)) + ".name", getColorNameByMetadata(i) + " " + suffix);
		}
	}
	
	/***
	 * 
	 * @param itemStack
	 * @param middle
	 * @param shouldUseMetaFromMiddle Use meta for middle itemstack
	 */
	public static void addCraftingRecipeToItemStack(ItemStack itemStack, ItemStack middle, boolean shouldUseMetaFromMiddle)
	{
		for(int i = 15; i >= 0; i--)
		{
			if(shouldUseMetaFromMiddle)
			{
				GameRegistry.addShapedRecipe(new ItemStack(itemStack.itemID, 8, i), "DDD", "DSD", "DDD", 'S', new ItemStack(middle.itemID, 1, i), 'D', new ItemStack(Item.dyePowder, 1, i));
			}
			else
			{
				GameRegistry.addShapedRecipe(new ItemStack(itemStack.itemID, 8, i), "DDD", "DSD", "DDD", 'S', new ItemStack(middle.itemID, 1, middle.getItemDamage()), 'D', new ItemStack(Item.dyePowder, 1, i));
			}
		}
	}
	
	/**
	 * 
	 * @param Meta
	 * @return The Color from Meta
	 * 
	 * Gets a color from a meta-data file.
	 */
	public static String getColorNameByMetadata(int meta)
	{
		return IColoredItemBlock.subNames[meta];
	}
}
