package mark123mark.mods.transcraft.biomes.transmania;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FlatLands extends BiomeGenBase
{
    public FlatLands(int par1)
    {
        super(par1);
        this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, 5, 2, 6));
        this.theBiomeDecorator.treesPerChunk = 1;
        this.theBiomeDecorator.flowersPerChunk = 0;
        this.theBiomeDecorator.grassPerChunk = 8;
        this.spawnableMonsterList.clear();
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
    
    @SideOnly(Side.CLIENT)
    public int getSkyColorByTemp(float par1)
    {
    		return 0x07D7FF;
    }
    
}

