public class Transactions {
    private int balance;
    private int deposit;
    private int withdrawal;


    public Transactions(int balance, int deposit, int withdrawal) {
        this.balance = 0;
        this.deposit = deposit;
        this.withdrawal = withdrawal;

    }


    public int getBalance() {
        return this.balance;
    }

    public int getDeposit() {
        return deposit;
    }

    public int getWithdrawal() {
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
