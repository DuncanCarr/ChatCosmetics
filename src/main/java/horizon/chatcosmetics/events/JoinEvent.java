package horizon.chatcosmetics.events;

import horizon.chatcosmetics.ChatCosmetics;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        if (ChatCosmetics.UPDATE) {
            if (event.getPlayer().hasPermission("chatcosmetics.update")) {
                event.getPlayer().sendMessage(ChatCosmetics.getInstance().colorize("&9ChatCosmetics > &aUpdate Available."));
                event.getPlayer().sendMessage(ChatCosmetics.getInstance().colorize("&7&n" + ChatCosmetics.getInstance().getUpdateChecker().getResourceUrl()));
            }
        }
    }
}
