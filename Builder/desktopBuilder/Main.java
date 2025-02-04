package systemDesign.Builder.desktopBuilder;

public class Main {
    public static void main(String[] args) {

        DesktopBuilder hpBuilder = new HpDesktop();
        DesktopDirector hpDirector = new DesktopDirector(hpBuilder);
        Desktop hpDesktop = hpDirector.constructDesktop();
        System.out.println(hpDesktop);
    }
}
