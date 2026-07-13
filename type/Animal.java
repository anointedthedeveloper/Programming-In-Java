package type;

public class Animal{
    String diet = "unknown";
    int legs = 4;
    
    //protected access modifier
    protected boolean isAnimal(){
        if(legs > 0){
            return true;
        }else{
            return false;
        }
        
    }

    //private access modifier
    private void setDiet(){
        System.out.println("Diet: "+diet);
    }

    //public access modifier
    public void hasDiet(String animalDiet){
        diet = animalDiet;
        setDiet();
    }

    //package(default) access modifier
    String getDiet(){
        return diet;
    }

    public static void main(String[] args){
        Animal animal = new Animal();

        //testing public access
        System.out.println("===Provided Diet===");
        animal.hasDiet("herbivore");

        //testing private access
        System.out.println("===Set Diet===");
        animal.setDiet();

        //testing protected access
        System.out.println("===Checking if is an Animal===");
        if(animal.isAnimal()){
            System.out.println("Yes, this is an Animal");
        }

        //testing package access
        System.out.println("===Get Diet===");
        System.out.println("Diet: "+animal.getDiet());
    }
    
}
