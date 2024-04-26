public class Vehicle {
    String name;
    String color;
    String engine;
    String wheel;
    String model;

    void GetModel(){
        System.out.println("Vehicle GetModel Called");
        System.out.println("Model" + this.model);
    }

    void GetWheel(){
        System.out.println("Wheel" + this.wheel);
    }
}
