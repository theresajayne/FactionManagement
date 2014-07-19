package com.github.theresajayne.factionmanagement;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Theresa on 19/07/14.
 */
public class RegisterRecipes {

    public RegisterRecipes()
    {
        FactionManagement.claimBlockStack = new ItemStack(FactionManagement.claimBlock);
        FactionManagement.extensionBlockStack = new ItemStack(FactionManagement.extensionBlock);
        FactionManagement.doubleExtensionStack = new ItemStack(FactionManagement.doubleExtension);
        FactionManagement.tripleExtensionStack = new ItemStack(FactionManagement.tripleExtension);
        FactionManagement.quadExtensionStack = new ItemStack(FactionManagement.quadExtension);
        FactionManagement.quinExtensionStack = new ItemStack(FactionManagement.quinExtension);
        FactionManagement.sexExtensionStack = new ItemStack(FactionManagement.sexExtension);
        FactionManagement.septExtensionStack = new ItemStack(FactionManagement.septExtension);
        FactionManagement.octExtensionStack = new ItemStack(FactionManagement.octExtension);
        FactionManagement.nonExtensionStack = new ItemStack(FactionManagement.nonExtension);
        FactionManagement.decaExtensionStack = new ItemStack(FactionManagement.decaExtension);

        final ItemStack iron = new ItemStack(Items.iron_ingot);
        final ItemStack diamond = new ItemStack(Blocks.diamond_block);
        final ItemStack blocks = new ItemStack(Blocks.iron_block);
        GameRegistry.addRecipe(FactionManagement.claimBlockStack,"IDI"," I ","BBB",'I',iron,'D',diamond,'B',blocks);
        GameRegistry.addRecipe(FactionManagement.doubleExtensionStack,"EEE","EEE","EEE",'E',FactionManagement.extensionBlockStack);
        GameRegistry.addRecipe(FactionManagement.tripleExtensionStack,"EEE","EEE","EEE",'E',FactionManagement.doubleExtensionStack);
        GameRegistry.addRecipe(FactionManagement.quadExtensionStack,"EEE","EEE","EEE",'E',FactionManagement.tripleExtensionStack);
        GameRegistry.addRecipe(FactionManagement.quinExtensionStack,"EEE","EEE","EEE",'E',FactionManagement.quadExtensionStack);
        GameRegistry.addRecipe(FactionManagement.sexExtensionStack,"EEE","EEE","EEE",'E',FactionManagement.quinExtensionStack);
        GameRegistry.addRecipe(FactionManagement.septExtensionStack,"EEE","EEE","EEE",'E',FactionManagement.sexExtensionStack);
        GameRegistry.addRecipe(FactionManagement.octExtensionStack,"EEE","EEE","EEE",'E',FactionManagement.septExtensionStack);
        GameRegistry.addRecipe(FactionManagement.nonExtensionStack,"EEE","EEE","EEE",'E',FactionManagement.octExtensionStack);
        GameRegistry.addRecipe(FactionManagement.decaExtensionStack,"EEE","EEE","EEE",'E',FactionManagement.nonExtensionStack);
        //De compress recipes
        GameRegistry.addShapelessRecipe(new ItemStack(FactionManagement.nonExtension,9),FactionManagement.decaExtensionStack);
        GameRegistry.addShapelessRecipe(new ItemStack(FactionManagement.octExtension,9),FactionManagement.nonExtensionStack);
        GameRegistry.addShapelessRecipe(new ItemStack(FactionManagement.septExtension,9),FactionManagement.octExtensionStack);
        GameRegistry.addShapelessRecipe(new ItemStack(FactionManagement.sexExtension,9),FactionManagement.septExtensionStack);
        GameRegistry.addShapelessRecipe(new ItemStack(FactionManagement.quinExtension,9),FactionManagement.sexExtensionStack);
        GameRegistry.addShapelessRecipe(new ItemStack(FactionManagement.quadExtension,9),FactionManagement.quinExtensionStack);
        GameRegistry.addShapelessRecipe(new ItemStack(FactionManagement.tripleExtension,9),FactionManagement.quadExtensionStack);
        GameRegistry.addShapelessRecipe(new ItemStack(FactionManagement.doubleExtension,9),FactionManagement.tripleExtensionStack);
        GameRegistry.addShapelessRecipe(new ItemStack(FactionManagement.extensionBlock, 9), FactionManagement.doubleExtensionStack);

    }
}
