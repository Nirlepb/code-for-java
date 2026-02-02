
import java.util.Scanner;
public class DigitSumofThree {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number :- ");
        int num=s.nextInt();
        while(num>=10){
            int sum=0;
            while (num>0) {
                sum+=num%10;
                num=num/10;

                
            }
            num=sum;
        }
        System.out.printf("the sum is %d",num);
        s.close();
    }

}
