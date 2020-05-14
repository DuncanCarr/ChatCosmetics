package horizon.chatcosmetics.utilities;

public class Cosmetic {

    private String nameColor, chatColor;

    public Cosmetic(String nameColor, String chatColor) {
        this.nameColor = nameColor;
        this.chatColor = chatColor;
    }

    public String getChatColor() {
        return chatColor;
    }

    public String getNameColor() {
        return nameColor;
    }

}
