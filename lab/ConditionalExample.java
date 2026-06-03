public class ConditionalExample {
    public static void main(String[] args) {
        int score = 75;

        // if statement
        if (score > 50) {
            System.out.println("You passed.");
        }

        // if-else statement
        if (score >= 80) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Keep improving.");
        }

        // if-else-if statement
        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 70) {
            System.out.println("Grade B");
        } else if (score >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}