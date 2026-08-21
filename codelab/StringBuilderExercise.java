// reverse an input string efficiently without instantiating dozens of temporary immutable objects in the heap
package codelab;

public class StringBuilderExercise {
    public static void main(String[] args) {
        String input = "W3resource";

        //pass the string to the mutable builder constructor 
        StringBuilder sb = new StringBuilder(input);
        sb.reverse(); //perform in-place mutation

        System.out.println("Reversed String: " + sb.toString()); //ecruoser3W
    }
}
