package session7;

class FourWheeler extends Vehicle {
    // Declare a field specific to child class
    private boolean powerSteer; // Variable to store steering information

    /**
     * Parameterized constructor to initialize values based on user input
     *
     * @param vID       a String variable storing vehicle ID
     * @param vName     a String variable storing vehicle name
     * @param numWheels an integer variable storing number of wheels
     * @param pSteer    a String variable storing steering information
     */
    public FourWheeler(String vId, String vName, int numWheels, boolean pSteer) {
        // Attributes inherited from parent class
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
        // Child class' own attribute
        powerSteer = pSteer;
    }

    /**
     * Displays vehicle details
     *
     * @return void
     */
    public void showDetails() {
        System.out.println("Vehicle no:" + vehicleNo);
        System.out.println("Vehicle Name:" + vehicleName);
        System.out.println("Number of Wheels:" + wheels);
        if (powerSteer == true)
            System.out.println("Power Steering:Yes");
        else
            System.out.println("Power Steering:No");
    }
}

/**
 * Define TestVehicle class
 */
public class TestVehicle {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an object of child class and specify the values
        FourWheeler objFour = new FourWheeler("LA-09 CS-1406", "Volkswagen", 4,
                true);
        objFour.showDetails(); // Invoke child class method
        objFour.accelerate(200); // Invoke inherited method
    }
}