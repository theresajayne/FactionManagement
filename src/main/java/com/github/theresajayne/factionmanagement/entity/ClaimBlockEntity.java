package com.github.theresajayne.factionmanagement.entity;

import com.github.theresajayne.factionmanagement.FactionManagement;
import com.github.theresajayne.factionmanagement.blocks.ClaimBlock;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Theresa on 24/08/2014.
 */
public class ClaimBlockEntity extends TileEntity
{
    private final int cachedEntity;
    private int counter = 0;
    private int flipper = 0;
    private boolean flip = true;
    private final int RATE = 375; //will mean 64 blocks per day.
    private List<String> Allowed = new ArrayList<String>();
    private ItemStack[] inventory = new ItemStack[1];
    private int metadata;

    public ClaimBlockEntity() {
        this.cachedEntity = -1;
    }

    @SideOnly(Side.CLIENT)
    public ClaimBlockEntity(int p_i2350_1_)
    {
        this.cachedEntity = p_i2350_1_;
    }


    @Override
    public void updateEntity()
    {
        counter++;
        if(counter == RATE)
        {
            counter =0;
            super.updateEntity();
        }
        System.err.println("Updating Entity");
        flipper++;
        if(flipper%40==0) {
            flipper = 0;
            if(flip) {
                worldObj.getBlock(xCoord, yCoord, zCoord).setBlockTextureName("factionmanagement:claimBlock");
            } else
            {
                worldObj.getBlock(xCoord, yCoord, zCoord).setBlockTextureName("factionmanagement:extensionBlock");
            }
            flip = !flip;
        }

    }


 }
