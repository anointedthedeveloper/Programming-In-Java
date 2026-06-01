public class Rectangle {
    int width;
    int height;
    Rectangle() {
        System.out.println("Constructor Invoked...");
        width = 10;
        height = 10;
    }
    Rectangle(int wid, int heig) {
        System.out.println("Parameterized Constructor"); 
        width = wid;
        height = heig;
    }
    void displayDimensions() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.displayDimensions();
        System.out.println();
        Rectangle rect2 = new Rectangle(20, 30);
        rect2.displayDimensions();
    }
}
