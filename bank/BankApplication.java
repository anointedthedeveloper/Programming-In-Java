import java.util.Scanner;

/**
 * Handles user interaction and runs the main loop of the application.
 */
public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the Bank Setup ===");
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Initial Deposit Amount (₦): ");
        double initialDeposit = scanner.nextDouble();

        // Instantiate the object without manually passing an account number
        BankAccount userAccount = new BankAccount(name, initialDeposit);

        System.out.println("\n[System Notification] Account successfully created!");
        System.out.println("Account Holder: " + userAccount.getAccountHolder());
        System.out.println("Generated Account Number: " + userAccount.getAccountNumber());
        System.out.printf("Opening Balance: ₦%.2f\n", userAccount.getBalance());

        boolean running = true;
        
        // Application loop
        while (running) {
            System.out.println("\n=================================");
            System.out.println("         BANK MAIN MENU          ");
            System.out.println("=================================");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Show Transaction History");
            System.out.println("4. Display Balance");
            System.out.println("5. Exit Application");
            System.out.print("Please choose an option (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit (₦): ");
                    double depAmount = scanner.nextDouble();
                    userAccount.deposit(depAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw (₦): ");
                    double withAmount = scanner.nextDouble();
                    userAccount.withdraw(withAmount);
                    break;
                case 3:
                    userAccount.displayTransactionHistory();
                    break;
                case 4:
                    userAccount.displayBalance();
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for choosing our bank. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection. Please enter a valid menu number.");
            }
        }
        
        scanner.close();
    }
}