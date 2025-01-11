package Practice.lld.questions.logging;

public abstract class LogDestionation {
    public abstract void log(String message);
}

class DbLogDestionation extends LogDestionation {
    @Override
    public void log(String message) {
        System.out.println("Logging to database : " + message);
    }
}

class ConsoleLogDestionation extends LogDestionation {
    @Override
    public void log(String message) {
        System.out.println("Logging to console : " + message);
    }
}   


class FileLogDestionation extends LogDestionation {
    @Override
    public void log(String message) {
        System.out.println("Logging to file : " + message);
    }
}