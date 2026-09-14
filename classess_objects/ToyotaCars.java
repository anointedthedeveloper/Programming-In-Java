package classess_objects;

public class ToyotaCars{
    /*class variable 
    *specifies the this class(ToyotaCars)
    */
   static String brand = "Toyota";
    /*Instance variable 
    *specifies instances of this class
    */
   String model;

   //constructor to create a new Toyota with the model ty
   public ToyotaCars(String modelType){
    this.model = modelType;
   }

   //run application 
   public static void main(String a[]){
    /**
     * create an instance of the ToyotaCars class 
     * is as example or a type of ToyotaCars
     */
    ToyotaCars newCar = new ToyotaCars("Camry");
    System.out.println("Brand: "+ ToyotaCars.brand);
    System.out.println("Brand: "+ newCar.model);
   }
}