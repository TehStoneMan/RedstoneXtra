package io.github.tehstoneman.redstonepp.common.block;

import io.github.tehstoneman.redstonepp.ModInfo;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RedstonePPBlocks
{
	public static final DeferredRegister< Block >		REGISTERY	= new DeferredRegister<>( ForgeRegistries.BLOCKS, ModInfo.MOD_ID );

	public static RegistryObject< RedstoneInverterBlock > REDSTONE_INVERTER = REGISTERY.register( "redstone_inverter", () -> new RedstoneInverterBlock() );
}
