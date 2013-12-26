package mark123mark.mods.transcraft.ixp.Tiles;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiIxp extends GuiContainer
{
    private static final ResourceLocation field_110421_t = new ResourceLocation("transcraft", "textures/gui/IxpGrinder.png");
    private IInventory upperChestInventory;
    private IInventory lowerChestInventory;

    /**
     * window height is calculated with this values, the more rows, the heigher
     */
    private int inventoryRows;
	private TileIXP te;

	public GuiIxp(InventoryPlayer player,TileIXP tileEntity) {
		super(new ContainerIXP(player, tileEntity));
		this.xSize = 256;
		this.ySize = 256;
		this.te = tileEntity;
		this.lowerChestInventory = player;
		this.upperChestInventory = te;
	}

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        this.fontRenderer.drawString("Ixp Grinder", 8, 8, 4210752);
        this.fontRenderer.drawString("Inventory", 8, this.ySize - 130, 4210752);
        this.fontRenderer.drawString("IXP: "+te.getIXPValue(), 113, 40, 4210752);
        
        this.fontRenderer.drawString("< 1. Put in a xp Bottle", 26, this.ySize - 230, 4210752);
        this.fontRenderer.drawString("2. Put items in the next 9 slots", 8, this.ySize - 180, 4210752);
        this.fontRenderer.drawString("3. When your Ixp vaule hits 256", 8, this.ySize - 170, 4210752);
        this.fontRenderer.drawString("You will get 1 xp bottle", 20, this.ySize - 160, 4210752);
        this.fontRenderer.drawString("4. Put more items in!", 8, this.ySize - 150, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(field_110421_t);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
        //this.drawTexturedModalRect(k, l + this.inventoryRows * 18 + 17, 0, 126, this.xSize, 96);
    }
   
}
