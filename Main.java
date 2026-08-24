import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        int choice;

        do {

            System.out.println("\n===== BANKING MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Account Number: ");
                    int accountNumber = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    bank.createAccount(accountNumber, name, balance);

                    break;

                case 2:

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();

                    bank.deposit(accountNumber, depositAmount);

                    break;

                case 3:

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = sc.nextDouble();

                    bank.withdraw(accountNumber, withdrawAmount);

                    break;

                case 4:

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    bank.checkBalance(accountNumber);

                    break;

                case 5:

                    System.out.println("Thank you for using Banking Management System.");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}