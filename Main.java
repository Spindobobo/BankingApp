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
        Transactions transactions = new Transactions(0,0,0);
        System.out.println("Your balance is: " + transactions.getBalance());
        transactions.deposit(1000);
    }

}