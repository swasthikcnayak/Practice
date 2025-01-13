package Practice.lld.questions.trafficSignalControl;

public class Timer {
    int duration;
    public Timer(int duration) {
        this.duration = duration;
    }

    void start(SignalController signalContrller) {
        // update duration every one minute
        // when duration === 0
        signalContrller.update(this);
    }
}
