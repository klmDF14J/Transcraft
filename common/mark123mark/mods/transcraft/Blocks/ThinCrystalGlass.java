package mark123mark.mods.transcraft.Blocks;

import java.util.List;


import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ThinCrystalGlass extends ThinBase 
{
    static String blockTextures[] = { "ClearGlass" };

    public ThinCrystalGlass(int id)
    {
        super(id, Material.glass, "glass/", blockTextures);
       
    }
}
