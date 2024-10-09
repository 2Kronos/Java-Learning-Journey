import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Question9 {
    String accountNumber;
    String accountHolderName;
    double balance;

    public Question9(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        Question9 account1 = new Question9("123456", "John Doe", 1000.0);
        Question9 account2 = new Question9("789012", "Jane Smith", 1500.0);

        account1.deposit(500.0);
        account2.withdraw(200.0);

        account1.displayBalance();
        account2.displayBalance();

        // Write account details to a file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("account_details.txt"));
            writer.write("Account 1 Details:\n");
            writer.write("Account Number: " + account1.accountNumber + "\n");
            writer.write("Account Holder: " + account1.accountHolderName + "\n");
            writer.write("Balance: $" + account1.balance + "\n\n");

            writer.write("Account 2 Details:\n");
            writer.write("Account Number: " + account2.accountNumber + "\n");
            writer.write("Account Holder: " + account2.accountHolderName + "\n");
            writer.write("Balance: $" + account2.balance + "\n");

            writer.close();
            System.out.println("Account details written to account_details.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
