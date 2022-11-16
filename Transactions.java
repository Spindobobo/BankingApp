public class Transactions {
    private double balance;
    private double deposit;
    private double withdrawal;

    //private Account inAccount;


    public Transactions(int balance, int deposit, int withdrawal) {
        this.balance = 0;
        this.deposit = deposit;
        this.withdrawal = withdrawal;

    }


    public double getBalance() {
        return this.balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public void deposit(int depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + "USD made. New balance is: " + this.balance + "USD.");
    }

    public void withdrawal(int withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0)
            System.out.println("Only " + this.balance + "USD available. Withdrawal not processed.");
        else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + "USD processed. Remaining balance " + this.balance + "USD.");
        }
    }
}
