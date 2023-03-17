package interfacedemo;

public class BankingServiceII {
    private Account account;
    public BankingServiceII(Account account){
        this.account = account;
    }
    public double showBalance(){
        return account.checkBalance();
    }
    public void withdrawMonday(double amount){
        account.withdraw(amount);
    }
    public void deposit(double amount){
        account.deposit(amount);
    }
}
