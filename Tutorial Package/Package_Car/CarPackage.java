package Package_Car;
import Package_Vehicle.VehiclePackage;

public class CarPackage extends VehiclePackage {

    public CarPackage(int wheel){
        this.wheel = wheel;
    }

    public void GetModel(){
        System.out.println("Car GetModel Called");
        super.GetModel();
    }

    protected void GetWheel(){
        super.GetDetails();
        System.out.println("Car GetWheel Called");
        System.out.println("Wheel " + this.wheel);
    }

    public void GetDetails() {
        System.out.println("Car GetDetails Called");
    }
}
