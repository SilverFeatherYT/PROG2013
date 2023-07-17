public class SavingsAccount extends BankAccount {
    private double interestRate;
    private double interest;

    public SavingsAccount(int accNumber, double accBalance, String accHolderName, double interestRate) {
        super(accNumber, accBalance, accHolderName);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        interest = getAccBalance() * interestRate / 100;
        deposit(interest);
    }

    @Override
    public void displayAccInfo() {
        super.displayAccInfo();
        System.out.println("The interest is " + interestRate + "%, it will be RM" + interest);
    }
}