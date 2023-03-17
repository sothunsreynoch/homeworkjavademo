package interfacedemo;

public class CreditCardAccount implements Account {
    private double balance;
    private float interestRates;
    private double limitCredit;
    CreditCardAccount(){
        balance = 10;
        interestRates = 30;
        limitCredit = 100;
    }
    public void withdraw(double amount) {
        if(amount<= limitCredit){
            if(amount<= balance){
                balance-=amount;
            }else {
                System.out.println("Insufficent balance !!!");
            }
        }else {
            System.out.println("Amount exceed the limit !!!");
        }
    }
    public void deposit(double amount){ balance+= amount; }
    public double checkBalance() {return balance; }
    public double calculateInterest() { return balance * (interestRates/100);}
}
