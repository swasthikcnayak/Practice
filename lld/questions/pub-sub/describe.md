This problem can have two variantions: 
    1. Pull based pub-sub
    2. Push based pub-sub

In pull based pub-sub the consumer is given some offset when it subscribes and it will have all the control of the messages
In push based pub-sub, uses the observer pattern where the broker keeps track of the subscribers for a topic, and the update method of the subscriber is called when a new message comes into the topic.

