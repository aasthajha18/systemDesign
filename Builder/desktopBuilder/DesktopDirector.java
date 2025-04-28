package systemDesign.Builder.desktopBuilder;

public class DesktopDirector {
    private DesktopBuilder desktopBuilder;

    public DesktopDirector(DesktopBuilder desktopBuilder) {
        this.desktopBuilder = desktopBuilder;
    }

    public Desktop constructDesktop() {

        desktopBuilder.buildMonitor();
        desktopBuilder.buildProccessor();

        return desktopBuilder.getDesktop();
    }
}
