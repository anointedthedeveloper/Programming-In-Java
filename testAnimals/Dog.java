package testAnimals;

import animals.CarnivorousAnimal;

public class Dog extends CarnivorousAnimal{
        public static void main(String args[]) {
            // Create an instance of the animal type
            CarnivorousAnimal carnivorousAnimal = new CarnivorousAnimal();
            Dog germanDog = new Dog();
            //access public variable
            System.out.println("Public Diet Type "+ carnivorousAnimal.carniDiet);
            //access private  variable
            //System.out.println("Private Digestive System "+ carnivorousAnimal.digestiveSystem);
            //access protected variable
            System.out.println("Protected Teeth Type "+ germanDog.animalTeethType);
            //access package variable
            //System.out.println("Package Jaw Type "+ carnivorousAnimal.animalJaw);
            
        }
}
