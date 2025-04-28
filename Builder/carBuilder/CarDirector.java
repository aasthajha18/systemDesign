package systemDesign.Builder.carBuilder;

public class CarDirector {

    private ICarBuilder builder;

    public CarDirector(ICarBuilder builder) {
        this.builder = builder;
    }

    public Car constructCar() {
        builder.buildColor();
        builder.buildEngine();

        return builder.getCar();
    }
}
