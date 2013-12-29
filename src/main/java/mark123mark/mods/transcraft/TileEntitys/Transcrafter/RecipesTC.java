package mark123mark.mods.transcraft.TileEntitys.Transcrafter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;

public class RecipesTC {

	/** The static instance of this class */
	public static final RecipesTC instance = new RecipesTC();

	/** A list of all the recipes added */
	public List recipes = new ArrayList();

	/**
	 * Returns the static instance of this class
	 */
	public static final RecipesTC getInstance() {
		return instance;
	}

	public RecipesTC() {
		ItemStack dirtStack = new ItemStack(Blocks.dirt);
		ItemStack gravelStack = new ItemStack(Blocks.gravel);
		ItemStack CStoneStack = new ItemStack(Blocks.cobblestone);
		ItemStack CoalStack = new ItemStack(Items.coal);
		ItemStack GoldIStack = new ItemStack(Items.gold_ingot);
		ItemStack IronIStack = new ItemStack(Items.iron_ingot);
		ItemStack neatherbrickStack = new ItemStack(Blocks.nether_brick);
		ItemStack ObsidianStack = new ItemStack(Blocks.obsidian);
		ItemStack Water = new ItemStack(Items.water_bucket);
		ItemStack sponge = new ItemStack(Blocks.sponge);
		ItemStack DiamondBlock = new ItemStack(Blocks.diamond_block);
		ItemStack Owood = new ItemStack(Blocks.log);
		ItemStack Swood = new ItemStack(Blocks.log, 1, 1);
		ItemStack Bwood = new ItemStack(Blocks.log, 1, 2);
		ItemStack Jwood = new ItemStack(Blocks.log, 1, 3);

		addRecipe(new ItemStack(Items.coal, 10), "   ", "qcq", "   ", 'q',
				Transcraft.QuadTransmuter, 'c', Items.coal);
		addRecipe(new ItemStack(Transcraft.Oil, 10), "   ", "qoq", "   ", 'q',
				Transcraft.QuadTransmuter, 'o', Transcraft.Oil);
		addRecipe(new ItemStack(Items.iron_ingot, 4), "   ", "qiq", "   ", 'q',
				Transcraft.QuadTransmuter, 'i', Items.iron_ingot);
		addRecipe(new ItemStack(Items.gold_ingot, 6), "   ", "qgq", "   ", 'q',
				Transcraft.QuadTransmuter, 'g', Items.gold_ingot);
		addRecipe(new ItemStack(Blocks.glass, 6), "   ", "qgq", "   ", 'q',
				Transcraft.QuadTransmuter, 'g', Blocks.glass);
		addRecipe(new ItemStack(Items.redstone, 4), "   ", "qrq", "   ", 'q',
				Transcraft.QuadTransmuter, 'r', Items.redstone);
		addRecipe(new ItemStack(Blocks.dirt, 32), "   ", "bdb", "   ", 'b',
				Transcraft.QuadTransmuter, 'd', Blocks.dirt);
		addRecipe(new ItemStack(Blocks.sand, 16), "   ", "bsb", "   ", 'b',
				Transcraft.QuadTransmuter, 's', Blocks.sand);
		addRecipe(new ItemStack(Blocks.cobblestone, 25), "   ", "bcb", "   ",
				'b', Transcraft.QuadTransmuter, 'c', Blocks.cobblestone);
		addRecipe(new ItemStack(Blocks.log, 5), "   ", "bcb", "   ", 'b',
				Transcraft.QuadTransmuter, 'c', Owood);
		addRecipe(new ItemStack(Blocks.log, 5, 1), "   ", "bcb", "   ", 'b',
				Transcraft.QuadTransmuter, 'c', Swood);
		addRecipe(new ItemStack(Blocks.log, 5, 2), "   ", "bcb", "   ", 'b',
				Transcraft.QuadTransmuter, 'c', Bwood);
		addRecipe(new ItemStack(Blocks.log, 5, 3), "   ", "bcb", "   ", 'b',
				Transcraft.QuadTransmuter, 'c', Jwood);
		addRecipe(new ItemStack(Items.apple, 10), "   ", "bcb", "   ", 'b',
				Transcraft.QuadTransmuter, 'c', Items.apple);
		addRecipe(new ItemStack(Items.diamond, 1), "   ", "ebe", "   ", 'b',
				Transcraft.QuadTransmuter, 'e', Items.emerald);
		addRecipe(new ItemStack(Items.arrow, 5), "   ", "bcb", "   ", 'b',
				Transcraft.QuadTransmuter, 'c', Items.arrow);

		addRecipe(new ItemStack(Items.diamond, 4), "   ", "ndn", "   ", 'n',
				Transcraft.NanoTransmuter, 'd', Items.diamond);
		addRecipe(new ItemStack(Items.emerald, 4), " n ", "ndn", " n ", 'n',
				Transcraft.NanoTransmuter, 'd', Items.emerald);
		addRecipe(new ItemStack(Items.redstone, 32), " n ", "nrn", " n ", 'n',
				Transcraft.NanoTransmuter, 'r', Items.redstone);
		addRecipe(new ItemStack(Items.iron_ingot, 10), "   ", "nin", "   ", 'n',
				Transcraft.NanoTransmuter, 'i', Items.iron_ingot);
		addRecipe(new ItemStack(Items.coal, 24), "   ", "qcq", "   ", 'q',
				Transcraft.NanoTransmuter, 'c', Items.coal);
		addRecipe(new ItemStack(Blocks.glass, 24), "   ", "qgq", "   ", 'q',
				Transcraft.NanoTransmuter, 'g', Blocks.glass);
		addRecipe(new ItemStack(Blocks.dirt, 64), "   ", "bdb", "   ", 'b',
				Transcraft.NanoTransmuter, 'd', Blocks.dirt);
		addRecipe(new ItemStack(Blocks.sand, 32), "   ", "bsb", "   ", 'b',
				Transcraft.NanoTransmuter, 's', Blocks.sand);
		addRecipe(new ItemStack(Blocks.cobblestone, 64), "   ", "bcb", "   ",
				'b', Transcraft.NanoTransmuter, 'c', Blocks.cobblestone);
		addRecipe(new ItemStack(Blocks.log, 25), "   ", "bcb", "   ", 'b',
				Transcraft.NanoTransmuter, 'c', Owood);
		addRecipe(new ItemStack(Blocks.log, 25, 1), "   ", "bcb", "   ", 'b',
				Transcraft.NanoTransmuter, 'c', Swood);
		addRecipe(new ItemStack(Blocks.log, 25, 2), "   ", "bcb", "   ", 'b',
				Transcraft.NanoTransmuter, 'c', Bwood);
		addRecipe(new ItemStack(Blocks.log, 25, 3), "   ", "bcb", "   ", 'b',
				Transcraft.NanoTransmuter, 'c', Jwood);
		addRecipe(new ItemStack(Items.apple, 25), "   ", "bcb", "   ", 'b',
				Transcraft.NanoTransmuter, 'c', Items.apple);
		addRecipe(new ItemStack(Items.slime_ball, 15), "   ", "bcb", "   ", 'b',
				Transcraft.NanoTransmuter, 'c', Items.slime_ball);
		addRecipe(new ItemStack(Items.ender_pearl, 2), "   ", "bcb", "   ", 'b',
				Transcraft.NanoTransmuter, 'c', Items.ender_pearl);

		addRecipe(new ItemStack(Blocks.dirt, 8), "   ", "bdb", "   ", 'b',
				Transcraft.BasicTransmuter, 'd', Blocks.dirt);
		addRecipe(new ItemStack(Blocks.sand, 2), "   ", "bsb", "   ", 'b',
				Transcraft.BasicTransmuter, 's', Blocks.sand);
		addRecipe(new ItemStack(Blocks.cobblestone, 3), "   ", "bcb", "   ",
				'b', Transcraft.BasicTransmuter, 'c', Blocks.cobblestone);

		addRecipe(new ItemStack(Items.diamond, 1), "   ", "ebe", "   ", 'b',
				Transcraft.BasicTransmuter, 'e', Items.emerald);

		/*
		 * if (Loader.isModLoaded("TranscraftAddons")) { if
		 * (Loader.isModLoaded("IC2")) { ItemStack resin =
		 * Items.getItem("resin"); ItemStack resin15 =
		 * Items.getItem("resin").copy(); resin15.stackSize = 15;
		 * addRecipe((resin15), "   ", "ndn", "   ",'n',
		 * Transcraft.NanoTransmuter, 'd', resin);
		 * 
		 * ItemStack refinedIronIngot = Items.getItem("refinedIronIngot");
		 * ItemStack refinedIronIngot8 =
		 * Items.getItem("refinedIronIngot").copy(); refinedIronIngot8.stackSize
		 * = 8; addRecipe((refinedIronIngot8), "   ", "ndn", "   ",'n',
		 * Transcraft.NanoTransmuter, 'd', refinedIronIngot);
		 * 
		 * ItemStack copperIngot = Items.getItem("copperIngot"); ItemStack
		 * copperIngot8 = Items.getItem("copperIngot").copy();
		 * copperIngot8.stackSize = 8; addRecipe((copperIngot8), "   ", "ndn",
		 * "   ",'n', Transcraft.NanoTransmuter, 'd', copperIngot);
		 * 
		 * ItemStack tinIngot = Items.getItem("tinIngot"); ItemStack tinIngot8 =
		 * Items.getItem("tinIngot").copy(); tinIngot8.stackSize = 8;
		 * addRecipe((tinIngot8), "   ", "ndn", "   ",'n',
		 * Transcraft.NanoTransmuter, 'd', tinIngot);
		 * 
		 * ItemStack bronzeIngot = Items.getItem("bronzeIngot"); ItemStack
		 * bronzeIngot3 = Items.getItem("bronzeIngot").copy();
		 * bronzeIngot3.stackSize = 3; addRecipe((bronzeIngot3), "   ", "ndn",
		 * "   ",'n', Transcraft.NanoTransmuter, 'd', bronzeIngot);
		 * 
		 * ItemStack leadIngot = Items.getItem("leadIngot"); ItemStack
		 * leadIngot8 = Items.getItem("leadIngot").copy(); leadIngot8.stackSize
		 * = 8; addRecipe((leadIngot8), "   ", "ndn", "   ",'n',
		 * Transcraft.NanoTransmuter, 'd', leadIngot);
		 * 
		 * } }
		 */

	}

