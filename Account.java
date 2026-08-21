public class Account {

    int accountNumber;
    String name;
    double balance;

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } 
        else {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
            System.out.println("Withdraw Amount : Rs." + amount);
            System.out.println("Remaining Balance : Rs." + balance);
        }
    }
}