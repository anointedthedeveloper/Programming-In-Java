package animals;

public class HerbivorousAnimal {
    // Instance variables
    public String herbiDiet = "Plants and seeds";
    protected String animalTeethType = "Lophodont";
    String animalStomach = "Polygastric";
    
    // Method to check animal type
    public void checkHerbivorousAnimal(String animal, String animalDiet) {
        if (animalDiet.equals(herbiDiet)) {
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
