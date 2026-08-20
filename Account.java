public class Account {

    int accountNumber;
    String name;
    double balance;

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
            System.out.println("Current Balance: Rs." + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }
}