

public class BankAccount {
    private String accountNumber; 
    private String accountHolder; 
    private    double  balance;
    BankAccount(){
        this.accountHolder="nirlep";
        this.accountNumber="nitleirhgbe";
        this.balance=9990;

    }
    BankAccount(String accountNumber,String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;

    }
    double deposite(double amount){
        balance+=amount;
        return balance;
    }
    double withdraw(double amount){
        balance-=amount;
        return balance;
    }
    void displayAccountDetails(){
        System.out.println(accountHolder);
        System.out.println(accountNumber);
        System.out.println(balance);
    }


}

