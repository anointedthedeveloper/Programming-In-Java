package SolveMaths;
public class MathSolver {
    public static void main(String[] args) {

        String[] formulas = {
            "Area of Rectangle = Length * Width",
            "Perimeter of Rectangle = 2(Length + Width)",
            "Area of Circle = πr²",
            "Circumference of Circle = 2πr",
            "Area of Triangle = 1/2 * Base * Height"
        };

        System.out.println("MATH FORMULAS");
        System.out.println("-------------");

        for (int i = 0; i < formulas.length; i++) {
            System.out.println(formulas[i]);
        }
    }
}