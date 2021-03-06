package horizon.chatcosmetics.gui;

import com.yakovliam.yakocoreapi.gui.DynGui;
import horizon.chatcosmetics.ChatCosmetics;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

public class MainGUI extends DynGui {

    public MainGUI(Player player) {
        super("Edit Cosmetic > " + player.getName(), 3);

        ItemStack playerSkull = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
        SkullMeta playerMeta = (SkullMeta) playerSkull.getItemMeta();
        playerMeta.setOwner(player.getName());
        playerMeta.setDisplayName(ChatCosmetics.getInstance().colorize("&b&l" + player.getName()));
        ArrayList<String> playerLore = new ArrayList<>();
        playerLore.add(ChatCosmetics.getInstance().colorize(""));
        playerLore.add(ChatCosmetics.getInstance().colorize("&fName Color: " + ChatCosmetics.getInstance().getCosmeticManager().getNameColor(player)));
        playerLore.add(ChatCosmetics.getInstance().colorize("&fChat Color: " + ChatCosmetics.getInstance().getCosmeticManager().getChatColor(player)));
        playerMeta.setLore(playerLore);
        playerSkull.setItemMeta(playerMeta);

        ItemStack nameColor = new ItemStack(Material.NAME_TAG, 1);
        ItemMeta nameMeta = nameColor.getItemMeta();
        nameMeta.setDisplayName(ChatCosmetics.getInstance().colorize("&e&lChange name color..."));
        ArrayList<String> nameLore = new ArrayList<>();
        nameLore.add(ChatCosmetics.getInstance().colorize("&7Change " + player.getName() + "'s name formatting..."));
        nameMeta.setLore(nameLore);
        nameColor.setItemMeta(nameMeta);

        ItemStack chatColor = new ItemStack(Material.PAPER, 1);
        ItemMeta chatMeta = chatColor.getItemMeta();
        chatMeta.setDisplayName(ChatCosmetics.getInstance().colorize("&e&lChange chat color..."));
        ArrayList<String> chatLore = new ArrayList<>();
        chatLore.add(ChatCosmetics.getInstance().colorize("&7Change " + player.getName() + "'s chat formatting..."));
        chatMeta.setLore(chatLore);
        chatColor.setItemMeta(chatMeta);

        setItem(13, playerSkull);

        setItemInteraction(11, nameColor, (p, e) -> {
            new NameGUI(player).open(p);
        });

        setItemInteraction(15, chatColor, (p, e) -> {
            new ChatGUI(player).open(p);
        });
    }

}
