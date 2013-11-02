package mark123mark.mods.transcraft.loaders;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class LoadChestGen {

	public static void LoadChest()
	{
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.BasicTransmuter),
						1, 10, 50));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.QuadTransmuter),
						1, 10, 10));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.NanoTransmuter),
						1, 10, 5));

		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.BasicTransmuter),
						1, 10, 50));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.QuadTransmuter),
						1, 10, 10));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.NanoTransmuter),
						1, 10, 5));

		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.BasicTransmuter),
						1, 10, 50));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.QuadTransmuter),
						1, 10, 15));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.NanoTransmuter),
						1, 10, 5));

		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.BasicTransmuter),
						1, 10, 15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.QuadTransmuter),
						1, 10, 10));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.NanoTransmuter),
						1, 10, 5));

		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.BasicTransmuter),
						1, 10, 50));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.QuadTransmuter),
						1, 10, 10));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.NanoTransmuter),
						1, 10, 5));

		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.BasicTransmuter),
						1, 10, 50));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.QuadTransmuter),
						1, 10, 10));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.NanoTransmuter),
						1, 10, 5));

		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.BasicTransmuter),
						1, 10, 50));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.QuadTransmuter),
						1, 10, 10));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(
				new WeightedRandomChestContent(new ItemStack(Transcraft.NanoTransmuter),
						1, 10, 5));
	}
	
	
}
