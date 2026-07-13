package animals;

public class HerbivorousAnimal {
    // Instance variables
    String HerbiDiet = "Plants and seeds";
    String animalTeethType = "Lophodont";
    String animalStomach = "Polygastric";
    
    // Method to check animal type
    public void checkHerbivorousAnimal(String animal, String animalDiet) {
        if (animalDiet.equals(HerbiDiet)) {
            System.out.println(animal + " Is a Herbivorous Animal");
        } else {
            System.out.println(animal + " may not really be an Herbivore");
        }
    }
    
    public static void main(String args[]) {
        // Create an instance of the animal type 
        HerbivorousAnimal herbivorousAnimal = new HerbivorousAnimal();

        String animal = "Cow";
        String animalDiet = "Plants and seeds"; 

        herbivorousAnimal.checkHerbivorousAnimal(animal, animalDiet);
    }
}
