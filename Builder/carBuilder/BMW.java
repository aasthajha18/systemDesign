package systemDesign.Builder.carBuilder;

public class BMW implements ICarBuilder {

    private Car car;

    public BMW() {
        this.car = new Car();
    }

    @Override
    public void buildColor() {
        car.setColor("BMW:: black");
    }

    @Override
    public void buildEngine() {
        car.setEngine("BMW::: Engine");
    }

    @Override
    public Car getCar() {
        return car;
    }

}
