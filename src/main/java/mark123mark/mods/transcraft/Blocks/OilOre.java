package mark123mark.mods.transcraft.Blocks;

import java.util.Random;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class OilOre extends Block {

	public OilOre(int par1) {
		super(Material.field_151576_e);
	}

	@Override
	public Item func_149650_a(int par1, Random random, int zero) {
		return Transcraft.Oil;
	}

}
