package systemDesign.factoryMethod;

public class InfoLogger implements ILogger {
    public void log(String msg) {
        System.out.println("Inside Info Logger..." + msg);
    }
}
