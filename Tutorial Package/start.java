import Package_Car.CarPackage;
import Package_Vehicle.VehiclePackage;

public class start {
    public static void main(String[] args) {
        System.out.println("Main");

        VehiclePackage vehicle1 = new VehiclePackage();
        CarPackage car1 = new CarPackage(4);

        car1.GetModel();

        vehicle1.GetDetails();
    }
}
