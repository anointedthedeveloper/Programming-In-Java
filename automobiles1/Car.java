
1package automobiles;

class Car{
    public static void main(String[] args){
        Automobile automobile = new Automobile();

        //testing public access
        System.out.println("===Provided Number of Wheels===");
        automobile.hasWheels(4);

        //testing private access
        System.out.println("===Set Number of Wheels===");
        //automobile.setWheels();

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
