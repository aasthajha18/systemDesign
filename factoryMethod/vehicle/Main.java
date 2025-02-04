package systemDesign.factoryMethod.vehicle;

public class Main {
    public static void main(String[] args) {

        IVehicleFactory fourWheeler = new FourWheelerFactory();
        IVehicle fourV = fourWheeler.createVehicle();
        fourV.createVahan();

        IVehicleFactory twoWheeler = new TwoWheelerFactory();
        IVehicle twoV = twoWheeler.createVehicle();
        twoV.createVahan();
    }
}
