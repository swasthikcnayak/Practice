public class Producer {
    int id;
    Broker broker;


    public void publish(String topicName, Message message) {
        broker.publish(topicName, message);
    } 
}
