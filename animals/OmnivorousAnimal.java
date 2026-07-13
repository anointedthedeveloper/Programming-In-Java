package animals;

public class OmnivorousAnimal {

    String omniDiet = "Plants and meat";
    String animalTeethType = "Incised and cusped";
    String animalStomach = "Monogastric";
    
    public void checkOmnivorousAnimal(String animal, String animalDiet) {
        if (animalDiet.equals(omniDiet)) {
            System.out.println(animal + " Is an Omnivorous Animal");
        } else {
            System.out.println(animal + " may not really be an Omnivore");
        }
    }
    
    public void checkOmnivoreComponents(String animal) {
        CarnivorousAnimal carni = new CarnivorousAnimal();
        HerbivorousAnimal herbi = new HerbivorousAnimal();
        
        System.out.println("Checking what makes a " + animal + " an omnivore:");
        carni.checkCarnivorousAnimal(animal, carni.carniDiet);
        herbi.checkHerbivorousAnimal(animal, herbi.HerbiDiet);
    }
    
    public static void main(String args[]) {
        OmnivorousAnimal omnivorousAnimal = new OmnivorousAnimal();

        String animal = "Bear";
        String animalDiet = "Plants and meat";
        
        omnivorousAnimal.checkOmnivorousAnimal(animal, animalDiet);
        
        System.out.println();
        omnivorousAnimal.checkOmnivoreComponents(animal);
    }
}
