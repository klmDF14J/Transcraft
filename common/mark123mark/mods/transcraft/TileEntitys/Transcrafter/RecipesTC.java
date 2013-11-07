package mark123mark.mods.transcraft.TileEntitys.Transcrafter;

import ic2.api.item.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;
import cpw.mods.fml.common.Loader;



public class RecipesTC {
	
	    /** The static instance of this class */
	    public static final RecipesTC instance = new RecipesTC();

	    /** A list of all the recipes added */
	    public List recipes = new ArrayList();

	    /**
	     * Returns the static instance of this class
	     */
	    public static final RecipesTC getInstance()
	    {
	        return instance;
	    }

	    public RecipesTC()
	    {
	    	ItemStack dirtStack = new ItemStack(Block.dirt);
	        ItemStack gravelStack = new ItemStack(Block.gravel);
	        ItemStack CStoneStack = new ItemStack(Block.cobblestone);
	        ItemStack CoalStack = new ItemStack(Item.coal);
	        ItemStack GoldIStack = new ItemStack(Item.ingotGold);
	        ItemStack IronIStack = new ItemStack(Item.ingotIron);
	        ItemStack neatherbrickStack = new ItemStack(Block.netherBrick);
	        ItemStack ObsidianStack = new ItemStack(Block.obsidian);
	        ItemStack Water = new ItemStack(Item.bucketWater);
	        ItemStack sponge = new ItemStack(Block.sponge);
	        ItemStack DiamondBlock = new ItemStack(Block.blockDiamond);
	        ItemStack Owood = new ItemStack(Block.wood);
	        ItemStack Swood = new ItemStack(Block.wood, 1, 1);
	        ItemStack Bwood = new ItemStack(Block.wood, 1, 2);
	        ItemStack Jwood = new ItemStack(Block.wood, 1, 3);
	    	
	    	addRecipe(new ItemStack(Item.coal, 10), "   ", "qcq", "   ",'q', Transcraft.QuadTransmuter, 'c', Item.coal);
	        addRecipe(new ItemStack(Transcraft.Oil, 10), "   ", "qoq", "   ",'q', Transcraft.QuadTransmuter, 'o', Transcraft.Oil);
	        addRecipe(new ItemStack(Item.ingotIron, 4), "   ", "qiq", "   ",'q', Transcraft.QuadTransmuter, 'i', Item.ingotIron);
	        addRecipe(new ItemStack(Item.ingotGold, 6), "   ", "qgq", "   ",'q', Transcraft.QuadTransmuter, 'g', Item.ingotGold);
	        addRecipe(new ItemStack(Block.glass, 6), "   ", "qgq", "   ",'q', Transcraft.QuadTransmuter, 'g', Block.glass);
	        addRecipe(new ItemStack(Item.redstone, 4), "   ", "qrq", "   ",'q', Transcraft.QuadTransmuter, 'r', Item.redstone);
	        addRecipe(new ItemStack(Block.dirt, 32), "   ", "bdb", "   ",'b', Transcraft.QuadTransmuter, 'd', Block.dirt);
	        addRecipe(new ItemStack(Block.sand, 16), "   ", "bsb", "   ",'b', Transcraft.QuadTransmuter, 's', Block.sand);
	        addRecipe(new ItemStack(Block.cobblestone, 25), "   ", "bcb", "   ",'b', Transcraft.QuadTransmuter, 'c', Block.cobblestone);
	        addRecipe(new ItemStack(Block.wood, 5), "   ", "bcb", "   ",'b', Transcraft.QuadTransmuter, 'c', Owood);
	        addRecipe(new ItemStack(Block.wood, 5, 1), "   ", "bcb", "   ",'b', Transcraft.QuadTransmuter, 'c', Swood);
	        addRecipe(new ItemStack(Block.wood, 5, 2), "   ", "bcb", "   ",'b', Transcraft.QuadTransmuter, 'c', Bwood);
	        addRecipe(new ItemStack(Block.wood, 5, 3), "   ", "bcb", "   ",'b', Transcraft.QuadTransmuter, 'c', Jwood);
	        addRecipe(new ItemStack(Item.appleRed, 10), "   ", "bcb", "   ",'b', Transcraft.QuadTransmuter, 'c', Item.appleRed);
	        addRecipe(new ItemStack(Item.diamond, 1), "   ", "ebe", "   ",'b', Transcraft.QuadTransmuter, 'e', Item.emerald);
	        addRecipe(new ItemStack(Item.arrow, 5), "   ", "bcb", "   ",'b', Transcraft.QuadTransmuter, 'c', Item.arrow);
	        
	        addRecipe(new ItemStack(Item.diamond, 4), "   ", "ndn", "   ",'n', Transcraft.NanoTransmuter, 'd', Item.diamond);
	        addRecipe(new ItemStack(Item.emerald, 4), " n ", "ndn", " n ",'n', Transcraft.NanoTransmuter, 'd', Item.emerald);
	        addRecipe(new ItemStack(Item.redstone, 32), " n ", "nrn", " n ",'n', Transcraft.NanoTransmuter, 'r', Item.redstone);
	        addRecipe(new ItemStack(Item.ingotIron, 10), "   ", "nin", "   ",'n', Transcraft.NanoTransmuter, 'i', Item.ingotIron);
	        addRecipe(new ItemStack(Item.coal, 24), "   ", "qcq", "   ",'q', Transcraft.NanoTransmuter, 'c', Item.coal);
	        addRecipe(new ItemStack(Block.glass, 24), "   ", "qgq", "   ",'q', Transcraft.NanoTransmuter, 'g', Block.glass);
	        addRecipe(new ItemStack(Block.dirt, 64), "   ", "bdb", "   ",'b', Transcraft.NanoTransmuter, 'd', Block.dirt);
	        addRecipe(new ItemStack(Block.sand, 32), "   ", "bsb", "   ",'b', Transcraft.NanoTransmuter, 's', Block.sand);
	        addRecipe(new ItemStack(Block.cobblestone, 64), "   ", "bcb", "   ",'b', Transcraft.NanoTransmuter, 'c', Block.cobblestone);
	        addRecipe(new ItemStack(Block.wood, 25), "   ", "bcb", "   ",'b', Transcraft.NanoTransmuter, 'c', Owood);
	        addRecipe(new ItemStack(Block.wood, 25, 1), "   ", "bcb", "   ",'b', Transcraft.NanoTransmuter, 'c', Swood);
	        addRecipe(new ItemStack(Block.wood, 25, 2), "   ", "bcb", "   ",'b', Transcraft.NanoTransmuter, 'c', Bwood);
	        addRecipe(new ItemStack(Block.wood, 25, 3), "   ", "bcb", "   ",'b', Transcraft.NanoTransmuter, 'c', Jwood);
	        addRecipe(new ItemStack(Item.appleRed, 25), "   ", "bcb", "   ",'b', Transcraft.NanoTransmuter, 'c', Item.appleRed);
	        addRecipe(new ItemStack(Item.slimeBall, 15), "   ", "bcb", "   ",'b', Transcraft.NanoTransmuter, 'c', Item.slimeBall);
	        addRecipe(new ItemStack(Item.enderPearl, 2), "   ", "bcb", "   ",'b', Transcraft.NanoTransmuter, 'c', Item.enderPearl);
 
	        
	        
	        addRecipe(new ItemStack(Block.dirt, 8), "   ", "bdb", "   ",'b', Transcraft.BasicTransmuter, 'd', Block.dirt);
	        addRecipe(new ItemStack(Block.sand, 2), "   ", "bsb", "   ",'b', Transcraft.BasicTransmuter, 's', Block.sand);
	        addRecipe(new ItemStack(Block.cobblestone, 3), "   ", "bcb", "   ",'b', Transcraft.BasicTransmuter, 'c', Block.cobblestone);
	        
	        addRecipe(new ItemStack(Item.diamond, 1), "   ", "ebe", "   ",'b', Transcraft.BasicTransmuter, 'e', Item.emerald);
	       
	        if (Loader.isModLoaded("TranscraftAddons"))
	        {
	        	if (Loader.isModLoaded("IC2"))
		        {
		        	ItemStack resin = Items.getItem("resin");
		 			ItemStack resin15 = Items.getItem("resin").copy();
		 			resin15.stackSize = 15;
		 			addRecipe((resin15), "   ", "ndn", "   ",'n', Transcraft.NanoTransmuter, 'd', resin);
					
		 			ItemStack refinedIronIngot = Items.getItem("refinedIronIngot");
		 			ItemStack refinedIronIngot8 = Items.getItem("refinedIronIngot").copy();
		 			refinedIronIngot8.stackSize = 8;
		 			addRecipe((refinedIronIngot8), "   ", "ndn", "   ",'n', Transcraft.NanoTransmuter, 'd', refinedIronIngot);
		 			
		 			ItemStack copperIngot = Items.getItem("copperIngot");
		 			ItemStack copperIngot8 = Items.getItem("copperIngot").copy();
		 			copperIngot8.stackSize = 8;
		 			addRecipe((copperIngot8), "   ", "ndn", "   ",'n', Transcraft.NanoTransmuter, 'd', copperIngot);
		 			
		 			ItemStack tinIngot = Items.getItem("tinIngot");
		 			ItemStack tinIngot8 = Items.getItem("tinIngot").copy();
		 			tinIngot8.stackSize = 8;
		 			addRecipe((tinIngot8), "   ", "ndn", "   ",'n', Transcraft.NanoTransmuter, 'd', tinIngot);
		 			
		 			ItemStack bronzeIngot = Items.getItem("bronzeIngot");
		 			ItemStack bronzeIngot3 = Items.getItem("bronzeIngot").copy();
		 			bronzeIngot3.stackSize = 3;
		 			addRecipe((bronzeIngot3), "   ", "ndn", "   ",'n', Transcraft.NanoTransmuter, 'd', bronzeIngot);
		 			
		 			ItemStack leadIngot = Items.getItem("leadIngot");
		 			ItemStack leadIngot8 = Items.getItem("leadIngot").copy();
		 			leadIngot8.stackSize = 8;
		 			addRecipe((leadIngot8), "   ", "ndn", "   ",'n', Transcraft.NanoTransmuter, 'd', leadIngot);
		 			
		        } 
	        }
	       
	        if (Loader.isModLoaded("TranscraftAddons"))
	        {
	        	if (Loader.isModLoaded("AppliedEnergistics"))
		        {
	        	//	ItemStack blkQuartz = Materials.matQuartz.copy();
	    		//	ItemStack blkQuartz24 =  Materials.matQuartz.copy();
	    		//	blkQuartz24.stackSize = 24;
	    			
	    		//	addRecipe((blkQuartz24), "   ", "ndn", "   ",'n', Transcraft.NanoTransmuter, 'd', blkQuartz);
	    		
		        } 
	        }
	        
	        if (Loader.isModLoaded("TranscraftAddons"))
	        {
	        	if (Loader.isModLoaded("Railcraft"))
		        {
	        	
	    			//addRecipe(("ingotSteel"), "   ", "ndn", "   ",'n', Transcraft.NanoTransmuter, 'd', ":ingotSteel");
		        } 
	        }
	        
	      //  , Character.valueOf('F'), ingotCopper
	        
	        
	    }

