package systemDesign.factoryMethod.vehicle;

public class TwoWheelerFactory implements IVehicleFactory {

    @Override
    public IVehicle createVehicle() {
        return new TwoWheeler();
    }

}
