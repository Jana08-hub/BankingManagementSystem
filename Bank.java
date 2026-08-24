import java.util.HashMap;

public class Bank {

    HashMap<Integer, Account> accounts = new HashMap<>();

    public void createAccount(int accountNumber, String name, double balance) {

        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists.");
        } else {
            Account account = new Account(accountNumber, name, balance);
            accounts.put(accountNumber, account);
            System.out.println("Account created successfully.");
        }
    }

    public void deposit(int accountNumber, double amount) {

        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNumber, double amount) {

        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(int accountNumber) {

        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.checkBalance();
        } else {
            System.out.println("Account not found.");
        }
    }
}