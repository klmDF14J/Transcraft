package mark123mark.mods.transcraft.Entitys.mob;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.world.World;

public class NukeCreeper extends EntityCreeper {
	protected int fuseTime = 12;
	protected int timeSinceIgnited;
	protected int lastActiveTime;

	public float explosionRadius = 3f;

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
	protected boolean isValidLightLevel() {
		return true; // lets it spawn during the day
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

			for (i = 0; i < 2; ++i) {
				this.worldObj.spawnParticle("portal",
						this.posX + (this.rand.nextDouble() - 0.5D)
								* this.width,
						this.posY + this.rand.nextDouble() * this.height
								- 0.25D, this.posZ
								+ (this.rand.nextDouble() - 0.5D) * this.width,
						(this.rand.nextDouble() - 0.5D) * 2.0D,
						-this.rand.nextDouble(),
						(this.rand.nextDouble() - 0.5D) * 2.0D);
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
	protected int getDropItemId() {
		return Transcraft.DarkEndershard.itemID;
	}

}
