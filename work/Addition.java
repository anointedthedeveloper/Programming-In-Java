public class Addition {
    int x;
    int y;

    int add() {
        return (x + y);
    }

    int addNumbers(int num1, int num2) {
        x = num1;
        y = num2;
        return add();
    }
}
