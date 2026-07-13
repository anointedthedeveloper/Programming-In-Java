package animals;

public class CarnivorousAnimal {
    // Instance variables
    public String carniDiet = "Meat and flesh";
    private String digestiveSystem = "Complex";
    protected String animalTeethType = "Sharp and strong";
    String animalJaw = "Strong";

    // Method to check animal type
    public void checkCarnivorousAnimal(String animal, String animalDiet) {
        
        if (animalDiet.equals(carniDiet)) {
            System.out.println(animal + " Is a Carnivorous Animal");
        } else { 
            System.out.println(animal + " may not really be a Carnivore");
        }
    }

    public static void main(String args[]) {
        // Create an instance of the animal type
        CarnivorousAnimal carnivorousAnimal = new CarnivorousAnimal();
        
        String animal = "Lion";
        String animalDiet = "Meat and flesh";
        
        // Call the method using the object instance
        carnivorousAnimal.checkCarnivorousAnimal(animal, animalDiet);
    }
}
