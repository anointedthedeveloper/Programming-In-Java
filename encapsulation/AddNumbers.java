//package encapsulation;

public class AddNumbers {
    int x = 10;
    int y = 20;

    int add() {
        return (x+y); // 30
    }

    int addNumbers(int num1, int num2) {
        x = num1;
        y = num2;

        return add();

    }
}
