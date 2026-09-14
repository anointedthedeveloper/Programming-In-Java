package classess_objects;
public class ToyotaCorolla {
    //run toyotacamry application
    public static void main(String[] a) {
        /**
         * create an instance of the toyotacar class
         * toyotacar which is an example pf a type of toyota
         */

        ToyotaCars toyotaCorrola = new ToyotaCars("Corolla");
        System.out.println("Brand: " + ToyotaCars.brand);
        System.out.println("Model: " + toyotaCorrola.model);
        ToyotaCars.brand = "ToyoBRAND";
        System.out.println("Brand: "+ ToyotaCars.brand);
    }
}