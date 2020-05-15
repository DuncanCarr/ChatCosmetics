package horizon.chatcosmetics.gui;

import com.yakovliam.yakocoreapi.gui.DynGui;
import horizon.chatcosmetics.ChatCosmetics;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class NameGUI extends DynGui {

    public NameGUI(Player player) {
        super("Edit Name Formatting > " + player.getName(), 3);

        ItemStack color = new ItemStack(Material.RED_BANNER, 1);
        ItemMeta colorMeta = color.getItemMeta();
        colorMeta.setDisplayName(ChatCosmetics.getInstance().colorize("&b&lChange color..."));
        color.setItemMeta(colorMeta);

        ItemStack style = new ItemStack(Material.WRITABLE_BOOK, 1);
        ItemMeta styleMeta = style.getItemMeta();
        styleMeta.setDisplayName(ChatCosmetics.getInstance().colorize("&b&lChange style... &7(&cCOMING SOON&7)"));
        style.setItemMeta(styleMeta);

        setItemInteraction(14, color, (p, e) -> {
            new ColorGUI("Name", player).open(p);
        });

        setItem(16, style);

        ItemStack back = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
        SkullMeta backMeta = (SkullMeta) back.getItemMeta();
        backMeta.setOwner("MHF_ArrowLeft");
        backMeta.setDisplayName(ChatCosmetics.getInstance().colorize("&c&lGo Back..."));
        back.setItemMeta(backMeta);

        setItemInteraction(22, back, (p, e) -> {
            new MainGUI(player).open(p);
        });
    }
}
