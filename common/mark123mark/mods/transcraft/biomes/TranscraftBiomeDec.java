package mark123mark.mods.transcraft.biomes;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.COAL;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.DIAMOND;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.DIRT;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.GOLD;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.GRAVEL;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.IRON;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.LAPIS;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.REDSTONE;

import java.util.Random;

import mark123mark.mods.transcraft.api.Fluids;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class TranscraftBiomeDec extends BiomeDecorator
{

	/** The world the BiomeDecorator is currently decorating */
	public World currentWorld;

	/** The Biome Decorator's random number generator. */
	public Random randomGenerator;

	/** The X-coordinate of the chunk currently being decorated */
	public int chunk_X;

	/** The Z-coordinate of the chunk currently being decorated */
	public int chunk_Z;

	/** The biome generator object. */
	public BiomeGenBase biome;

	public int TransmutterPerChunk;

	public TranscraftBiomeDec(BiomeGenBase par1BiomeGenBase)
	{
		super(par1BiomeGenBase);
		TransmutterPerChunk = 0;
		biome = par1BiomeGenBase;
	}

	/**
	 * Decorates the world. Calls code that was formerly (pre-1.8) in
	 * ChunkProviderGenerate.populate
	 */
	@Override
	public void decorate(World par1World, Random par2Random, int par3, int par4)
	{
		if (currentWorld != null)
			return;
		else
		{
			currentWorld = par1World;
			randomGenerator = par2Random;
			chunk_X = par3;
			chunk_Z = par4;
			this.decorate();
			currentWorld = null;
			randomGenerator = null;
		}

	}

	/**
	 * The method that does the work of actually decorating chunks
	 */

	@Override
	protected void decorate()
	{
		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(currentWorld, randomGenerator, chunk_X, chunk_Z));
		// Added
		boolean doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, SAND);

		this.generateOres();

		int var1;
		int var2;
		int var3;
		int var4;
		int var5;

		for (var2 = 0; var2 < TransmutterPerChunk; ++var2)
		{

			var3 = chunk_X + randomGenerator.nextInt(16) + 8;
			var4 = randomGenerator.nextInt(randomGenerator.nextInt(randomGenerator.nextInt(112) + 8) + 8);
			var5 = chunk_Z + randomGenerator.nextInt(16) + 8;
			(new WorldGenLakes(Fluids.LiquidTransmutter.get().blockID)).generate(currentWorld, randomGenerator, var3, var4, var5);

		}

		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(currentWorld, randomGenerator, chunk_X, chunk_Z));
	}

	/**
	 * Standard ore generation helper. Generates most ores.
	 */
	@Override
	protected void genStandardOre1(int par1, WorldGenerator par2WorldGenerator, int par3, int par4)
	{
		for (int var5 = 0; var5 < par1; ++var5)
		{
			int var6 = chunk_X + randomGenerator.nextInt(16);
			int var7 = randomGenerator.nextInt(par4 - par3) + par3;
			int var8 = chunk_Z + randomGenerator.nextInt(16);
			par2WorldGenerator.generate(currentWorld, randomGenerator, var6, var7, var8);
		}
	}

	/**
	 * Standard ore generation helper. Generates Lapis Lazuli.
	 */
	@Override
	protected void genStandardOre2(int par1, WorldGenerator par2WorldGenerator, int par3, int par4)
	{
		for (int var5 = 0; var5 < par1; ++var5)
		{
			int var6 = chunk_X + randomGenerator.nextInt(16);
			int var7 = randomGenerator.nextInt(par4) + randomGenerator.nextInt(par4) + (par3 - par4);
			int var8 = chunk_Z + randomGenerator.nextInt(16);
			par2WorldGenerator.generate(currentWorld, randomGenerator, var6, var7, var8);
		}
	}

	/**
	 * Generates ores in the current chunk
	 */
	@Override
	protected void generateOres()
	{
		MinecraftForge.ORE_GEN_BUS.post(new OreGenEvent.Pre(currentWorld, randomGenerator, chunk_X, chunk_Z));

		if (TerrainGen.generateOre(currentWorld, randomGenerator, dirtGen, chunk_X, chunk_Z, DIRT))
		{
			this.genStandardOre1(20, dirtGen, 0, 256);
		}

		if (TerrainGen.generateOre(currentWorld, randomGenerator, gravelGen, chunk_X, chunk_Z, GRAVEL))
		{
			this.genStandardOre1(10, gravelGen, 0, 256);
		}

		if (TerrainGen.generateOre(currentWorld, randomGenerator, coalGen, chunk_X, chunk_Z, COAL))
		{
			this.genStandardOre1(20, coalGen, 0, 128);
		}

		if (TerrainGen.generateOre(currentWorld, randomGenerator, ironGen, chunk_X, chunk_Z, IRON))
		{
			this.genStandardOre1(20, ironGen, 0, 64);
		}

		if (TerrainGen.generateOre(currentWorld, randomGenerator, goldGen, chunk_X, chunk_Z, GOLD))
		{
			this.genStandardOre1(2, goldGen, 0, 32);
		}

		if (TerrainGen.generateOre(currentWorld, randomGenerator, redstoneGen, chunk_X, chunk_Z, REDSTONE))
		{
			this.genStandardOre1(8, redstoneGen, 0, 16);
		}

		if (TerrainGen.generateOre(currentWorld, randomGenerator, diamondGen, chunk_X, chunk_Z, DIAMOND))
		{
			this.genStandardOre1(1, diamondGen, 0, 16);
		}

		if (TerrainGen.generateOre(currentWorld, randomGenerator, lapisGen, chunk_X, chunk_Z, LAPIS))
		{
			this.genStandardOre2(1, lapisGen, 16, 16);
		}

		MinecraftForge.ORE_GEN_BUS.post(new OreGenEvent.Post(currentWorld, randomGenerator, chunk_X, chunk_Z));
	}
}
