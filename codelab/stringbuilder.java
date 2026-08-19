package codelab;

public class stringbuilder {
    public static void main(String[] args) {
        //part 1: stringbuilder
        //
        //stringbuilder is used when we need to change a string 
        //several times without creating many new string objects.
        //
        //We will practice:
        // append ()
        // insert ()
        //delete()
        //reverse

        System.out.println("Part 1: StringBuilder ----");

        //Create a StringBuilder object containing "Java".
                StringBuilder str = new StringBuilder("Java");

        System.out.println("Original: " + str);
965+9

        //1: append()
        //append() adds something to the END of the StringBuilder.
        //
        //Example:
        //str.append(" SE");
        //
        //After this statement:
        //Java becomes java se
        //

        str.append(" SE");

        System.out.println("After append(): " + str);

        //
        // 2: append() another value 

        str append(" 7")
    }
}
