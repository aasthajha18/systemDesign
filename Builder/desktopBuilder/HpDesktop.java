package systemDesign.Builder.desktopBuilder;

public class HpDesktop implements DesktopBuilder {

    private Desktop desktop;

    public HpDesktop() {
        this.desktop = new Desktop();
    }

    @Override
    public void buildMonitor() {
        desktop.setMonitor("HP desktop");
    }

    @Override
    public void buildProccessor() {
        desktop.setProccessor("HP Proccessor");
    }

    @Override
    public Desktop getDesktop() {
        return desktop;
    }

}
