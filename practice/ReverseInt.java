import java.util.*;
public class ReverseInt {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the orignal number :");
        int orginal=in.nextInt();
        int digit;
        int reversed0=0;
        while (orginal>0) {
            digit=orginal%10;
            reversed0=(reversed0*10)+digit;
            orginal=orginal/10;

            
        }
        System.out.println("the reversed number :" );
        System.out.println(reversed0);
        in.close();
    }

}
