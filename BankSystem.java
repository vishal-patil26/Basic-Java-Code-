import java.util.Scanner;

class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance must be greater than zero.");
        }
    }

    // Method to check the balance
    public void checkBalance() {
        System.out.println("Current balance: Rs." + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount to withdraw must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Your balance is Rs." + balance);
        } else {
            balance -= amount;
            System.out.println("You have successfully withdrawn $" + amount);
            checkBalance();
        }
    }

    // Method to deposit money (not asked for but can be added for completeness)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have successfully deposited Rs." + amount);
            checkBalance();
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank!");

        // Set initial balance (could be from user input or a fixed value)
        System.out.print("Enter initial balance: Rs.");
        double initialBalance = scanner.nextDouble();
        
        // Create a BankAccount object with the initial balance
        BankAccount account = new BankAccount(initialBalance);

        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: Rs.");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 3:
                    System.out.println("Thank you for using our bank system. Goodbye!");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
