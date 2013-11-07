package mark123mark.mods.transcraft.Entitys.mob;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class NukeCreeper extends EntityCreeper {
	protected int fuseTime = 8;
	protected int timeSinceIgnited;
	protected int lastActiveTime;

	public float explosionRadius = 2f;

	public NukeCreeper(World world) {
		super(world);
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 1.0F, false));
		this.isImmuneToFire = true;
		this.experienceValue = 25;
		this.tasks.addTask(7, new EntityAIWander(this, 0.9D));
		
	}

	public void initCreature() {
		// if (this.rand.nextInt(100) == 0)
		this.dataWatcher.updateObject(17, Byte.valueOf((byte) 1));
	}

	
	
	@Override
	protected boolean isValidLightLevel()
	{
	    return true; //lets it spawn during the day
	}
	
	
	 /**
     * Called when a lightning bolt hits the entity.
     */
    @Override
	public void onStruckByLightning(EntityLightningBolt par1EntityLightningBolt)
    {
        if (!this.worldObj.isRemote)
        {
        	
        	EntityDragon EntityDragon = new EntityDragon(this.worldObj);
        	EntityDragon.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.worldObj.spawnEntityInWorld(EntityDragon);
            this.setDead();
        }
    }
	
	@Override
	protected void fall(float distance) {
		if (!this.worldObj.isRemote) {
			if (distance > 5) {
				boolean flag = this.worldObj.getGameRules()
						.getGameRuleBooleanValue("mobGriefing");

				if (this.getPowered()) {
					this.worldObj.createExplosion(this, this.posX, this.posY,
							this.posZ, 20f, flag);
				} else {
					this.worldObj.createExplosion(this, this.posX, this.posY,
							this.posZ, 3f, false);
				}

				this.setDead();
			} else
				super.fall(distance);
		}
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
		super.writeEntityToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setShort("Fuse", (short) this.fuseTime);
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
		super.readEntityFromNBT(par1NBTTagCompound);

		if (par1NBTTagCompound.hasKey("Fuse")) {
			this.fuseTime = par1NBTTagCompound.getShort("Fuse");
		}
	}

	@Override
	public void onUpdate() {
		if (this.isEntityAlive()) {
			this.lastActiveTime = this.timeSinceIgnited;
			int i = this.getCreeperState();

			if (i > 0 && this.timeSinceIgnited == 0) {
				this.playSound("random.fuse", 1.0F, 0.5F);
			}

			this.timeSinceIgnited += i;

			if (this.timeSinceIgnited < 0) {
				this.timeSinceIgnited = 0;
			}

			int difficulty = worldObj.difficultySetting;
			int lengthBoost = 4 * (3 - difficulty);
			int powered = this.getPowered() ? 12 : 0;

			for (i = 0; i < 2; ++i)
	        {
	            this.worldObj.spawnParticle("portal", this.posX + (this.rand.nextDouble() - 0.5D) * this.width, this.posY + this.rand.nextDouble() * this.height - 0.25D, this.posZ + (this.rand.nextDouble() - 0.5D) * this.width, (this.rand.nextDouble() - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 2.0D);
	        }
			
			
			if (this.timeSinceIgnited >= this.fuseTime + difficulty + powered) {
				this.timeSinceIgnited = this.fuseTime;

				if (!this.worldObj.isRemote) {
					boolean flag = this.worldObj.getGameRules()
							.getGameRuleBooleanValue("mobGriefing");

					if (powered > 0) {
						this.worldObj.createExplosion(this, this.posX,
								this.posY, this.posZ, 20f, flag);
					} else {
						this.worldObj.createExplosion(this, this.posX,
								this.posY, this.posZ, 3f, flag);
					}

					this.setDead();
				}
			}
		}

		super.onUpdate();
	}

	@Override
	public float getCreeperFlashIntensity(float par1) {
		return (this.lastActiveTime + (this.timeSinceIgnited - this.lastActiveTime)
				* par1)
				/ (this.fuseTime - 2);
	}

	@Override
	protected void dropFewItems(boolean par1, int par2) {
		int j = this.getDropItemId();

		if (j > 0) {
			int k = this.rand.nextInt(4) + 2;

			if (par2 > 0) {
				k += this.rand.nextInt(par2 + 1);
			}

			for (int l = 0; l < k; ++l) {
				this.dropItem(j, 1);
			}
		}

		if (this.getPowered()) {
			if (j > 0) {
				int k = this.rand.nextInt(40) + 20;

				if (par2 > 0) {
					k += this.rand.nextInt(par2 * 6 + 1);
				}

				for (int l = 0; l < k; ++l) {
					this.dropItem(j, 1);
				}
			}
		}
	}

	public boolean attackEntityFrom(DamageSource source, int damage) {
		if (source instanceof EntityDamageSource
				&& ((EntityDamageSource) source).getEntity() instanceof EntityIronGolem) {
			damage = 1000;
		}
		return super.attackEntityFrom(source, damage);
	}

	/**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
	protected int getDropItemId()
    {
        return Transcraft.DarkEndershard.itemID;
    }

    /**
     * Teleport the enderman to a random nearby position
     */
    protected boolean teleportRandomly()
    {
        double d0 = this.posX + (this.rand.nextDouble() - 0.5D) * 64.0D;
        double d1 = this.posY + (this.rand.nextInt(64) - 32);
        double d2 = this.posZ + (this.rand.nextDouble() - 0.5D) * 64.0D;
        return this.teleportTo(d0, d1, d2);
    }
    
    /**
     * Teleport the enderman
     */
    protected boolean teleportTo(double par1, double par3, double par5)
    {
        EnderTeleportEvent event = new EnderTeleportEvent(this, par1, par3, par5, 0);
        if (MinecraftForge.EVENT_BUS.post(event)){
            return false;
        }

        double d3 = this.posX;
        double d4 = this.posY;
        double d5 = this.posZ;
        this.posX = event.targetX;
        this.posY = event.targetY;
        this.posZ = event.targetZ;
        boolean flag = false;
        int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.posY);
        int k = MathHelper.floor_double(this.posZ);
        int l;

        if (this.worldObj.blockExists(i, j, k))
        {
            boolean flag1 = false;

            while (!flag1 && j > 0)
            {
                l = this.worldObj.getBlockId(i, j - 1, k);

                if (l != 0 && Block.blocksList[l].blockMaterial.blocksMovement())
                {
                    flag1 = true;
                }
                else
                {
                    --this.posY;
                    --j;
                }
            }

            if (flag1)
            {
                this.setPosition(this.posX, this.posY, this.posZ);

                if (this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox))
                {
                    flag = true;
                }
            }
        }

        if (!flag)
        {
            this.setPosition(d3, d4, d5);
            return false;
        }
        else
        {
            short short1 = 128;

            for (l = 0; l < short1; ++l)
            {
                double d6 = l / (short1 - 1.0D);
                float f = (this.rand.nextFloat() - 0.5F) * 0.2F;
                float f1 = (this.rand.nextFloat() - 0.5F) * 0.2F;
                float f2 = (this.rand.nextFloat() - 0.5F) * 0.2F;
                double d7 = d3 + (this.posX - d3) * d6 + (this.rand.nextDouble() - 0.5D) * this.width * 2.0D;
                double d8 = d4 + (this.posY - d4) * d6 + this.rand.nextDouble() * this.height;
                double d9 = d5 + (this.posZ - d5) * d6 + (this.rand.nextDouble() - 0.5D) * this.width * 2.0D;
                this.worldObj.spawnParticle("portal", d7, d8, d9, f, f1, f2);
            }

            this.worldObj.playSoundEffect(d3, d4, d5, "mob.endermen.portal", 1.0F, 1.0F);
            this.playSound("mob.endermen.portal", 1.0F, 1.0F);
            return true;
        }
    }
    
}