	    public ShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	    {
	        String s = "";
	        int i = 0;
	        int j = 0;
	        int k = 0;

	        if (par2ArrayOfObj[i] instanceof String[])
	        {
	            String[] astring = ((String[])par2ArrayOfObj[i++]);

	            for (int l = 0; l < astring.length; ++l)
	            {
	                String s1 = astring[l];
	                ++k;
	                j = s1.length();
	                s = s + s1;
	            }
	        }
	        else
	        {
	            while (par2ArrayOfObj[i] instanceof String)
	            {
	                String s2 = (String)par2ArrayOfObj[i++];
	                ++k;
	                j = s2.length();
	                s = s + s2;
	            }
	        }

	        HashMap hashmap;

	        for (hashmap = new HashMap(); i < par2ArrayOfObj.length; i += 2)
	        {
	            Character character = (Character)par2ArrayOfObj[i];
	            ItemStack itemstack1 = null;

	            if (par2ArrayOfObj[i + 1] instanceof Item)
	            {
	                itemstack1 = new ItemStack((Item)par2ArrayOfObj[i + 1]);
	            }
	            else if (par2ArrayOfObj[i + 1] instanceof Block)
	            {
	                itemstack1 = new ItemStack((Block)par2ArrayOfObj[i + 1], 1, 32767);
	            }
	            else if (par2ArrayOfObj[i + 1] instanceof ItemStack)
	            {
	                itemstack1 = (ItemStack)par2ArrayOfObj[i + 1];
	            }

	            hashmap.put(character, itemstack1);
	        }

	        ItemStack[] aitemstack = new ItemStack[j * k];

	        for (int i1 = 0; i1 < j * k; ++i1)
	        {
	            char c0 = s.charAt(i1);

	            if (hashmap.containsKey(Character.valueOf(c0)))
	            {
	                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
	            }
	            else
	            {
	                aitemstack[i1] = null;
	            }
	        }

	        ShapedRecipes shapedrecipes = new ShapedRecipes(j, k, aitemstack, par1ItemStack);
	        this.recipes.add(shapedrecipes);
	        return shapedrecipes;
	    }

