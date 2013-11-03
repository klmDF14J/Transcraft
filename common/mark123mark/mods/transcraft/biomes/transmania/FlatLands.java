package mark123mark.mods.transcraft.biomes.transmania;

import java.util.Random;

import mark123mark.mods.transcraft.Config;
import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.WorldGen.TransManaia.EscapePortal;
import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraft.world.gen.feature.WorldGenerator;

public class FlatLands extends BiomeGenBase
{
    public FlatLands(int par1)
    {
        super(par1);
        this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, 5, 2, 6));
        this.theBiomeDecorator.treesPerChunk = 1;
        this.theBiomeDecorator.flowersPerChunk = 7;
        this.theBiomeDecorator.grassPerChunk = 8;
        this.spawnableMonsterList.clear();
      //  this.topBlock = (byte)Transcraft.TransDimGrass.blockID;
    }
 
    
    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);

        if (par2Random.nextInt(500) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            EscapePortal EscapePortal = new EscapePortal();
            EscapePortal.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
        }
    }

    
    
}

