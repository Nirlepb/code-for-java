import java.util.Scanner;
public class LeapYear{
    static boolean leapyear(int n){
        if(n%400==0){
            return true;
        }
        else{
            if(n%4==0 && n%100!=0){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the year:");
        int year=s.nextInt();
        System.out.println("Is the year leap year:"+leapyear(year));
        
    }
}
