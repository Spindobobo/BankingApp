import java.util.Scanner;

/**
 * Defining the problem:
 * Build a basic banking application with simple primary functions like database, deposit and withdraw.
 * Later, I should add new functions to the older ones as I progress through the development process, like an UI.
 * Finally, maybe implement SQL databases or APIs.
 *
 * Steps:
 * Create a class responsible for a database of bank accounts.
 * Create a class responsible for transactions generally, including a way to verify balance, to deposit and to withdraw money.
 * Use the main method to create the app and execute all functions.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("Rafael Spindola","(61) 993187055","rafa.spindola@gmail.com");

        Account curUser;
        while (true) {
            Main.printUserMenu(account,scanner);
        }

//        Transactions transactions = new Transactions(0,0,0);
//        System.out.println("Your balance is: " + transactions.getBalance());
//        transactions.deposit(1000);
    }

    public static void printUserMenu(Account account,Scanner scanner) {
        int choice;
        do {
            System.out.printf("Welcome " + account.getName() + ", what would you like to do?\n");
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

    }




}