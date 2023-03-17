package interfacedemo;

public class BankingService {
    SavingAccount savingAccount;
    CreditCardAccount creditCardAccount;
    BankingService(){
        savingAccount = new SavingAccount();
        creditCardAccount = new CreditCardAccount();

    }
    BankingService (SavingAccount savingAccount, CreditCardAccount creditCardAccount){
        this.savingAccount = savingAccount;
        this.creditCardAccount = creditCardAccount;
    }
    double showBalance(){
        return savingAccount.checkBalance();
    }
    double showCreditCarBalance(){
        return creditCardAccount.checkBalance();

    }
    void addMoney(double amount){
        savingAccount.deposit(amount);
    }
    void withdrawMonday(double amount){
        savingAccount.withdraw(amount);
    }
}
