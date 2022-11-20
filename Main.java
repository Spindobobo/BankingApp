import java.util.Scanner;

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
                System.out.println("Invalid choice. Please choose 1-4");
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