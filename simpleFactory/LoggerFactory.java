public class LoggerFactory {

    public static ILogger createLogger(LogType logger) {
        switch (logger) {
            case DEBUG:
                return new DebugLogger();
            case INFO:
                return new InfoLogger();
            default:
                break;
        }
        return null;
    }

}
