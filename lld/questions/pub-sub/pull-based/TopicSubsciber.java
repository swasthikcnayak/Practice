
public class TopicSubsciber {
    int offset;
    Broker broker;

    TopicSubsciber(int offset) {
        this.offset = offset;
    }
    // can implement multithreading for parllele execution of mulitple subscribers

    public void run() {
        while (true) {
            Message message = broker.getMessage("topicName", offset);
            if (message != null) {
                offset++;
                // handle message;
            }
        }
    }
}