	public ShapedRecipes addRecipe(ItemStack par1ItemStack,
			Object... par2ArrayOfObj) {
		String s = "";
		int i = 0;
		int j = 0;
		int k = 0;

		if (par2ArrayOfObj[i] instanceof String[]) {
			String[] astring = ((String[]) par2ArrayOfObj[i++]);

			for (int l = 0; l < astring.length; ++l) {
				String s1 = astring[l];
				++k;
				j = s1.length();
				s = s + s1;
			}
		} else {
			while (par2ArrayOfObj[i] instanceof String) {
				String s2 = (String) par2ArrayOfObj[i++];
				++k;
				j = s2.length();
				s = s + s2;
			}
		}

		HashMap hashmap;

		for (hashmap = new HashMap(); i < par2ArrayOfObj.length; i += 2) {
			Character character = (Character) par2ArrayOfObj[i];
			ItemStack itemstack1 = null;

			if (par2ArrayOfObj[i + 1] instanceof Item) {
				itemstack1 = new ItemStack((Item) par2ArrayOfObj[i + 1]);
			} else if (par2ArrayOfObj[i + 1] instanceof Block) {
				itemstack1 = new ItemStack((Block) par2ArrayOfObj[i + 1], 1,
						32767);
			} else if (par2ArrayOfObj[i + 1] instanceof ItemStack) {
				itemstack1 = (ItemStack) par2ArrayOfObj[i + 1];
			}

			hashmap.put(character, itemstack1);
		}

		ItemStack[] aitemstack = new ItemStack[j * k];

		for (int i1 = 0; i1 < j * k; ++i1) {
			char c0 = s.charAt(i1);

			if (hashmap.containsKey(Character.valueOf(c0))) {
				aitemstack[i1] = ((ItemStack) hashmap
						.get(Character.valueOf(c0))).copy();
			} else {
				aitemstack[i1] = null;
			}
		}

		ShapedRecipes shapedrecipes = new ShapedRecipes(j, k, aitemstack,
				par1ItemStack);
		this.recipes.add(shapedrecipes);
		return shapedrecipes;
	}

