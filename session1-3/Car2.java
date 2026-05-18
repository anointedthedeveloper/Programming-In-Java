public class Car2 {
    String door = "";
    String wheels = "";
    public void openCloseDoor (String action){
        door = action;
    }
    public static void main(String[] args) {
        Car2 obj = new Car2();
        obj.openCloseDoor("open");
        System.out.println(obj.door);
    }
}