package com.github.theresajayne.factionmanagement;

import com.github.theresajayne.factionmanagement.entity.ClaimBlockEntity;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 *
 * Created by Theresa on 24/08/2014.
 */
public class RegisterEntities
{
    public RegisterEntities()
    {
        GameRegistry.registerTileEntity(ClaimBlockEntity.class,"TE_claimBlock");
    }
}
