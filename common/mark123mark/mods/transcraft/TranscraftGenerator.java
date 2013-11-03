package mark123mark.mods.transcraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import mark123mark.mods.transcraft.*;
import mark123mark.mods.transcraft.WorldGen.WorldGenRingSphere;
import mark123mark.mods.transcraft.WorldGen.WorldGenRings;
import mark123mark.mods.transcraft.WorldGen.WorldGenRuins;
import mark123mark.mods.transcraft.WorldGen.WorldGenTower;

public class TranscraftGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
		    generateNether(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 0:
		    generateSurface(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 1:
		    generateEnd(world, random, chunkX * 16, chunkZ * 16);
		    break;
		case 234:
		    generateTranDim(world, random, chunkX * 16, chunkZ * 16);
		    break;
		}
		
	}

	private void generateEnd(World worlde, Random random, int i, int j) {

	
	}
	
	private void generateSurface(World world, Random random, int i, int j) {
        
		for(int k = 0; k < 7; k++) {
			int TranscraftOreXCoord = i + random.nextInt(16);
			int TranscraftOreYCoord = random.nextInt(32);
			int TranscraftOreZCoord = j + random.nextInt(16);
			
			(new WorldGenMinable(Config.TranscraftOreID, 7)).generate(world, random, TranscraftOreXCoord, TranscraftOreYCoord, TranscraftOreZCoord);
			
		}
		for(int k = 0; k < 10; k++) {
			int TranscraftOreXCoord = i + random.nextInt(16);
			int TranscraftOreYCoord = random.nextInt(64);
			int TranscraftOreZCoord = j + random.nextInt(16);
			
			(new WorldGenMinable(Config.OilOreID, 10)).generate(world, random, TranscraftOreXCoord, TranscraftOreYCoord, TranscraftOreZCoord);
		}

		{
			if(random.nextInt(7500) == 0)
			{
				new WorldGenRingSphere(world, random).generate(i + 8, 0, j + 8);
			}
			if(random.nextInt(2500) == 0)
			{
				new WorldGenRings(world, random).generate(i + 8, 0, j + 8);
			}
			if(random.nextInt(2500) == 0)
			{
				new WorldGenRuins(world, random).generate(i + 8, 0, j + 8);
			}
			if(random.nextInt(2750) == 0)
			{
				new WorldGenTower(world, random).generate(i + 8, 0, j + 8);
			}
		}
		
		
		
	}
			
private void generateTranDim(World world, Random random, int i, int j) {
        
		for(int k = 0; k < 13; k++) {
			int TranscraftOreXCoord = i + random.nextInt(16);
			int TranscraftOreYCoord = random.nextInt(32);
			int TranscraftOreZCoord = j + random.nextInt(16);
			
			(new WorldGenMinable(Config.TranscraftOreID, 7)).generate(world, random, TranscraftOreXCoord, TranscraftOreYCoord, TranscraftOreZCoord);
			
		}
		for(int k = 0; k < 15; k++) {
			int TranscraftOreXCoord = i + random.nextInt(16);
			int TranscraftOreYCoord = random.nextInt(64);
			int TranscraftOreZCoord = j + random.nextInt(16);
			
			(new WorldGenMinable(Config.OilOreID, 10)).generate(world, random, TranscraftOreXCoord, TranscraftOreYCoord, TranscraftOreZCoord);
		}

		{
			if(random.nextInt(3500) == 0)
			{
				new WorldGenRingSphere(world, random).generate(i + 8, 0, j + 8);
			}
			if(random.nextInt(1500) == 0)
			{
				new WorldGenRings(world, random).generate(i + 8, 0, j + 8);
			}
			if(random.nextInt(1500) == 0)
			{
				new WorldGenRuins(world, random).generate(i + 8, 0, j + 8);
			}
			if(random.nextInt(1750) == 0)
			{
				new WorldGenTower(world, random).generate(i + 8, 0, j + 8);
			}
		}
		
		
		
	}
	
	private void generateNether(World world, Random random, int i, int j) {}
	
	
}
