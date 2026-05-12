
      
public class MyInstance {
        // An object that can be an Integer, a String, or null

        Object obj = 42;

        public void myMethod() {
            // A traditional way of checking and printing the type 
//and value of obj
            if (obj instanceof Integer) {
                int i = (Integer) obj; // Explicit casting //required
                System.out.println("Integer value: " + i);
            } else if (obj instanceof String) {
                String s = (String) obj; // Explicit casting required
                System.out.println("String value: " + s);
            } else {
                System.out.println("Unknown value");
            }
        }

        public void myMethod2() {
            // A modern way of checking and printing the type and 
//value of obj using pattern matching for instanceof
            if (obj instanceof Integer i) { // Binding variable i
                System.out.println("Integer value: " + i); // No
//casting required
            } else if (obj instanceof String s) { // Binding 
//variable s
                System.out.println("String value: " + s); // No 
//casting required
            } else {
                System.out.println("Unknown value");
            }
        }

        public static void main(String[] args) {
            MyInstance myInstObj = new MyInstance();
            myInstObj.myMethod();
            myInstObj.myMethod2();
        }
    }