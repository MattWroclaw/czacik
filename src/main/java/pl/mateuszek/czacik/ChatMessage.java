package pl.mateuszek.czacik;

public class ChatMessage {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ChatMessage() {
    }

    public ChatMessage(String value) {
        this.value = value;
    }
}
