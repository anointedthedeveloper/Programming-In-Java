package cars;

public class Toyota extends Car {

    // Constructor
    public Toyota(String brand, int speed) {
        super(brand, speed);
    }

    // Method overriding
    @Override
    public void drive() {
        System.out.println(brand + " is driving smoothly at " + speed + " km/h.");
    }

    // Main method
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota", 180);

        toyota.drive();
    }
}