package Practice.lld.questions.trafficSignalControl;

public abstract class SignalColor {
    String color;
}

class Green extends SignalColor {
    public Green() {
        color = "Green";
    }
}

class Red extends SignalColor {
    public Red() {
        color = "Red";
    }
}

class Yellow extends SignalColor {
    public Yellow() {
        color = "Yellow";
    }
}
