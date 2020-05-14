package horizon.chatcosmetics.commands;

import horizon.chatcosmetics.ChatCosmetics;
import horizon.chatcosmetics.gui.MainGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CosmeticCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(ChatCosmetics.getInstance().colorize("&cImproper usage. /cosmetics <player>"));
            return true;
        }

        if (args.length == 1) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatCosmetics.getInstance().colorize("&cYou must be a player to use this command! Console must use the command line."));
                return true;
            }
            Player p = (Player) sender;
            Player target = ChatCosmetics.getInstance().getServer().getPlayer(args[0]);
            if (target == null) {
                sender.sendMessage(ChatCosmetics.getInstance().colorize("&cPlayer not found."));
            } else {
                new MainGUI(target).open(p);
            }
        }
        return true;
    }
}
