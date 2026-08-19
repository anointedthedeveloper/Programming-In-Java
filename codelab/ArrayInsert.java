package codelab;
//import the arrays class from the java.util package
import java.util.Arrays;
//define a class named Array Insert
public class ArrayInsert {
    //the main method where the program execution starts
    public static void main(String[] args) {
        //declare and initialize an integer array 'my_array'.
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        //define the position where the new element will be inserted
        int Index_position = 2;

        //Define the value of the new element to be inserted.
        int newValue = 5;

        //print the original array using Arrays.toString () method.
        System.out.println("Original Array : " + Arrays.toString(my_array));

        //loop to shift elements to make space for the new element.
        for (int i = my_array.length - 1; i > Index_position; i--) {
            my_array[i] = my_array[i -1];
        }

        //insert the new element at the specified position.
        my_array[Index_position] = newValue;

        //Print the modified array with the new element.
        System.out.println("New Array: " + Arrays.toString(my_array));
    }
}
