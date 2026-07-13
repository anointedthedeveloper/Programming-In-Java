package testAnimals;

import animals.CarnivorousAnimal;

public class Wolf{
        public static void main(String args[]) {
            // Create an instance of the animal type
            CarnivorousAnimal carnivorousAnimal = new CarnivorousAnimal();
        
            //access public variable
            System.out.println("Public Diet Type "+ carnivorousAnimal.carniDiet);
            //access private  variable
            //System.out.println("Private Digestive System "+ carnivorousAnimal.digestiveSystem);
            //access protected variable
            //System.out.println("Protected Teeth Type "+ carnivorousAnimal.animalTeethType);
            //access package variable
            //System.out.println("Package Jaw Type "+ carnivorousAnimal.animalJaw);
            
        }
}
