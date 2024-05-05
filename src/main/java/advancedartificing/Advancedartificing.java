package advancedartificing;


import advancedartificing.items.ModItemGroup;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Advancedartificing implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("advanced-artificing");

	public static final Item CUSTOM_ITEM =
			Registry.register(Registry.ITEM, new Identifier("tutorial", "custom_item"),
					new Item(new Item.Settings()));
	public static final String MOD_ID = "advanced-artificing";

	@Override
	public void onInitialize() {
		
		
		//Register ItemGroups
		Registry.register(Registry.ITEM, new Identifier(Advancedartificing.MOD_ID, "testitem"), new Item(new FabricItemSettings().group(ModItemGroup.MAIN_GROUP)));
		
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}