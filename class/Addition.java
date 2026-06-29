public class Addition { //Declare Class Addition
    //Declare and Initialise Local Variables
    int num1 = 0;
    int num2 = 0;

    //Program Method Addition
    public int add(){
        int sum = 0;
        num1 = 4; num2 = 7;
        sum = num1 + num2;

        return sum;
    }

    //Program Method Addition2
    public int addNumbers(int number1, int number2){
        int sum = 0;
        
        sum = number1 + number2;

        return sum;
    }

    public static void main(String[] args) {
        //initialise sumOfNumbers
        int sumOfNumbers = 0;

        //create new object of the Addition Class
        Addition addition = new Addition();
        
        //do addition
        sumOfNumbers = addition.add();

        //print
        System.out.println("Sum1: " + sumOfNumbers);

        //perform addition
        sumOfNumbers = addition.addNumbers(7,9);

        //print
        System.out.println("Sum2: " + sumOfNumbers);
    }
}
