package abstractdemo;

public class Calculator {

    public static void main(String[] args) {

        Shape objShape;
        String shape = "circle";
        float value = 60;

        switch (shape) 

            case "circle":
                objShape = new Circle();
                objShape.calculate(value);
                break;

            case "rectangle":
                objShape = new Rectangle();
                objShape.calculate(value);
                break;

            case "triangle":
                objShape = new Triangle();
                objShape.calculate(value);
                break;
        }
    }
}