
public class BankAccountTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BankAccount User1 = new BankAccount();
        BankAccount User2 = new BankAccount();

        User1.addToAccount(500, "checking");
        User1.checkBalance();
        User1.addToAccount(120, "savings");
        User1.withdrawFromAccount(175, "checking");
        User1.checkBalance();

        User2.checkBalance();

    }

}
