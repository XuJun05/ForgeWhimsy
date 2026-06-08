package gay.xujun.forgewhimsy.item;

import gay.xujun.forgewhimsy.forgewhimsy.Tags;
import gay.xujun.forgewhimsy.item.armor.SakuraBoots;
import gay.xujun.forgewhimsy.item.armor.SakuraChestplate;
import gay.xujun.forgewhimsy.item.armor.SakuraHelmet;
import gay.xujun.forgewhimsy.item.armor.SakuraLeggings;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Tags.MOD_ID)
public class ItemRegistry {
    public static final Item SAKURA_HELMET = new SakuraHelmet("sakura_helmet");
    public static final Item SAKURA_CHESTPLATE = new SakuraChestplate("sakura_chestplate");
    public static final Item SAKURA_LEGGINGS = new SakuraLeggings("sakura_leggings");
    public static final Item SAKURA_BOOTS = new SakuraBoots("sakura_boots");
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                SAKURA_HELMET,
                SAKURA_CHESTPLATE,
                SAKURA_LEGGINGS,
                SAKURA_BOOTS
        );
    }
}
