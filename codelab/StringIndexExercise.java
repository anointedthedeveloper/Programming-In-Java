//write a program to extract specific characters using an index
package codelab;

public class StringIndexExercise {
    public static void main(String[] args) {
        String original = "Java Exercise";

        //Using charAt() to fetch index positions

        char pos0 = original.charAt(0);
        char pos10 = original.charAt(10);

        System.out.println("The character at position 0 is " + pos0); // J
        System.out.println("The character at position 10 is " + pos10);// I
    }
    
}
