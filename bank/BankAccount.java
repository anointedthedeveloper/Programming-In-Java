import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents a bank account with basic financial operations.
 * Demonstrates: Classes, Instance Variables, Encapsulation, and Constructors.
 */
public class BankAccount {
    // Instance variables (Private for strict Encapsulation)
    private String accountHolder;
    private final String accountNumber; // Final because it shouldn't change after generation
    private double balance;
    private final List<String> transactionHistory;

    /**
     * Constructor to initialize a new Bank Account.
     * @param accountHolder The name of the account owner
     * @param initialBalance The starting balance
     */
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        // Automatically generate a unique 10-digit account number (NUBAN style)
        this.accountNumber = generateAccountNumber();
        // Ensure starting balance isn't negative
        this.balance = Math.max(initialBalance, 0.0);
        this.transactionHistory = new ArrayList<>();
        
        // Record the initial account creation transaction
        addTransaction("Account opened with initial balance: ₦" + String.format("%.2f", this.balance));
    }

    /**
     * Helper method to automatically generate a 10-digit account number string.
     */
    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        
        // Ensure the first digit isn't 0 to maintain a true 10-digit length
        sb.append(random.nextInt(9) + 1); 
        
        for (int i = 0; i < 9; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    // ==========================================
    // Core Functions (Methods)
    // ==========================================

    /**
     * Function 1: Deposit Money
     * Adds a positive amount to the current balance.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            addTransaction("Deposited: ₦" + String.format("%.2f", amount));
            System.out.printf("Successfully deposited ₦%.2f\n", amount);
        } else {
            System.out.println("Error: Deposit amount must be greater than zero.");
        }
    }

    /**
     * Function 2: Withdraw Money
     * Deducts an amount if funds are sufficient and the amount is valid.
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
        } else if (amount > this.balance) {
            System.out.println("Error: Insufficient funds. Transaction cancelled.");
        } else {
            this.balance -= amount;
            addTransaction("Withdrew: ₦" + String.format("%.2f", amount));
            System.out.printf("Successfully withdrew ₦%.2f\n", amount);
        }
    }

    /**
     * Function 3: Show Transaction History
     * Loops through and displays all recorded actions on the account.
     */
    public void displayTransactionHistory() {
        System.out.println("\n--- Transaction History for " + accountHolder + " (" + accountNumber + ") ---");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions recorded yet.");
        } else {
            for (int i = 0; i < transactionHistory.size(); i++) {
                System.out.println((i + 1) + ". " + transactionHistory.get(i));
            }
        }
    }

    /**
     * Function 4: Display Balance
     * Prints the current state of the balance in Naira.
     */
    public void displayBalance() {
        System.out.printf("Current Account Balance: ₦%.2f\n", this.balance);
    }

    // Helper method to internalize transaction logging
    private void addTransaction(String message) {
        transactionHistory.add(message);
    }

    // ==========================================
    // Getters & Setters
    // ==========================================

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}