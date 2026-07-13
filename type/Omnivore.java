package type;

public class Omnivore extends Animal{
    String foodSource = "both plants and animals";
    
    //protected access modifier
    protected boolean isOmnivore(){
        if(diet.equals("omnivore")){
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
        Omnivore omnivore = new Omnivore();

        //testing public access
        System.out.println("===Provided Food Source===");
        omnivore.hasFoodSource("plants and meat");

        //testing private access
        System.out.println("===Set Food Source===");
        omnivore.setFoodSource();

        //testing protected access
        System.out.println("===Checking if is an Omnivore===");
        if(omnivore.isOmnivore()){
            System.out.println("Yes, this is an Omnivore");
        }

        //testing package access
        System.out.println("===Get Food Source===");
        System.out.println("Food Source: "+omnivore.getFoodSource());
    }
    
}
