package codelab;
//Import the arrays class from the java.util package.
import java.util.Arrays;
//Define a class named ArrayCopy
public class ArrayCopy {
    //the main method where the program execution starts.
    public static void main(String[] args) {
        //declare and initialize an interger array 'my_array'
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        //declare and initialize a new integer array 'new_array' with the same size
        int[] new_array = new int [10];
        //print the source array using arrays.to string() method.
        System.out.println("source Array : " + Arrays.toString(my_array));
        //loop to copy elements from the source array to the new array
        for (int i = 0; i < my_array.length; i++) {
            new_array[i] = my_array[i];
        }
        //print the new array containing copied elements.
        System.out.println("New Array: " + Arrays.toString(new_array));
    }
}
