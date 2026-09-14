package classess_objects;
public class Hilux {
    //run toyotacamry application
    public static void main(String[] a) {
        /**
         * create an instance of the toyotacar class
         * toyotacar which is an example pf a type of toyota
         */

        ToyotaCars toyotaCorrola = new ToyotaCars("Hilux");
        System.out.println("Brand: " + ToyotaCars.brand);
        System.out.println("Model: " + toyotaCorrola.model);
    }
}