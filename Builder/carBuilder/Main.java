package systemDesign.Builder.carBuilder;

public class Main {
    public static void main(String[] args) {
        ICarBuilder builder = new GWagon();
        CarDirector direct = new CarDirector(builder);

        Car car = direct.constructCar();
        System.out.println(car);

        ICarBuilder bmwBuilder = new BMW();
        CarDirector bmwdirect = new CarDirector(bmwBuilder);
        Car bmw = bmwdirect.constructCar();
        System.out.println(bmw);

    }
}
