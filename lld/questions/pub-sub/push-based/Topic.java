import java.util.ArrayList;
import java.util.List;

interface Observable{
    public void addSubscriber(SubscriberI  s);
    public void removeSubscriber(SubscriberI s);
    public void notifySubscibers(Message message);
}

public class Topic implements Observable {
    List<Message> messages;
    List<SubscriberI> subscribers;

    String topicName;

    Topic(String topicName){
        this.topicName = topicName;
        messages = new ArrayList();
    }

    public void addSubscriber(SubscriberI subscriber){
        this.subscribers.add(subscriber);
    }

    public void removeSubscriber(SubscriberI subscriber){
        this.subscribers.remove(subscriber);
    }

    public void publish(Message message){
        this.messages.add(message);
        this.notifySubscibers(message);
    }

    public void notifySubscibers(Message message){
        this.subscribers.forEach((subscriber)->{
            subscriber.update(message);
        }
        );
    }

}
