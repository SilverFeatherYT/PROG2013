public class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    private double overdraftAmount;
    private double charge;

    public CurrentAccount(int accNumber, double accBalance, String accHolderName, double overdraftLimit) {
        super(accNumber, accBalance, accHolderName);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= accBalance + overdraftLimit) {
            if (amount > accBalance) {
                overdraftAmount = amount - accBalance;
                charge = overdraftAmount * 0.03;
                super.withdraw(accBalance);
                overdraftLimit -= (overdraftAmount + charge);
            } else {
                accBalance -= amount;
            }
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    @Override
    public void displayAccInfo() {
        super.displayAccInfo();
        System.out.println("Overdraft RM" + overdraftAmount + ", will be charge as RM" + charge);
        System.out.println("Current Overdraft Limit: RM" + overdraftLimit);
    }
}