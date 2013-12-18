package mark123mark.mods.transcraft.fluids;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.api.Fluids;
import mark123mark.mods.transcraft.helpers.Config;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

import com.google.common.base.Optional;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TranscraftFluids {

	public static void init() {
		registerFluids();
		initializeLiquids();
		initializeContainers();
		registerBlocks();
		registerItems();
	}

	private static void registerFluids() {

		Fluids.LiquidTransmutterFluid = Optional.of(new LiquidTransmutterFluid(
				"transcraft:LiquidTransmutter")
				.setBlockID(Config.LiquidTransmutterFluidStillID));
		FluidRegistry.registerFluid(Fluids.LiquidTransmutterFluid.get());
	}

	private static void initializeLiquids() {
		Fluids.LiquidTransmutter = Optional.of(new BlockFluidLiquidTransmuter(
				Config.LiquidTransmutterFluidStillID,
				Fluids.LiquidTransmutterFluid.get(), Material.water)
				.setUnlocalizedName("transcraft:LiquidTransmutter")
				.setCreativeTab(Transcraft.TranstabBlocks));
	}

	private static void initializeContainers() {

		Fluids.ItemBucketLiquidTrasnmutter = Optional
				.of((new ItemBucketLiquidTrasnmutter(
						Config.BucketLiquidTrasnmutterID).setMaxStackSize(1)
						.setUnlocalizedName("transcraft.BucketLiquidTrasnmutter"))
						.setCreativeTab(Transcraft.TranstabItems));

		FluidContainerRegistry.registerFluidContainer(
				Fluids.LiquidTransmutterFluid.get(), new ItemStack(
						Fluids.ItemBucketLiquidTrasnmutter.get(), 1, 1),
				new ItemStack(Fluids.ItemBucketLiquidTrasnmutter.get(), 1, 0));
	}

	private static void registerBlocks() {
		LanguageRegistry.addName(Fluids.LiquidTransmutter.get(),
				"LiquidTransmutter");
		GameRegistry.registerBlock(Fluids.LiquidTransmutter.get(),
				"LiquidTransmutter");
	}

	private static void registerItems() {
		GameRegistry.registerItem(Fluids.ItemBucketLiquidTrasnmutter.get(),
				"Transbucket");
		// registerItem(Fluids.ItemBucketLiquidTrasnmutter.get());
	}

	public static void registerItem(Item item) {
		GameRegistry.registerItem(item,
				item.getUnlocalizedName().replace("item.", ""));
	}

}