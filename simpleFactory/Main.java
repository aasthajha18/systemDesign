public class Main {
    public static void main(String[] args) {

        ILogger debugLogger = LoggerFactory.createLogger(LogType.DEBUG);
        debugLogger.log("aastha::::------::::");
        ILogger infoLogger = LoggerFactory.createLogger(LogType.INFO);
        infoLogger.log("aastha--------------");
    }
}
