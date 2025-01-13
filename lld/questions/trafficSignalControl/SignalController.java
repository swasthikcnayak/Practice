package Practice.lld.questions.trafficSignalControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignalController {
    List<Road> roads = new ArrayList<>();
    int currentRed;
    Map<Road,Timer> map = new HashMap<>();

    SignalController(List<Road> roads) {    
        this.roads = roads;
        currentRed = 0;
    }


    public void run(){
        Road road = roads.get(currentRed);
        Timer timer = new Timer(50);
        road.signal.setSignal(new Red(), timer);
        timer.start(this);
        map.put(road, timer);
    }

    public void update(Timer timer){
        // will be recived when the update happends to timer and handle the next logic
    }


    
}
