public class LoggerFactory {

    public static ILogger createLogger(LogType logger) {
        switch (logger) {
            case DEBUG:
                return new DebugLogger();

            default:
                break;
        }
        return null;
    }

}
