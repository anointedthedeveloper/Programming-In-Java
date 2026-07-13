package automobiles1;

public class Automobile{
    int wheels = 2;
    int seats = 4;
    
    //protected access modifier
    protected boolean isAutomobile(){
        if(wheels > 0){
            return true;
        }else{
            return false;
        }
        
    }

    //private access modifier
    private void setWheels(){
        System.out.println("Number of Wheels: "+wheels);
    }

    //public access modifier
    public void hasWheels(int numOfWheels){
        wheels = numOfWheels;
        setWheels();
    }

    //package(default) access modifier
    int getWheels(){
        return wheels;
    }

    public static void main(String[] args){
        Automobile automobile = new Automobile();

        //testing public access
        System.out.println("===Provided Number of Wheels===");
        automobile.hasWheels(4);

        //testing private access
        System.out.println("===Set Number of Wheels===");
        automobile.setWheels();

        //testing protected access
        System.out.println("===Checking if is an Automobile===");
        if(automobile.isAutomobile()){
            System.out.println("Yes, this is an Automobile");
        }

        //testing package access
        System.out.println("===Get Number of Wheels===");
        automobile.getWheels();
    }
    
}