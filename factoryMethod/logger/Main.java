package systemDesign.factoryMethod.logger;

public class Main {
    public static void main(String[] args) {

        ILoggerFactory debuLoggerFactory = new DebugLoggerFactory();
        ILogger debugLogger = debuLoggerFactory.createLoggerFactory();
        debugLogger.log("hii, this is the message");

        ILoggerFactory infoLoggerFactory = new InfoLoggerFactory();
        ILogger infoLogger = infoLoggerFactory.createLoggerFactory();
        infoLogger.log("Hii....!!");
    }
}
