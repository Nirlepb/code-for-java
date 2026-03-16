import java.util.Scanner;

public class postivecheck{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=s.nextInt();
        if(n>0){
            System.out.println("n is postive");
            
        }
        if(n==0){
            System.out.println("zero");
        }
        if(n<0){
            System.out.println("negative");
        }
        s.close();
    }
}