package mark123mark.mods.transcraft.biomes.transmania;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mark123mark.mods.transcraft.Config;
import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.WorldGen.TransManaia.EscapePortal;
import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
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
    
    
}

