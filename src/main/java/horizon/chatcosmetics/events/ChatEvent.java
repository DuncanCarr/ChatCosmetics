package horizon.chatcosmetics.events;

import horizon.chatcosmetics.ChatCosmetics;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        event.setFormat(ChatCosmetics.getInstance().colorize(ChatCosmetics.getInstance().getCosmeticsConfig().getConfig().getString("chat-format").replace("{NAME}", event.getPlayer().getDisplayName()).replace("{MESSAGE}", event.getMessage())));
        if (ChatCosmetics.getInstance().getCosmetics().containsKey(event.getPlayer().getUniqueId())) {
            event.setMessage(ChatCosmetics.getInstance().colorize(ChatCosmetics.getInstance().getCosmetics().get(event.getPlayer().getUniqueId()).getChatColor() + event.getMessage()));
            event.setFormat(ChatCosmetics.getInstance().colorize(ChatCosmetics.getInstance().getCosmeticsConfig().getConfig().getString("chat-format").replace("{NAME}", ChatCosmetics.getInstance().getCosmetics().get(event.getPlayer().getUniqueId()).getNameColor() + event.getPlayer().getDisplayName()).replace("{MESSAGE}", event.getMessage())));
        }
    }
}
