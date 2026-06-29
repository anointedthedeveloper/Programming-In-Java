public class Subtraction {
    int x;
    int y;

    int subtract() {
        return (x - y);
    }

    int subtractNumbers(int num1, int num2) {
        x = num1;
        y = num2;
        return subtract();
    }
}
