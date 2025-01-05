
/*
 * 
 * The logger chain created will try to handle the log as per the log level, if not able to process the log
 * will be passed on to the nextLogger, will will do the same processing
 */
abstract class Logger {
    protected Logger nextLogger;

    Logger(Logger logger){
        this.nextLogger = logger;
    }

    public void log(String logLevel, String message){
        if(nextLogger != null)
            nextLogger.log(logLevel, message);
        System.out.prinln("Could not handle");
    }
}

class InfoLogger extends Logger {

    InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(String loglevel, String message){
        if(loglevel.equals("INFO"))
            System.out.println("INFO : " + message);
        else
            super.log(loglevel, message);
    }
}

class DebugLogger extends Logger {

    InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(String loglevel, String message){
        if(loglevel.equals("DEBUG"))
            System.out.println("DEBUG : " + message);
        else
            super.log(loglevel, message);
    }
}

class ErroLogger extends Logger {

    InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(String loglevel, String message){
        if(loglevel.equals("ERROR"))
            System.out.println("ERROR : " + message);
        else
            super.log(loglevel, message);
    }
}

public class Main{
    public static void main(String[] args) {
        Logger logger = new InfoLogger(new DebugLogger(new ErroLogger(null)));
        logger.log("ERROR", "Debug message");
    }
}


