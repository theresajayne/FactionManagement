package com.github.theresajayne.factionmanagement;

import com.github.theresajayne.factionmanagement.blocks.GenericBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Register all the blocks and items here.
 * Created by Theresa on 19/07/14.
 */
public class RegisterBlocks {

    /**
     * Default constructor does all the registration and setting of names etc.
     */
    public RegisterBlocks()
    {
        FactionManagement.claimBlock = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("claimBlock").setCreativeTab(CreativeTabs.tabMisc).setBlockTextureName("factionmanagement:claimBlock");
        FactionManagement.extensionBlock = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("extensionBlock").setCreativeTab(CreativeTabs.tabMisc);
        FactionManagement.doubleExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("doubleExtension").setCreativeTab(CreativeTabs.tabMisc);
        FactionManagement.tripleExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("tripleExtension").setCreativeTab(CreativeTabs.tabMisc);
        FactionManagement.quadExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("quadExtension").setCreativeTab(CreativeTabs.tabMisc);
        FactionManagement.quinExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("quinExtension").setCreativeTab(CreativeTabs.tabMisc);
        FactionManagement.sexExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("sexExtension").setCreativeTab(CreativeTabs.tabMisc);
        FactionManagement.septExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("septExtension").setCreativeTab(CreativeTabs.tabMisc);
        FactionManagement.octExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("octExtension").setCreativeTab(CreativeTabs.tabMisc);
        FactionManagement.nonExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("nonExtension").setCreativeTab(CreativeTabs.tabMisc);
        FactionManagement.decaExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("decaExtension").setCreativeTab(CreativeTabs.tabMisc);

        GameRegistry.registerBlock(FactionManagement.claimBlock,"claimBlock");
        GameRegistry.registerBlock(FactionManagement.extensionBlock,"extensionBlock");
        GameRegistry.registerBlock(FactionManagement.doubleExtension,"doubleExtension");
        GameRegistry.registerBlock(FactionManagement.tripleExtension,"tripleExtension");
        GameRegistry.registerBlock(FactionManagement.quadExtension,"quadExtension");
        GameRegistry.registerBlock(FactionManagement.quinExtension,"quinExtension");
        GameRegistry.registerBlock(FactionManagement.sexExtension,"sexExtension");
        GameRegistry.registerBlock(FactionManagement.septExtension,"septExtension");
        GameRegistry.registerBlock(FactionManagement.octExtension,"octExtension");
        GameRegistry.registerBlock(FactionManagement.nonExtension,"nonExtension");
        GameRegistry.registerBlock(FactionManagement.decaExtension,"decaExtension");


    }
}
