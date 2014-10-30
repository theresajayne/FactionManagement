package com.github.theresajayne.factionmanagement;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.MinecraftForge;

/**
 * Base Mod Class
 * Faction Management Mod
 * Control your faction with blocks and expand your claim with
 * extension blocks.
 * Created by Theresa on 19/07/14.
 */
@Mod(modid = "factionmanagement", name = "FactionManagement", version = "0.0.1")
public class FactionManagement
{
    /**
     * Blocks are Stored here to reduce overhead on the rest of the pack
     */
    public static Block claimBlock;
    public static Block extensionBlock;
    public static Block doubleExtension;
    public static Block tripleExtension;
    public static Block quadExtension;
    public static Block quinExtension;
    public static Block sexExtension;
    public static Block septExtension;
    public static Block octExtension;
    public static Block nonExtension;
    public static Block decaExtension;
    public static Item claimDetector;

    /**
     * ItemStacks for Recipes are here
     */
    public static ItemStack claimBlockStack;
    public static ItemStack extensionBlockStack;
    public static ItemStack doubleExtensionStack;
    public static ItemStack tripleExtensionStack;
    public static ItemStack quadExtensionStack;
    public static ItemStack quinExtensionStack;
    public static ItemStack sexExtensionStack;
    public static ItemStack septExtensionStack;
    public static ItemStack octExtensionStack;
    public static ItemStack nonExtensionStack;
    public static ItemStack decaExtensionStack;
    public static ItemStack detectorStack;

    /**
     * Entity Tile Definitions
     */
    public static TileEntity claimBlockEntity;
    public static TileEntity extensionEntity;


    @Mod.Instance(value = "factionmanagement")
    public static FactionManagement instance;

    @SidedProxy(clientSide = "com.github.theresajayne.factionmanagement.client.ClientProxy", serverSide = "com.github.theresajayne.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new InventoryDetectionTickHandler());
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event)
    {
        RegisterBlocks registerBlocks = new RegisterBlocks();
        RegisterEntities registerEntities = new RegisterEntities();
        RegisterRecipes registerRecipes = new RegisterRecipes();
        proxy.registerRenderers();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
