
public class CheckMarks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalMarks = 59;
        /* Tests the value of totalMarks and accordingly transfers control to the 
else if statement
         */
        if (totalMarks >= 90) {
            System.out.println("Grade = A+");
        } else if (totalMarks >= 60) {
            System.out.println("Grade = A");
        } else if (totalMarks >= 40) {
            System.out.println("Grade = B");
        } else if (totalMarks >= 30) {
            System.out.println("Grade = C");
        } else {
            System.out.println("Fail");
        }
    }
}
