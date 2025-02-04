package systemDesign.factoryMethod.vehicle;

public class FourWheelerFactory implements IVehicleFactory {

    @Override
    public IVehicle createVehicle() {
        return new FourWheeler();
    }

}
