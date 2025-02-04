package systemDesign.factoryMethod.logger;

public class InfoLoggerFactory implements ILoggerFactory {

    @Override
    public ILogger createLoggerFactory() {
        return new InfoLogger();
    }
}
