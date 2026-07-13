package type;

public class Carnivore extends Animal{
    String foodSource = "animals";
    
    //protected access modifier
    protected boolean isCarnivore(){
        if(diet.equals("carnivore")){
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
        Carnivore carnivore = new Carnivore();

        //testing public access
        System.out.println("===Provided Food Source===");
        carnivore.hasFoodSource("meat");

        //testing private access
        System.out.println("===Set Food Source===");
        carnivore.setFoodSource();

        //testing protected access
        System.out.println("===Checking if is a Carnivore===");
        if(carnivore.isCarnivore()){
            System.out.println("Yes, this is a Carnivore");
        }

        //testing package access
        System.out.println("===Get Food Source===");
        System.out.println("Food Source: "+carnivore.getFoodSource());
    }
    
}
