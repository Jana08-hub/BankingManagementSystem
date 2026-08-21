import java.util.HashMap;

public class Bank {

    HashMap<Integer, Account> accounts = new HashMap<>();

    public void createAccount(int accountNumber, String name, double balance) {

        Account account = new Account(accountNumber, name, balance);
        accounts.put(accountNumber, account);

        System.out.println("Account created successfully.");
    }

    public void withdraw(int accountNumber, double amount) {

        if (accounts.containsKey(accountNumber)) {

            Account account = accounts.get(accountNumber);
            account.withdraw(amount);

        } else {

            System.out.println("Account not found.");
        }
    }
}