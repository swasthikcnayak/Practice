import java.util.HashMap;
import java.util.Map;

public class Broker {
    Map<String, Topic> topics = new HashMap();

    public void createTopic(String topicName){
        this.topics.put(topicName, new Topic(topicName));
    }

    public void publish(String topicName, Message message){
        Topic topic = this.topics.get(topicName);
        topic.publish(message);
    }

    public void addsubscriber(String topicName, SubscriberI subscriber){
        Topic topic = this.topics.get(topicName);
        topic.addSubscriber(subscriber);
    }

    public void removesubscriber(String topicName, SubscriberI subscriber){
        Topic topic = this.topics.get(topicName);
        topic.removeSubscriber(subscriber);
    }
}
