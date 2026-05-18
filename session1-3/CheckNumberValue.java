
public class CheckNumberValue {

    public static void main(String[] args) {
        int first = 400, second = 700, result;
        result = first + second;
        if (result > 1000) {
            second = second + 100;
        }
        System.out.println("The value of second is " + second);
    }
}
