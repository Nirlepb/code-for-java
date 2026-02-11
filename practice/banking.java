import java.util.Scanner;

public class banking {
     static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        
        double balance=0;
        boolean isworking=true;
        int choice;
        while (isworking) {
            System.out.println("*******************");
        System.out.println("BANKING PROBLEM");
        System.out.println("*******************");
        System.out.println("1.show blance");
        System.out.println("2.deposite");
        System.out.println("3.withdraw");
        System.out.println("4.exit");
        System.out.println("enter the choice:(1-4) ");
        choice=s.nextInt();
        switch (choice) {
            case 1 -> showbalance(balance);
            case 2 -> balance+=deposite();
            case 3 -> balance-=withdraw(balance);
            case 4 -> isworking=false;
            default->System.out.println("enter a correct number");
        }
            
        }
        
               
        }
        
        static void showbalance( double balance){
            System.out.printf("$%.2f\n",balance);
            
        }
        static double deposite(){
            System.out.println("enter the amout to deposite");
            double amount=s.nextDouble();
            if (amount<0) {
                System.out.println("amout cannot be negtive");
                return 0;
            } else{
                return amount;

            }
            

        }
        static double withdraw(double balance){
            double amount;
            System.out.println("enter the amount: ");
            amount=s.nextDouble();
            if (amount>balance) {
                System.out.println("insufficent blance: ");
                return 0;
                
            }else{return amount;}
            
        }
    }


