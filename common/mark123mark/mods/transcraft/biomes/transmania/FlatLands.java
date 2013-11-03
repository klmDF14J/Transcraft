package mark123mark.mods.transcraft.biomes.transmania;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class FlatLands extends BiomeGenBase
{
    public FlatLands(int par1)
    {
        super(par1);
        this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, 5, 2, 6));
        this.theBiomeDecorator.treesPerChunk = 1;
        this.theBiomeDecorator.flowersPerChunk = 5;
        this.theBiomeDecorator.grassPerChunk = 4;
        this.spawnableMonsterList.clear();
    }
}

