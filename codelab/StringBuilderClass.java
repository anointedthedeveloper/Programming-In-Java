/**
 * Java code lab:StringBuilder. String arrays. autoboxing
 * and unboing 
 * learning goals
 * 1.create an modify a string builder object.
 * 2.use append(). insert(). delete(). and reverse().
 * 3.work with string arrays.
 * 4.undestand how to access and modify arrat elements.
 * 5.understand autoboxing
 * 6.understand unboxing
 * 
 * Instructions:
 * Run the program first and observe the output.
 * then work through the todo sections and try changing the values to see what happens
 */
package codelab;

public class StringBuilderClass {
    public static void main(String[] args) {
        //PRT1:STRINGBUILDER
            //
            //StringBuilder is used when we need to change a string
            //several times without creating many new string objects.
            //
            //We will practice:
            //append()
            //insert()
            //delete()
            //reverse()   

            System.out.println("PART1:STRINGBUILDER____");
            //Create a StringBuilder object containing "JAVA".
            StringBuilder str = new StringBuilder("JAVA");
            System.out.println("Original:" + str);
            //1: append()
            //append() adds something to the END of the StringBuilder.
            //
            //Example:
            //str.append(" SE");
            //
            //After this statement:
            //JAVA becomes JAVA SE
            //
            str.append(" SE");

            System.out.println("After append(): " + str);
            
    }
    
}
