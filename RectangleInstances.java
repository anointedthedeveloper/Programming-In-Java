public class rectangle {
 int width;
 int height;
 /**
 * A default constructor for Rectangle class
 */
 public rectangle () {
 System.out.println("Constructor Invoked...");
 width = 10;
 height = 10;
 }
 /**
 * A parameterized constructor with two parameters
 * @param wid will store the width of the rectangle
 * @param heig will store the height of the rectangle
 */
 public rectangle (int wid, int heig) {
 System.out.println("Parameterized Constructor"); 
width = wid;
 height = heig;
 }
 /**
 * This method displays the dimensions of the Rectangle object
 */
 public void displayDimensions(){
System.out.println("Width: " + width);
System.out.println("Width: " + height);
 }
} 

public class RectangleInstances {
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 // Declare and initialize two objects for Rectangle class
 rectangle objRec1 = new rectangle(10, 20);
 rectangle objRec2 = new rectangle(6, 9); 
 // Invokes displayDimensions() method to display values 
 System.out.println("\nRectangle1 Details");
 System.out.println("===================");
 objRec1.displayDimensions();
 System.out.println("\nRectangle2 Details");
 System.out.println("===================");
 objRec2.displayDimensions();
 }