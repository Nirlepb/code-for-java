

public class  BankSystem{
    public static void main(String[] args){
        BankAccount bc=new BankAccount("nirlep","h101",5000);
         bc.displayAccountDetails();

        bc.deposit(2000);
        bc.withdraw(1000);
        bc.withdraw(10000);
    }
    
}
