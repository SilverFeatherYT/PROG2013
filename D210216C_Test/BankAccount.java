public class BankAccount {
    private int accNumber;
    protected double accBalance;
    private String accHolderName;

    public BankAccount(int accNumber, double accBalance, String accHolderName) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
        this.accHolderName = accHolderName;
    }

    public void deposit(double amount) {
        accBalance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= accBalance) {
            accBalance -= amount;
        } else {
            System.out.println("Not enough funds");
        }
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void displayAccInfo() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Balance: RM" + accBalance);
    }
}