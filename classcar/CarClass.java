public class CarClass {
    //Declaring and initialising instance variables
    String name = "";
    int seats = 0;
    int wheels = 0;

    //Default Constructor 
    public Car() {}

    //Parameterized Constructor With 3 Arguments 
    public Car(String name, int carSeats, int carWheels) {
        seats = carSeats;
        wheels = carWheels;
    }

    //parameterised constructor with 3 arguments
    public Car (String name, int carSeats, int carWheels) {
        this.name = name;
        this.seats = carSeats;
        this.wheels = carWheels;
    }

    public static void main(String[] args) {
        //let's create cars
        Car aCar = new CarClass();
        System.out.println("aCar Name: " + aCar.name);
        System.out.println("aCar Seats: " + aCar.seats);
        System.out.println("aCar Wheels: " + aCar.wheels);

        Car toyota_tricycle = new car
    }
}