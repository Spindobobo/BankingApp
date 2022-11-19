import java.util.Scanner;

public class Transactions {
    private double balance;
    private double deposit;
    private double withdraw;

    //private Account inAccount;


    public Transactions(int balance, int deposit, int withdraw) {
        this.balance = balance;
        this.deposit = deposit;
        this.withdraw = withdraw;

    }

    public double getBalance() {
        return this.balance;
    }

    public double getDeposit() {
        return this.deposit;
    }

    public double getWithdraw() {
        return this.withdraw;
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        double amount;
        do {
            System.out.println("Enter the amount to deposit: ");
            amount = scanner.nextDouble();
            if (amount < 0)
                System.out.println("Amount must be greater than 0");
            else
                this.balance += amount;
            System.out.println("Your new balance is: " + this.balance);
        } while (amount < 0);
        scanner.nextLine();
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        double amount;
        do {
            System.out.println("Enter the amount to withdraw: ");
            amount = scanner.nextDouble();
            if (amount < 0)
                System.out.println("Amount must be greater than 0");
            else if (amount > this.balance)
                System.out.println("Amount must not be greater than balance of " + this.balance);
            else
                this.balance -= amount;
            System.out.println("Your new balance is: " + this.balance);
        } while (amount < 0);
        scanner.nextLine();
    }
}
