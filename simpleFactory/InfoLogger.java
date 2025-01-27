public class InfoLogger implements ILogger {

    @Override
    public void log(String msg) {

        System.out.println("Inside Info Logger" + msg);

    }

}
