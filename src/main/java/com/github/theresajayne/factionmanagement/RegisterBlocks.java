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
        FactionManagement.extensionBlock = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("extensionBlock").setCreativeTab(CreativeTabs.tabMisc).setBlockTextureName("factionmanagement:extensionBlock");
        FactionManagement.doubleExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("doubleExtension").setCreativeTab(CreativeTabs.tabMisc).setBlockTextureName("factionmanagement:doubleExtension");
        FactionManagement.tripleExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("tripleExtension").setCreativeTab(CreativeTabs.tabMisc).setBlockTextureName("factionmanagement:tripleExtension");
        FactionManagement.quadExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("quadExtension").setCreativeTab(CreativeTabs.tabMisc).setBlockTextureName("factionmanagement:quadExtension");
        FactionManagement.quinExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("quinExtension").setCreativeTab(CreativeTabs.tabMisc).setBlockTextureName("factionmanagement:quinExtension");
        FactionManagement.sexExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("sexExtension").setCreativeTab(CreativeTabs.tabMisc).setBlockTextureName("factionmanagement:sexExtension");
        FactionManagement.septExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("septExtension").setCreativeTab(CreativeTabs.tabMisc).setBlockTextureName("factionmanagement:septExtension");
        FactionManagement.octExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("octExtension").setCreativeTab(CreativeTabs.tabMisc).setBlockTextureName("factionmanagement:octExtension");
        FactionManagement.nonExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("nonExtension").setCreativeTab(CreativeTabs.tabMisc).setBlockTextureName("factionmanagement:nonExtension");
        FactionManagement.decaExtension = new GenericBlock(Material.rock).setHardness(50.0F).setStepSound(Block.soundTypeMetal).setBlockName("decaExtension").setCreativeTab(CreativeTabs.tabMisc).setBlockTextureName("factionmanagement:decaExtension");

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
