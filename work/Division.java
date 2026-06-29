public class Division {
    int x;
    int y;

    int divide() {
        return (x / y);
    }

    int divideNumbers(int num1, int num2) {
        x = num1;
        y = num2;
        return divide();
    }
}
