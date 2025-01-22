import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;

public class ATMTransaction extends Frame implements ActionListener {

    // GUI Components
    private TextField tfBalance, tfWithdraw, tfDeposit;
    private Button btnCheckBalance, btnWithdraw, btnDeposit, btnExit;
    private Label lblMessage;
    private ATMAccount account;

    public ATMTransaction() {
        // Set up the frame properties
        setTitle("ATM Transaction System");
        setSize(400, 400);
        setLayout(new GridLayout(6, 2, 10, 10));  // Use GridLayout for a structured form

        // Initialize the ATMAccount with an initial balance
        account = new ATMAccount(5000);  // Starting balance of ₹5000

        // Create and add GUI components
        add(new Label("Account Balance:"));
        tfBalance = new TextField(15);
        tfBalance.setEditable(false);  // Balance field is read-only
        tfBalance.setText(account.checkBalance());  // Show initial balance
        add(tfBalance);

        add(new Label("Amount to Withdraw:"));
        tfWithdraw = new TextField(15);
        add(tfWithdraw);

        add(new Label("Amount to Deposit:"));
        tfDeposit = new TextField(15);
        add(tfDeposit);

        // Buttons to perform actions
        btnCheckBalance = new Button("Check Balance");
        btnCheckBalance.addActionListener(this);
        add(btnCheckBalance);

        btnWithdraw = new Button("Withdraw");
        btnWithdraw.addActionListener(this);
        add(btnWithdraw);

        btnDeposit = new Button("Deposit");
        btnDeposit.addActionListener(this);
        add(btnDeposit);

        btnExit = new Button("Exit");
        btnExit.addActionListener(this);
        add(btnExit);

        // Label to display messages (success, error, etc.)
        lblMessage = new Label("");
        lblMessage.setForeground(Color.RED);  // Set message text color to red
        add(lblMessage);

        // Set window visibility and behavior
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);  // Close the application when window is closed
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCheckBalance) {
            // Create a new thread to check balance
            new Thread(new Runnable() {
                @Override
                public void run() {
                    tfBalance.setText(account.checkBalance());  // Update balance field
                    lblMessage.setText("");  // Clear any previous message
                }
            }).start();

        } else if (e.getSource() == btnWithdraw) {
            // Withdraw money in a separate thread
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        double amount = Double.parseDouble(tfWithdraw.getText());
                        String result = account.withdraw(amount);
                        tfBalance.setText(account.checkBalance());  // Update balance after withdrawal
                        lblMessage.setText(result);  // Display withdrawal result
                        tfWithdraw.setText("");  // Clear the withdrawal input field
                    } catch (NumberFormatException ex) {
                        lblMessage.setText("Invalid withdrawal amount. Please enter a number.");
                    }
                }
            }).start();

        } else if (e.getSource() == btnDeposit) {
            // Deposit money in a separate thread
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        double amount = Double.parseDouble(tfDeposit.getText());
                        String result = account.deposit(amount);
                        tfBalance.setText(account.checkBalance());  // Update balance after deposit
                        lblMessage.setText(result);  // Display deposit result
                        tfDeposit.setText("");  // Clear the deposit input field
                    } catch (NumberFormatException ex) {
                        lblMessage.setText("Invalid deposit amount. Please enter a number.");
                    }
                }
            }).start();

        } else if (e.getSource() == btnExit) {
            // Exit the application
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ATMTransaction(); // Create and show the GUI
    }
}
