import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<Message> messages;

    String topicName;

    Topic(String topicName) {
        this.topicName = topicName;
        messages = new ArrayList();
    }

    public void publish(Message message) {
        this.messages.add(message);
    }

    public Message getMessage(int offset) {
        if (offset < messages.size()) {
            return messages.get(offset);
        }
        return null;
    }

}
