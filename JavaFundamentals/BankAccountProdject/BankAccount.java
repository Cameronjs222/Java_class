public class BankAccount {
    // member Variables
    private double checkingBalance;
    private double savingBalance;
    private long accountNumber;
    private double totalBalance;

    public static double numberOfAccounts = 0;
    public static double moneyStoredTotal = 0;

    // Constructor
    public BankAccount() {
        this.accountNumber = createAccountNumber();
        this.checkingBalance = 0;
        this.savingBalance = 0;
        this.totalBalance = 0;
        numberOfAccounts += 1;
    }

    // methods
    public void addToAccount(double deposit, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += deposit;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingBalance += deposit;
        } else {
            System.out.println("Invalid account type. Please specify either 'checking' or 'savings'.");
        }
        moneyStoredTotal += deposit;
        totalBalance += deposit;
    }

    public long createAccountNumber() {
        long accountNumber = (long) (Math.random() * 1000000000 + 1000000000);
        return accountNumber;
    }

    public void withdrawFromAccount(double withdraw, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance -= withdraw;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingBalance -= withdraw;
        } else {
            System.out.println("Invalid account type. Please specify either 'checking' or 'savings'.");
        }
        moneyStoredTotal -= withdraw;
        totalBalance -= withdraw;
    }

    public void checkBalance() {
        System.out.printf("%s Savings account balance is at $%s %n",accountNumber ,savingBalance);
        System.out.printf("%s Checking account balance is at $%s %n",accountNumber , checkingBalance);
        System.out.printf("Your total account balance is at $%s %n", totalBalance);
    }

    // Getters Setters
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public static double getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static void setNumberOfAccounts(double numberOfAccounts) {
        BankAccount.numberOfAccounts = numberOfAccounts;
    }

    public static double getMoneyStoredTotal() {
        return moneyStoredTotal;
    }

    public static void setMoneyStoredTotal(double moneyStoredTotal) {
        BankAccount.moneyStoredTotal = moneyStoredTotal;
    }

}
