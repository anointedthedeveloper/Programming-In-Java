public class Multiplication {
    int x;
    int y;

    int multiply() {
        return (x * y);
    }

    int multiplyNumbers(int num1, int num2) {
        x = num1;
        y = num2;
        return multiply();
    }
}
