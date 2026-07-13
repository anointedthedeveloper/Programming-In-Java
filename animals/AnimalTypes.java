package animals;

public class AnimalTypes{
    //create the instance variables
    String carnivoreDiet = "meat";
    String herbivoreDiet = "grass";
    String omnivoreDiet = "grass and meat";

    //method to check animal type
    public void checkAnimalType(String animal, String animalDiet) {
        if(animalDiet == carnivoreDiet){
            System.out.println(animal + " is a Carnivorous Animal");}
            else if (animalDiet == herbivoreDiet){
            System.out.println(animal + " is a Herbivorous Animal");}
            else if(animalDiet == omnivoreDiet){
            System.out.println(animal + " is a Omnivorous Animal");}
            else {
                System.out.println(animal + "may not really be an Animal");
            }
        }
        public static void main(String args[]){
            //create an instance of the AnimalTypes class to use it 
            AnimalTypes animalType = new AnimalTypes ();

            String animal = "Cow";
            String animalDiet = "grass";
            animalType.checkAnimalType(animal, animalDiet);

            //checking for carnivore
            animalType.checkAnimalType("Lion", "meat");

            //checking for omnivore
            animalType.checkAnimalType("Pig", "grass and meat");
        }
    }
 