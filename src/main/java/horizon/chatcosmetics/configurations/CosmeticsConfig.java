package horizon.chatcosmetics.configurations;

import horizon.chatcosmetics.ChatCosmetics;
import horizon.chatcosmetics.utilities.Config;
import horizon.chatcosmetics.utilities.Cosmetic;

import java.util.UUID;

public class CosmeticsConfig extends Config {

    public CosmeticsConfig(ChatCosmetics plugin) {
        super(plugin, "cosmetics.yml");
    }

    public void readConfig() {
        if (ChatCosmetics.getInstance().getCosmeticsConfig().getConfig().contains("users")) {
            for (String uuid : ChatCosmetics.getInstance().getCosmeticsConfig().getConfig().getConfigurationSection("users").getKeys(false)) {
                Cosmetic cosmetic = new Cosmetic(ChatCosmetics.getInstance().getCosmeticsConfig().getConfig().getString("uuid.name-color"), ChatCosmetics.getInstance().getCosmeticsConfig().getConfig().getString("uuid.chat-color"));
                ChatCosmetics.getInstance().getCosmetics().put(UUID.fromString(uuid), cosmetic);
            }
        }
    }
}
