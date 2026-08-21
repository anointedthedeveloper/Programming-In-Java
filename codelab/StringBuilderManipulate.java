p ackage codelab;

public class StringBuilderManipulate {
    public static void main(String[] args) {
        //Instantiate with a default extra capacity of 16 characters

        StringBuilder sb = new StringBuilder("hi");

        //1.After characters in place

        sb.setCharAt(0, 's'); //si

        //2. Insert characters or substrings at a specific index

        sb.insert(1, "o"); //soi

        //3. Append data to the end 
        sb.append("ftware"); //software

        System.out.println("Final Result: " + sb.toString());
    }
}
