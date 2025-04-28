package systemDesign.Builder.carBuilder;

public class GWagon implements ICarBuilder {

    private Car objCar;

    public GWagon() {
        this.objCar = new Car();
    }

    @Override
    public void buildColor() {
        objCar.setColor("Gwagon color :::white");
    }

    @Override
    public void buildEngine() {
        objCar.setEngine("G-Wagon Engine");
    }

    @Override
    public Car getCar() {
        return objCar;
    }

}
