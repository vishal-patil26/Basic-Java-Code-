public class ATMAccount {
    private double balance;

    // Constructor to initialize the balance
    public ATMAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance must be greater than zero.");
        }
    }

    // Synchronized method to check the balance (not really necessary, but good practice in a multi-threaded environment)
    public synchronized String checkBalance() {
        return "₹" + balance;  // Return balance with ₹ symbol
    }

    // Synchronized method to withdraw money
    public synchronized String withdraw(double amount) {
        if (amount <= 0) {
            return "Amount to withdraw must be greater than zero.";
        } else if (amount > balance) {
            return "Insufficient funds. Your balance is ₹" + balance;
        } else {
            balance -= amount;
            return "You have successfully withdrawn ₹" + amount + ".\nUpdated Balance: ₹" + balance;
        }
    }

    // Synchronized method to deposit money
    public synchronized String deposit(double amount) {
        if (amount <= 0) {
            return "Deposit amount must be greater than zero.";
        } else {
            balance += amount;
            return "You have successfully deposited ₹" + amount + ".\nUpdated Balance: ₹" + balance;
        }
    }
}
