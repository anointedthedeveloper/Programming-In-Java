package type;

class AnimalTest{
    public static void main(String[] args){
        Herbivore herbivore = new Herbivore();
        Omnivore omnivore = new Omnivore();
        Carnivore carnivore = new Carnivore();

        //testing Herbivore
        System.out.println("===Testing Herbivore===");
        herbivore.hasDiet("herbivore");
        herbivore.hasFoodSource("grass");
        if(herbivore.isHerbivore()){
            System.out.println("Yes, this is a Herbivore");
        }
        System.out.println("Food Source: "+herbivore.getFoodSource());
        System.out.println();

        //testing Omnivore
        System.out.println("===Testing Omnivore===");
        omnivore.hasDiet("omnivore");
        omnivore.hasFoodSource("plants and meat");
        if(omnivore.isOmnivore()){
            System.out.println("Yes, this is an Omnivore");
        }
        System.out.println("Food Source: "+omnivore.getFoodSource());
        System.out.println();

        //testing Carnivore
        System.out.println("===Testing Carnivore===");
        carnivore.hasDiet("carnivore");
        carnivore.hasFoodSource("meat");
        if(carnivore.isCarnivore()){
            System.out.println("Yes, this is a Carnivore");
        }
        System.out.println("Food Source: "+carnivore.getFoodSource());
        
    }
}
