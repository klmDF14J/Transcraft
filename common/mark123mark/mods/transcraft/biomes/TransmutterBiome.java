package mark123mark.mods.transcraft.biomes;

import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TransmutterBiome extends BiomeGenBase
{
	private TranscraftBiomeDec customBiomeDecorator;

	public TransmutterBiome(int par1)
	{
		super(par1);
		theBiomeDecorator = new TranscraftBiomeDec(this);
		customBiomeDecorator = (TranscraftBiomeDec) theBiomeDecorator;
		customBiomeDecorator.TransmutterPerChunk = 3;
		this.theBiomeDecorator.treesPerChunk = 1;
		this.theBiomeDecorator.flowersPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 8;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public int getBiomeGrassColor()
	{
		return 0x07D7FF;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getBiomeFoliageColor()
	{
		return 0x07D7FF;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float par1)
	{
		return 0x07D7FF;
	}

}
