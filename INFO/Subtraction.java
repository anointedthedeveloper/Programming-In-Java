public class Subtraction { //Declare Class Subtraction
    //Declare and Initialise Local Variables
    int num1 = 0;
    int num2 = 0;
    
    //Program Method Subtraction
    public int sub(){
        int sum = 0;
        num1 = 10; num2 = 8;
        sum = num1 - num2;

        return sum;
    }

    //Program Method Subtraction 
    public int subNumbers(int number1, int number2){
        int sum = 0;

        sum = number1 + number2;

        return sum;

    }

    public static void main(String[] args) {
        int sumOfNumbers = 0;

        Subtraction subtraction = new Subtraction();

        //do subtraction
        sumOfNumbers = subtraction.sub();

        //print 
        System.out.println("Sum1: " + sumOfNumbers);
    }
}
