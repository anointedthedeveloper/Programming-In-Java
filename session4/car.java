// Class definition for Car-like object
class Car {
    // Method definition
    void start() {
        // Method body: prints to console
        System.out.println("Car has started");
    }
}

// Main class must match filename if it is public;
// here we make it non-public to allow Car to also exist in the same file
class car {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // Output: Car has started
    }
}