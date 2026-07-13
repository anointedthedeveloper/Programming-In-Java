package testAnimals;

import animals.HerbivorousAnimal;

public class Cow extends HerbivorousAnimal{
        public static void main(String args[]) {
            // Create an instance of the animal type
            HerbivorousAnimal herbivorousAnimal = new HerbivorousAnimal();
            Cow Cow = new Cow();
            //access public variable
            System.out.println("Public Diet Type "+ herbivorousAnimal.herbiDiet);
            //access private  variable
            //System.out.println("Private Digestive System "+ herbivorousAnimal.digestiveSystem);
            //access protected variable
            // System.out.println("Protected Teeth Type "+ dairiCow.animalTeethType);
            //access package variable
            //System.out.println("Package Jaw Type "+ herbivorousAnimal.animalJaw);
            
        }
}
