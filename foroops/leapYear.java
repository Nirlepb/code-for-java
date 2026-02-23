import java.util.Scanner;

public class leapYear {
    public static boolean year(int a){
        if(a%400==0){
            return true;

        }
        else if(a%4==0&& a%100!=0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the year");
        int y= s.nextInt();
        System.out.println("the year is leap"+ year(y));
        s.close();
    } 
    
}
