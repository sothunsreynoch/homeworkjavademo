package interfacedemo;

public class Main {
    public static void main(String[] args) {
        BankingServiceII creditAccount = new BankingServiceII(new CreditCardAccount());
        creditAccount.deposit(10000);
        System.out.println("Credit Balance : "+creditAccount.showBalance()+"$");

        BankingServiceII savingAccount = new BankingServiceII(new SavingAccount());
        savingAccount.deposit(500);
        System.out.println("Saving Balance : "+savingAccount.showBalance()+"$");
    }
}
