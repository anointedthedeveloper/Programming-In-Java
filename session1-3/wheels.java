public class wheels {
    String wheels = "";
    public void wheels (String action){
        wheels = action;
    }
    public static void main(String[] args) {
        wheels obj = new wheels();
        obj.wheels("spinning");
        System.out.println(obj.wheels);
    }
}