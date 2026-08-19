package session5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListDemo {
    //create array list instance
    ArrayList marks = new ArrayList (); //line 1
    /**
     * stores mark in arraylist
     * 
     * @return void
     */

    public void storeMarks() {
        System.out.println("Storing marks please wait....");
        marks.add(67);//line 2
        marks.add(50);
        marks.add(45);
        marks.add(75);
    }
    /**
     * display marks from arraylist
     * 
     * @return void
     */

    public void displayMarks() {
        System.out.println("Marks are:");
        //iterating the list using for loops

        System.out.println("Iterating arraylist using for loops:");
        for (int i = 0; i<marks.size(); i++) {
            System.out.println(marks.get(i));
        }
        System.out.println("-------------");
        //Iterate the loop using iterator interface
        Iterator imarks= marks.iterator(); //line 3
        System.out.println("Iterating ArrayList using Iterator:");
        while (imarks.hasNext()) { // line 4
            System.out.println(imarks.next()); // line 5
        }
        System.out.println("-------------------------------------");
        // Sort the list
        Collections.sort(marks); // line 6
        System.out.println("Sorted list is: " + marks);
    
    }
        /**
        * @param args the command line arguments
        */
        public static void main(String[] args) {
        //Instantiate the class OneDimension
        ArrayListDemo obj = new ArrayListDemo(); // line 7
        //Invoke the storeMarks() method
        obj.storeMarks();
        //Invoke the displayMarks() method
        obj.displayMarks();
}
}
