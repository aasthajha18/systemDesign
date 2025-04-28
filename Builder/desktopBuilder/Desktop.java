package systemDesign.Builder.desktopBuilder;

public class Desktop {
    String monitor;
    String processor;

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setProccessor(String proccessor) {
        this.processor = proccessor;
    }

    public String toString() {
        return "Monitor :: " + monitor + "Proccessor :: " + processor;
    }
}
