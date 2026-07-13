package type;

public class Herbivore extends Animal{
    String foodSource = "plants";
    
    //protected access modifier
    protected boolean isHerbivore(){
        if(diet.equals("herbivore")){
            return true;
        }else{
            return false;
        }
    }

    //private access modifier
    private void setFoodSource(){
        System.out.println("Food Source: "+foodSource);
    }

    //public access modifier
    public void hasFoodSource(String source){
        foodSource = source;
        setFoodSource();
    }

    //package(default) access modifier
    String getFoodSource(){
        return foodSource;
    }

    public static void main(String[] args){
        Herbivore herbivore = new Herbivore();

        //testing public access
        System.out.println("===Provided Food Source===");
        herbivore.hasFoodSource("grass");

        //testing private access
        System.out.println("===Set Food Source===");
        herbivore.setFoodSource();

        //testing protected access
        System.out.println("===Checking if is a Herbivore===");
        if(herbivore.isHerbivore()){
            System.out.println("Yes, this is a Herbivore");
        }

        //testing package access
        System.out.println("===Get Food Source===");
        System.out.println("Food Source: "+herbivore.getFoodSource());
    }
    
}
