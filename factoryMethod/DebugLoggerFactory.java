package systemDesign.factoryMethod;

public class DebugLoggerFactory implements ILoggerFactory {

    @Override
    public ILogger createLoggerFactory() {
        return new DebugLogger();
    }

}
