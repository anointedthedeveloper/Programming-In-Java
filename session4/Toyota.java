public class Toyota {
    //Toyota's Instance Variable
    String model;
    double length;
    double width;
    double height;
    String color;

    //No-Argument Constructor
   Toyota() {
        model = "Camry";
        length = 54.5;
        width = 160.58;
        height = 55.68;
   }

   Toyota(double width, double height, double length, String newcolor) {
        color = newcolor;
   }

   public static void main (String[] args) {
        //create new toyota Cars
        Toyota car1 = new Toyota(45, 145, 42, "Blue");

        //print Car Properties
        System.out.println("Car Model: " + car1.model);
        System.out.println("Car Color: " + car1.color);
    
    }

}
