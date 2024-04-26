package Package_Vehicle;

public class VehiclePackage {
    public String name;
    public String color;
    public int wheel;
    String engine;
    String model;

    protected void GetModel() {
        System.out.println("Vehicle Package GetModel Called");
        System.out.println("Model" + this.model);
    }

    private void GetWheel() {
        System.out.println("Wheel" + this.wheel);
    }

    public void GetDetails() {
        System.out.println("Vehicle Package GetDetails Called");
    }
}
