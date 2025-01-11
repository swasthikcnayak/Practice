package Practice.lld.questions.logging;

public class Logger {
    
    LogHandler logHandler;

    Logger(LogDestionationType destionationType){
        LogDestionationFactory logDestionationFactory = new LogDestionationFactory();
        LogDestionation logDestionation = logDestionationFactory.getLogDestionation(destionationType);
        logHandler = new ErrorLogHandler(new InfoLogHandler(new ErrorLogHandler(null, logDestionation), logDestionation), logDestionation);
    }

    public void log(LogLevel logLevel, String message, String timestamp) {
        logHandler.log(logLevel, message, timestamp);
    }
}
