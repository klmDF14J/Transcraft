package mark123mark.mods.TranscraftAddons;

import mark123mark.mods.transcraft.Transcraft;

public class AddonFMP implements  IPartFactory 
{

	public static void registerBlocks() {
		BlockMicroMaterial.createAndRegister(Transcraft.TranscraftOre);
		BlockMicroMaterial.createAndRegister(Transcraft.OilOre);
		BlockMicroMaterial.createAndRegister(Transcraft.BlueLight);
		BlockMicroMaterial.createAndRegister(Transcraft.GreenLight);
		BlockMicroMaterial.createAndRegister(Transcraft.OrangeLight);
		BlockMicroMaterial.createAndRegister(Transcraft.DarkLight);
		BlockMicroMaterial.createAndRegister(Transcraft.ClearGlass);
		BlockMicroMaterial.createAndRegister(Transcraft.FancyCrystalGlass);
		BlockMicroMaterial.createAndRegister(Transcraft.BunkerBlock);
		BlockMicroMaterial.createAndRegister(Transcraft.SmoothBunkerBlock);
		BlockMicroMaterial.createAndRegister(Transcraft.ComIronOre);
		BlockMicroMaterial.createAndRegister(Transcraft.ComGoldOre);
		BlockMicroMaterial.createAndRegister(Transcraft.ComTransmutterOre);
		BlockMicroMaterial.createAndRegister(Transcraft.DriedTransmutter);
		BlockMicroMaterial.createAndRegister(Transcraft.TransManiaOre);
		
		
		

		/*
		 * 
		 * 
		 * 
		 * for(int i = 15; i >= 0; i--) {
		 * BlockMicroMaterial.createAndRegister(Transcraft.enderQuartzBlock, i);
		 * }
		 * 
		 * for(int i = 15; i >= 0; i--) {
		 * BlockMicroMaterial.createAndRegister(Transcraft.CutenderQuartz ,i); }
		 * 
		 * for(int i = 15; i >= 0; i--) {
		 * BlockMicroMaterial.createAndRegister(Transcraft.EnderQuartzBrick, i);
		 * }
		 * 
		 * for(int i = 15; i >= 0; i--) {
		 * BlockMicroMaterial.createAndRegister(Transcraft.EnderQuartzBigBrick,
		 * i); }
		 */

	}

	@Override
	public TMultiPart createPart(String arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
