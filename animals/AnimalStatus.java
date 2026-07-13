package animals;

public class AnimalStatus {

    String animalStatus = "Not dangerous to humans";

    public void checkAnimalStatus(String animal, String status) {
        if (status.equals(animalStatus)) {
            System.out.println(animal + " is not dangerous to humans");
        } else {
            System.out.println(animal + " status: " + status);
        }
    }

    public static void main(String args[]) {
        AnimalStatus statusChecker = new AnimalStatus();

        String animal = "Goat";
        String statusInput = "Not dangerous to humans";

        // Call the method using the unique object name
        statusChecker.checkAnimalStatus(animal, statusInput);

        // Call the method for other animals using the unique object name
        statusChecker.checkAnimalStatus("lion", "Dangerous to humans");

        statusChecker.checkAnimalStatus("Pig", "Can be dangerous to humans if not handled cautiously");
    }
}
