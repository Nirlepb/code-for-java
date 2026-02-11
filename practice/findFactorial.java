import java.util.Scanner;
public class findFactorial {
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=s.nextInt();
        System.out.println("the sum:"+factorial(n));
        s.close();

        
    }

}
