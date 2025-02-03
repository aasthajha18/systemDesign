package systemDesign.factoryMethod;

public class InfoLoggerFactory implements ILoggerFactory {

    @Override
    public ILogger createLoggerFactory() {
        return new InfoLogger();
    }
}
