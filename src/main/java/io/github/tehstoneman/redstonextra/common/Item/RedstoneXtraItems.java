package io.github.tehstoneman.redstonextra.common.Item;

import io.github.tehstoneman.redstonextra.ModInfo;
import io.github.tehstoneman.redstonextra.RedstoneXtra;
import io.github.tehstoneman.redstonextra.common.block.RedstoneXtraBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RedstoneXtraItems
{
	public static final DeferredRegister< Item >	REGISTERY			= new DeferredRegister<>( ForgeRegistries.ITEMS, ModInfo.MOD_ID );

	public static RegistryObject< BlockItem >		AND_GATE			= REGISTERY.register( "and_gate",
			() -> new BlockItem( RedstoneXtraBlocks.AND_GATE.get(), new Item.Properties().group( RedstoneXtra.ITEM_GROUP ) ) );
	public static RegistryObject< BlockItem >		OR_GATE				= REGISTERY.register( "or_gate",
			() -> new BlockItem( RedstoneXtraBlocks.OR_GATE.get(), new Item.Properties().group( RedstoneXtra.ITEM_GROUP ) ) );
	public static RegistryObject< BlockItem >		XOR_GATE			= REGISTERY.register( "xor_gate",
			() -> new BlockItem( RedstoneXtraBlocks.XOR_GATE.get(), new Item.Properties().group( RedstoneXtra.ITEM_GROUP ) ) );

	public static RegistryObject< BlockItem >		REDSTONE_INVERTER	= REGISTERY.register( "inverter",
			() -> new BlockItem( RedstoneXtraBlocks.REDSTONE_INVERTER.get(), new Item.Properties().group( RedstoneXtra.ITEM_GROUP ) ) );

	public static RegistryObject< BlockItem >		NAND_GATE			= REGISTERY.register( "nand_gate",
			() -> new BlockItem( RedstoneXtraBlocks.NAND_GATE.get(), new Item.Properties().group( RedstoneXtra.ITEM_GROUP ) ) );
	public static RegistryObject< BlockItem >		NOR_GATE			= REGISTERY.register( "nor_gate",
			() -> new BlockItem( RedstoneXtraBlocks.NOR_GATE.get(), new Item.Properties().group( RedstoneXtra.ITEM_GROUP ) ) );
	public static RegistryObject< BlockItem >		XNOR_GATE			= REGISTERY.register( "xnor_gate",
			() -> new BlockItem( RedstoneXtraBlocks.XNOR_GATE.get(), new Item.Properties().group( RedstoneXtra.ITEM_GROUP ) ) );
}
