package com.github.ohlsson96;

import com.github.ohlsson96.common.tutorialItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class tutorial implements ModInitializer {
	
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
		new Identifier("tutorial", "general"),
		() -> new ItemStack(tutorialItems.FABRIC_ITEM));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//loads the items for the mod
		tutorialItems.registerItems();
	}
}