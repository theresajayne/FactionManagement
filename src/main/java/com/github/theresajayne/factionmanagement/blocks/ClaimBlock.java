package com.github.theresajayne.factionmanagement.blocks;

import com.github.theresajayne.factionmanagement.entity.ClaimBlockEntity;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * Created by Theresa on 24/08/2014.
 */
public class ClaimBlock extends BlockContainer {

    protected ClaimBlock(Material p_i45386_1_) {
        super(p_i45386_1_);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new ClaimBlockEntity();
    }
}
