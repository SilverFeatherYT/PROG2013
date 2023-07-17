public class Main {
    public static void main(String[] args) {
        System.out.println("-------SilverFeather Current Bank Account-------");
        BankAccount bankAccount = new BankAccount(43243923, 10000.0, "SilverFeather");
        bankAccount.displayAccInfo();

        System.out.println("-------SilverFeather after deposit 500-------");
        bankAccount.deposit(500.0);
        bankAccount.displayAccInfo();

        System.out.println("-------SilverFeather after withdraw 200-------");
        bankAccount.withdraw(200.0);
        bankAccount.displayAccInfo();
        System.out.println("");

        System.out.println("-------Ahweebx Current Savings Account-------");
        SavingsAccount savingsAccount = new SavingsAccount(353453232, 6000.0, "Ahweebx", 5.0);
        savingsAccount.displayAccInfo();

        System.out.println("-------Ahweebx after get 5% interest-------");
        savingsAccount.calculateInterest();
        savingsAccount.displayAccInfo();
        System.out.println("");

        System.out.println("-------ZhengYu Current Account-------");
        CurrentAccount currentAccount = new CurrentAccount(454354354, 200.0, "ZhengYu", 1000.0);
        currentAccount.displayAccInfo();

        System.out.println("-------ZhengYu withdraw 200 overlimit-------");
        currentAccount.withdraw(400.0);
        currentAccount.displayAccInfo();
    }
}
