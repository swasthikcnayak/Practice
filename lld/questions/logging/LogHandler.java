package Practice.lld.questions.logging;

public abstract class LogHandler {
    private LogHandler nextHandler;
    LogDestionation logDestionation;

    LogHandler(LogHandler nextHandler, LogDestionation logDestionation) {
        this.nextHandler = nextHandler;
        this.logDestionation = logDestionation;
    }

    public void log(LogLevel logLevel, String message, String timeString) {
        if (nextHandler != null) {
            nextHandler.log(logLevel, message, timeString);
        }
        throw new UnsupportedOperationException("Unimplemented method 'log'");
    }
}

class ErrorLogHandler extends LogHandler {

    ErrorLogHandler(LogHandler nextHandler, LogDestionation logDestionation) {
        super(nextHandler, logDestionation);
    }

    public void log(LogLevel logLevel, String message, String timeString) {
        if (logLevel.equals(LogLevel.ERROR)) {
            this.logDestionation.log(timeString + " : ERROR : " + message);
        }
        super.log(logLevel, message, timeString);
    }
}

class InfoLogHandler extends LogHandler {

    InfoLogHandler(LogHandler nextHandler, LogDestionation logDestionation) {
        super(nextHandler, logDestionation);
    }

    public void log(LogLevel logLevel, String message, String timeString) {
        if (logLevel.equals(LogLevel.INFO)) {
            this.logDestionation.log(timeString + " : INFO : " + message);
        }
        super.log(logLevel, message, timeString);
    }
}

class DebugLogHandler extends LogHandler {

    DebugLogHandler(LogHandler nextHandler, LogDestionation logDestionation) {
        super(nextHandler, logDestionation);
    }

    public void log(LogLevel logLevel, String message, String timeString) {
        if (logLevel.equals(LogLevel.DEBUG)) {
            this.logDestionation.log(timeString + " : DEBUG : " + message);
        }
        super.log(logLevel, message, timeString);
    }
}