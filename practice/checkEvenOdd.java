import java.util.*;

public class checkEvenOdd {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("enter the number  ");
        int num;
        num=s.nextInt();
        if(num%2==0){
            System.out.println("///Even///");
        }
        else{
            System.out.println("+++Odd+++");
        }
        System.out.println("===Done===");
        s.close();

    }

}
