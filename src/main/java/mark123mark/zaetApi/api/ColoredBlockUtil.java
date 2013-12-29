package mark123mark.zaetApi.api;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ColoredBlockUtil {
	/***
	 * 
	 * @param itemBlock
	 *            The ItemBlock
	 * @param suffix
	 *            Red $SUFFIX$
	 * 
	 *            The method to add localizations to IColoredItemBlocks
	 */
	public static void addLocalizationsForBlock(ItemBlock itemBlock,
			String suffix) {
		for (int i = 15; i >= 0; i--) {
			LanguageRegistry.instance().addStringLocalization(
					itemBlock.getUnlocalizedName(new ItemStack(
							itemBlock, 1, i)) + ".name",
					getColorNameByMetadata(i) + " " + suffix);
		}
	}

	/**
	 * 
	 * @param Meta
	 * @return The Color from Meta
	 * 
	 *         Gets a color from a meta-data file.
	 */
	public static String getColorNameByMetadata(int meta) {
		return IColoredItemBlock.subNames[meta];
	}
}
