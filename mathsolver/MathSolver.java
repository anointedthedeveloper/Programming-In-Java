package mathsolver;

public class MathSolver {

    public int solveMath(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathSolver s = new MathSolver();

        int num1 = 8;
        int num2 = 2;

        System.out.println(num1 + " + " + num2 + " = " + s.solveMath(num1, num2));
    }
}