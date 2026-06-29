public class Numbers {
    public static void main(String[] args) {
        // Addition
        Addition addition = new Addition();
        int add = addition.addNumbers(10, 5);
        System.out.println("Addition: " + add);

        // Subtraction
        Subtraction subtraction = new Subtraction();
        int subtract = subtraction.subtractNumbers(10, 5);
        System.out.println("Subtraction: " + subtract);

        // Multiplication
        Multiplication multiplication = new Multiplication();
        int multiply = multiplication.multiplyNumbers(10, 5);
        System.out.println("Multiplication: " + multiply);

        // Division
        Division division = new Division();
        int divide = division.divideNumbers(10, 5);
        System.out.println("Division: " + divide);
    }
}
