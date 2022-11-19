import java.util.Scanner;

/**
 * Defining the problem:
 * Build a basic banking application with simple primary functions like account database, balance, deposit and withdraw.
 * Later, I should add new functions to the older ones as I progress through the development process, like an UI.
 * Finally, maybe implement SQL databases or APIs.

 * Steps:
 * Create a class responsible for a database of bank accounts.
 *   (x) Create variable for a name.
 *   (x) Create variable for phone number.
 *   (x) Create variable for e-mail.
 *   (x) Create method to generate a random account number.
 *   (x) Test to see if it's functioning.

 * Create a class responsible for transactions generally, including a way to verify balance, to deposit and to withdraw money.
 *   (x) Create a variable and a method to verify balance.
 *   (x) Create a variable and a method to do a deposit.
 *   (x) Create a variable and a method to do a withdrawal.
 *   (x) Test to see if it's functioning.

 * Use the main method to create the app and execute all functions.
 *   (x) Create an UI using the terminal
 *   (x) Create a method to execute the function of balance.
 *   (x) Create a method to execute the function of deposit.
 *   (x) Create a method to execute the function of withdraw.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("Rafael Spindola","(61) 993187055","rafa.spindola@gmail.com");
        Transactions transactions = new Transactions(0,0,0);

        Account curUser;
        while (true) {
            Main.printUserMenu(account,transactions,scanner);
        }
    }

    public static void printUserMenu(Account account, Transactions transactions, Scanner scanner) {
        int choice;
        do {
            System.out.printf("\nWelcome " + account.getName() + ", what would you like to do?\n");
            System.out.println("  1) View balance");
            System.out.println("  2) Withdraw");
            System.out.println("  3) Deposit");
            System.out.println("  4) Quit");
            System.out.println();
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please choose 1-3");
            }

        } while (choice < 1 || choice > 4);

        switch (choice) {
            case 1:
                transactions.getBalance();
                System.out.println("Your balance is " + transactions.getBalance());
                break;
            case 2:
                transactions.withdraw();
                break;
            case 3:
                transactions.deposit();
                break;
            case 4:
                scanner.close();
                break;
        }

        if (choice != 4) {
            Main.printUserMenu(account,transactions,scanner);
        }
    }
}