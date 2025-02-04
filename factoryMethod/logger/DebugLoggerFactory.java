package systemDesign.factoryMethod.logger;

public class DebugLoggerFactory implements ILoggerFactory {

    @Override
    public ILogger createLoggerFactory() {
        return new DebugLogger();
    }

}
