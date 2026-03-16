import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("this program is to print simple intrest  :  ");
        System.out.print("enter the principle amount: ");
        int amount=s.nextInt();
        System.out.println("enter the intrest rate :");
        int rate=s.nextInt();
        System.out.println("enter the time in years: ");
        int years=s.nextInt();
    double intrest=amount*rate*years/100;
    System.out.println(intrest+" "+" this the intrest amout");
        s.close();
    }

}
