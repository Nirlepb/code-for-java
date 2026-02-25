public class BankAccount {
 private String accountNumber;
 private String accountHolder;
 private double balance;
 BankAccount(){
    accountNumber="donot know";
    accountHolder="unknowen";
    balance=0;
 }
 BankAccount(String accountNumber,
  String accountHolder,
  double balance){
    this.accountNumber=accountNumber;
    this.accountHolder=accountHolder;
    this.balance=balance;
  }

public void deposit(double amount){
    if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }

}
public void withdraw(double amount){
    if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
        else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    
}
public void displayAccountDetails(){
    System.out.println("----- Account Details -----");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
        System.out.println();
    
}
}

