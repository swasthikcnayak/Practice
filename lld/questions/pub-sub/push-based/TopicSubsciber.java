

interface SubscriberI {
    public void update(Message message);
}

public class TopicSubsciber implements SubscriberI {

    @Override
    public void update(Message message) {
        System.out.println(message);
    }
    
}