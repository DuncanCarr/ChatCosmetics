package horizon.chatcosmetics.gui;

import com.yakovliam.yakocoreapi.gui.DynGui;
import horizon.chatcosmetics.ChatCosmetics;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class ColorGUI extends DynGui {

    public ColorGUI(String type, Player player) {
        super("Edit " + type + " Color >" + player.getName(), 3);

        if (type.equalsIgnoreCase("chat")) {
            for (ItemStack colorItem : ChatCosmetics.getInstance().getColorItems()) {
                addItemInteraction(colorItem, (p, e) -> {
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&4Dark Red"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&4");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&cRed"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&c");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&6Gold"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&6");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&eYellow"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&e");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&2Dark Green"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&2");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&aGreen"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&a");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&bAqua"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&b");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&3Dark Aqua"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&3");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&1Dark Blue"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&1");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&9Blue"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&9");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&dLight Purple"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&d");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&5Dark Purple"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&5");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&fWhite"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&f");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&7Gray"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&7");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&8Dark Gray"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&8");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&0Black"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setChatColor(player, "&0");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &achat color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                });
            }
        }
        if (type.equalsIgnoreCase("name")) {
            for (ItemStack colorItem : ChatCosmetics.getInstance().getColorItems()) {
                addItemInteraction(colorItem, (p, e) -> {
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&4Dark Red"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&4");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&cRed"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&c");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&6Gold"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&6");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&eYellow"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&e");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&2Dark Green"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&2");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&aGreen"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&a");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&bAqua"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&b");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&3Dark Aqua"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&3");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&1Dark Blue"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&1");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&9Blue"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&9");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&dLight Purple"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&d");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&5Dark Purple"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&5");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&fWhite"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&f");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&7Gray"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&7");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&8Dark Gray"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&8");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                    if (colorItem.getItemMeta().getDisplayName().equals(ChatCosmetics.getInstance().colorize("&0Black"))) {
                        ChatCosmetics.getInstance().getCosmeticManager().setNameColor(player, "&0");
                        p.sendMessage(ChatCosmetics.getInstance().colorize("&a(!) Successfully set &f" + player.getName() + "'s &aname color to: " + colorItem.getItemMeta().getDisplayName()));
                    }
                });
            }
        }

        ItemStack back = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
        SkullMeta backMeta = (SkullMeta) back.getItemMeta();
        backMeta.setOwner("MHF_ArrowLeft");
        backMeta.setDisplayName(ChatCosmetics.getInstance().colorize("&c&lGo Back..."));
        back.setItemMeta(backMeta);

        if (type.equalsIgnoreCase("name")) {
            setItemInteraction(22, back, (p, e) -> {
                new NameGUI(player).open(p);
            });
        }
        if (type.equalsIgnoreCase("chat")) {
            setItemInteraction(22, back, (p, e) -> {
                new ChatGUI(player).open(p);
            });
        }
    }
}