	    public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	    {
	        ArrayList arraylist = new ArrayList();
	        Object[] aobject = par2ArrayOfObj;
	        int i = par2ArrayOfObj.length;

	        for (int j = 0; j < i; ++j)
	        {
	            Object object1 = aobject[j];

	            if (object1 instanceof ItemStack)
	            {
	                arraylist.add(((ItemStack)object1).copy());
	            }
	            else if (object1 instanceof Item)
	            {
	                arraylist.add(new ItemStack((Item)object1));
	            }
	            else
	            {
	                if (!(object1 instanceof Block))
	                {
	                    throw new RuntimeException("Invalid shapeless recipy!");
	                }

	                arraylist.add(new ItemStack((Block)object1));
	            }
	        }

	        this.recipes.add(new ShapelessRecipes(par1ItemStack, arraylist));
	    }

	    public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
	    {
	        int i = 0;
	        ItemStack itemstack = null;
	        ItemStack itemstack1 = null;
	        int j;

	        for (j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
	        {
	            ItemStack itemstack2 = par1InventoryCrafting.getStackInSlot(j);

	            if (itemstack2 != null)
	            {
	                if (i == 0)
	                {
	                    itemstack = itemstack2;
	                }

	                if (i == 1)
	                {
	                    itemstack1 = itemstack2;
	                }

	                ++i;
	            }
	        }

	        if (i == 2 && itemstack.itemID == itemstack1.itemID && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && Item.itemsList[itemstack.itemID].isRepairable())
	        {
	            Item item = Item.itemsList[itemstack.itemID];
	            int k = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
	            int l = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
	            int i1 = k + l + item.getMaxDamage() * 5 / 100;
	            int j1 = item.getMaxDamage() - i1;

	            if (j1 < 0)
	            {
	                j1 = 0;
	            }

	            return new ItemStack(itemstack.itemID, 1, j1);
	        }
	        else
	        {
	            for (j = 0; j < this.recipes.size(); ++j)
	            {
	                IRecipe irecipe = (IRecipe)this.recipes.get(j);

	                if (irecipe.matches(par1InventoryCrafting, par2World))
	                {
	                    return irecipe.getCraftingResult(par1InventoryCrafting);
	                }
	            }

	            return null;
	        }
	    }

	    /**
	     * returns the List<> of all recipes
	     */
	    public List getRecipeList()
	    {
	        return this.recipes;
	    }
}
