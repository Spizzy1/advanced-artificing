package advancedartificing.items;

import advancedartificing.Advancedartificing;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;



public class ModItemGroup {
    public static final ItemGroup MAIN_GROUP = FabricItemGroupBuilder.build(
            new Identifier(Advancedartificing.MOD_ID, "maingroup")
            , () -> new ItemStack(Items.REDSTONE));
}
