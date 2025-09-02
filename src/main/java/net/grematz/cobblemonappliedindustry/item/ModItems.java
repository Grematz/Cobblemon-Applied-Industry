package net.grematz.cobblemonappliedindustry.item;

import net.grematz.cobblemonappliedindustry.CobblemonAppliedIndustry;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobblemonAppliedIndustry.MOD_ID);

    public static final DeferredItem<Item> IRON_BASE        = ITEMS.register("iron_base", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POKEBALL_LID     = ITEMS.register("pokeball_lid", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_BALL  = ITEMS.register("incomplete_ball", ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
