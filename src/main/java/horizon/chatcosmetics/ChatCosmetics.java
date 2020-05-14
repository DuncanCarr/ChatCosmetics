package horizon.chatcosmetics;

import com.yakovliam.yakocoreapi.YakoCoreAPI;
import horizon.chatcosmetics.commands.CosmeticCMD;
import horizon.chatcosmetics.configurations.CosmeticsConfig;
import horizon.chatcosmetics.events.ChatEvent;
import horizon.chatcosmetics.utilities.Cosmetic;
import horizon.chatcosmetics.utilities.CosmeticManager;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public final class ChatCosmetics extends JavaPlugin {

    private HashMap<UUID, Cosmetic> cosmetics;
    private ArrayList<ItemStack> colorItems;
    private static ChatCosmetics instance;
    public static boolean UPDATE;
    private UpdateChecker updateChecker;
    private CosmeticsConfig cosmeticsConfig;
    private CosmeticManager cosmeticManager;

    @Override
    public void onEnable() {
        instance = this;
        YakoCoreAPI.getInstance(this);

        getCommand("cosmetic").setExecutor(new CosmeticCMD());
        getServer().getPluginManager().registerEvents(new ChatEvent(), this);

        cosmeticsConfig = new CosmeticsConfig(this);
        cosmeticsConfig.readConfig();

        cosmetics = new HashMap<>();
        cosmeticManager = new CosmeticManager();
        colorItems = new ArrayList<>();
        initColorItems();
    }

    public static ChatCosmetics getInstance() {
        return instance;
    }

    private ItemStack createColorItem(String name, int decimal) {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(Color.fromRGB(decimal));
        meta.setDisplayName(colorize(name));
        item.setItemMeta(meta);
        return item;
    }

    private void initColorItems() {
        colorItems.add(createColorItem("&4Dark Red", 	11141120));
        colorItems.add(createColorItem("&cRed", 	16733525));
        colorItems.add(createColorItem("&6Gold", 	16755200));
        colorItems.add(createColorItem("&eYellow", 	16777045));
        colorItems.add(createColorItem("&2Dark Green", 	43520));
        colorItems.add(createColorItem("&aGreen", 	5635925));
        colorItems.add(createColorItem("&bAqua", 	5636095));
        colorItems.add(createColorItem("&3Dark Aqua", 	43690));
        colorItems.add(createColorItem("&1Dark Blue", 	170));
        colorItems.add(createColorItem("&9Blue", 	5592575));
        colorItems.add(createColorItem("&dLight Purple", 	16733695));
        colorItems.add(createColorItem("&5Dark Purple", 	11141290));
        colorItems.add(createColorItem("&fWhite", 	16777215));
        colorItems.add(createColorItem("&7Gray", 	11184810));
        colorItems.add(createColorItem("&8Dark Gray", 	5592405));
        colorItems.add(createColorItem("&0Black", 	0));
    }

    public String colorize(String input) {
        return ChatColor.translateAlternateColorCodes('&', input);
    }

    @Override
    public void onDisable() {

    }

    public HashMap<UUID, Cosmetic> getCosmetics() {
        return cosmetics;
    }

    public UpdateChecker getUpdateChecker() {
        return updateChecker;
    }

    public CosmeticsConfig getCosmeticsConfig() {
        return cosmeticsConfig;
    }

    public CosmeticManager getCosmeticManager() {
        return cosmeticManager;
    }

    public ArrayList<ItemStack> getColorItems() {
        return colorItems;
    }
}
