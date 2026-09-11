package cars;

public class Car {

    String brand;
    int speed;

    // Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method
    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}