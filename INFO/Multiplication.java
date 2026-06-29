public class Multiplication {//Declare Class Multiplication
    //Declare and Initialise Local Variables
    int num1 = 0;
    int num2 = 0;

    //Program Method Multiplication
    public int multi(){
        int sum = 0;
        num1 = 9; num2 = 8;
        sum = num1 * num2;

        return sum;
    }

    //Program Method multiplication2
    public int multiNumbers(int number1, int number2){
        int sum = 0;
        
        sum = number1 + number2;

        return sum;
    }

    public static void main(String[] args) {
        //initialise sumOfNumbers
        int sumOfNumbers = 0;

        //create new object of the multiplication Class
        Multiplication multiplication = new multiplication();
        
        //do multiplication
        sumOfNumbers = multiplication.multi();

        //print
        System.out.println("Sum1: " + sumOfNumbers);

        //perform multiplication
        sumOfNumbers = multiplication.multiNumbers(7,9);

        //print\=b 
        System.out.println("Sum2: " + sumOfNumbers);
    }
    
}
