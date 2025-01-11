package Practice.lld.questions.logging;

public class LogDestionationFactory {
    public LogDestionation getLogDestionation(LogDestionationType logDestionationType) {
        if(LogDestionationType.DATBASE.equals(logDestionationType)) {
            return new DbLogDestionation();
        }
        else if(LogDestionationType.CONSOLE.equals(logDestionationType)) {
            return new ConsoleLogDestionation();
        }
        else if(LogDestionationType.FILE.equals(logDestionationType)) {
            return new FileLogDestionation();
        }
        return null;
    }
}
