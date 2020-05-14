package horizon.chatcosmetics.utilities;

import horizon.chatcosmetics.ChatCosmetics;
import org.bukkit.entity.Player;

public class CosmeticManager {

    private final ChatCosmetics plugin = ChatCosmetics.getInstance();

    public void setNameColor(Player player, String nameColor) {
        plugin.getCosmeticsConfig().set("users." + player.getUniqueId() + ".name-color", nameColor);
        if (plugin.getCosmetics().containsKey(player.getUniqueId())) {
            String chatColor = plugin.getCosmetics().get(player.getUniqueId()).getChatColor();
            plugin.getCosmetics().remove(player.getUniqueId());
            plugin.getCosmetics().put(player.getUniqueId(), new Cosmetic(nameColor, chatColor));
        } else {
            plugin.getCosmetics().put(player.getUniqueId(), new Cosmetic(nameColor, ""));
        }
    }

    public void setChatColor(Player player, String chatColor) {
        plugin.getCosmeticsConfig().set("users." + player.getUniqueId() + ".chat-color", chatColor);
        if (plugin.getCosmetics().containsKey(player.getUniqueId())) {
            String nameColor = plugin.getCosmetics().get(player.getUniqueId()).getNameColor();
            plugin.getCosmetics().remove(player.getUniqueId());
            plugin.getCosmetics().put(player.getUniqueId(), new Cosmetic(nameColor, chatColor));
        } else {
            plugin.getCosmetics().put(player.getUniqueId(), new Cosmetic("", chatColor));
        }
    }

    public void setCosmetic(Player player, Cosmetic cosmetic) {
        plugin.getCosmeticsConfig().set("users." + player.getUniqueId() + ".name-color", cosmetic.getNameColor());
        plugin.getCosmeticsConfig().set("users." + player.getUniqueId() + ".chat-color", cosmetic.getChatColor());

        plugin.getCosmetics().remove(player.getUniqueId());
        plugin.getCosmetics().put(player.getUniqueId(), cosmetic);
    }

    public String getNameColor(Player player) {
        if (plugin.getCosmetics().containsKey(player.getUniqueId())) {
            return plugin.getCosmetics().get(player.getUniqueId()).getNameColor() + "this";
        } else {
            return "&cnone";
        }
    }

    public String getChatColor(Player player) {
        if (plugin.getCosmetics().containsKey(player.getUniqueId())) {
            return plugin.getCosmetics().get(player.getUniqueId()).getChatColor() + "this";
        } else {
            return "&cnone";
        }
    }
}
