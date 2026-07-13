package animals;

public class Lion {

    public static void main(String args[]) {
        // Create an instance of the animal type
        CarnivorousAnimal carnivorousAnimal = new CarnivorousAnimal();
        
        //access public variable
        System.out.println("Publlic Diet Type "+ carnivorousAnimal.carniDiet);
        //access private  variable
        //System.out.println("Private Digestive System "+ carnivorousAnimal.digestiveSystem);
        //access protected variable
        System.out.println("Protected Teeth Type "+ carnivorousAnimal.animalTeethType);
        //access protected variable
        System.out.println("Package Jaw Type "+ carnivorousAnimal.animalJaw);
        
    }
}
