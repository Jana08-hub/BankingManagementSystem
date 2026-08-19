import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();

    void createAccount(int accountNumber, String name, double balance) {

        Account acc = new Account(accountNumber, name, balance);
        accounts.add(acc);

        System.out.println("Account created successfully!");
    }

    Account findAccount(int accountNumber) {

        for (Account acc : accounts) {
            if (acc.accountNumber == accountNumber) {
                return acc;
            }
        }

        return null;
    }

    void deposit(int accountNumber, double amount) {

        Account acc = findAccount(accountNumber);

        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    void withdraw(int accountNumber, double amount) {

        Account acc = findAccount(accountNumber);

        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    void balanceCheck(int accountNumber) {

        Account acc = findAccount(accountNumber);

        if (acc != null) {
            acc.checkBalance();
        } else {
            System.out.println("Account not found.");
        }
    }
}