	public void addShapelessRecipe(ItemStack par1ItemStack,
			Object... par2ArrayOfObj) {
		ArrayList arraylist = new ArrayList();
		Object[] aobject = par2ArrayOfObj;
		int i = par2ArrayOfObj.length;

		for (int j = 0; j < i; ++j) {
			Object object1 = aobject[j];

			if (object1 instanceof ItemStack) {
				arraylist.add(((ItemStack) object1).copy());
			} else if (object1 instanceof Item) {
				arraylist.add(new ItemStack((Item) object1));
			} else {
				if (!(object1 instanceof Block)) {
					throw new RuntimeException("Invalid shapeless recipy!");
				}

				arraylist.add(new ItemStack((Block) object1));
			}
		}

		this.recipes.add(new ShapelessRecipes(par1ItemStack, arraylist));
	}

	public ItemStack findMatchingRecipe(
			InventoryCrafting par1InventoryCrafting, World par2World) {
		int i = 0;
		ItemStack itemstack = null;
		ItemStack itemstack1 = null;
		int j;

		for (j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j) {
			ItemStack itemstack2 = par1InventoryCrafting.getStackInSlot(j);

			if (itemstack2 != null) {
				if (i == 0) {
					itemstack = itemstack2;
				}

				if (i == 1) {
					itemstack1 = itemstack2;
				}

				++i;
			}
		}

		if (i == 2 && itemstack.getItem() == itemstack1.getItem()
				&& itemstack.stackSize == 1 && itemstack1.stackSize == 1
				&& Item.itemsList[itemstack.itemID].isRepairable()) {
			Item item = Items.itemsList[itemstack.itemID];
			int k = Items.getMaxDamage() - itemstack.getItemDamageForDisplay();
			int l = Items.getMaxDamage() - itemstack1.getItemDamageForDisplay();
			int i1 = k + l + Items.getMaxDamage() * 5 / 100;
			int j1 = Items.getMaxDamage() - i1;

			if (j1 < 0) {
				j1 = 0;
			}

			return new ItemStack(itemstack.getItem(), 1, j1);
		} else {
			for (j = 0; j < this.recipes.size(); ++j) {
				IRecipe irecipe = (IRecipe) this.recipes.get(j);

				if (irecipe.matches(par1InventoryCrafting, par2World)) {
					return irecipe.getCraftingResult(par1InventoryCrafting);
				}
			}

			return null;
		}
	}

	/**
	 * returns the List<> of all recipes
	 */
	public List getRecipeList() {
		return this.recipes;
	}
}
