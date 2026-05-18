public class operatorsexample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
 
        System.out.println("additional Operators"); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        boolean x = true;
        boolean y = false;

        System.out.println("logical Operators"); // Logical AND
        System.out.println("x && y = " + (x && y)); // Logical OR
        System.out.println("x || y = " + (x || y)); // Logical NOT
        System.out.println("!x = " + (!x));

        int c = 50;
        System.out.println("relational Operators"); // Greater than

        c += 5; // Increment operator
        System.out.println("c += 5: " + c); // Decrement operator

        c -= 3; // Decrement operator
        System.out.println("c -= 3: " + c); // Compound assignment operator

        int d = 7;

        System.out.println("decrement and decrement operators"); // Post-increment
        System.out.println("d++ = " + d);

        d--;
        System.err.println("d-- : " + d); // Post-decrement
    }
}
