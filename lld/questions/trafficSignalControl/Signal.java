package Practice.lld.questions.trafficSignalControl;

public class Signal {
    SignalColor currentColor;
    Timer timer;

    Signal(SignalColor currentColor, Timer timer) {
        this.currentColor = currentColor;
        this.timer = timer;
    }

    public void setSignal(SignalColor color, Timer timer) {
        this.currentColor = color;
        this.timer = timer;
    }   
}
